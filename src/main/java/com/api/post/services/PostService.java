package com.api.post.services;

import com.api.post.domain.Post;
import com.api.post.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    //retorna todos os posts presentes no banco de dados
    public List<Post> findAll(){
        return postRepository.findAll();
    }

    //retorna um post apenas, localizado por um ID
    public Post findById(Long id){
        return postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));
    }

    //add um post ao banco de dados
    public Post insert(Post post){
        return postRepository.save(post);
    }

    //deleta um post do banco de dados
    public void delete(Long id){
        findById(id);
        postRepository.deleteById(id);
    }

    //atualiza um post do banco de dados
    public Post update(Post post){
        Post newPost = findById(post.getId());
        newPost.setTitle(post.getTitle());
        newPost.setContent(post.getContent());
        newPost.setDate(post.getDate());
        return postRepository.save(newPost);
    }
}
