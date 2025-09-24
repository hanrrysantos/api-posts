package com.api.post.config;

import com.api.post.domain.Post;
import com.api.post.repositories.PostRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Component
public class Instantiation implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        entityManager.createNativeQuery("TRUNCATE TABLE tb_post RESTART IDENTITY CASCADE").executeUpdate();

        postRepository.deleteAll();

        Post p1 = new Post(null, "Viagem para Paris", "Passeando em familia no Arco do Triunfo",
                sdf.parse("2025-08-01"));

        Post p2 = new Post(null, "Viagem para Rio de Janeiro", "Passeio no Morro da Urca",
                sdf.parse("2025-08-01"));

        Post p3 = new Post(null, "Viagem para BH", "Assistindo jogo do galo na arena mrv",
                sdf.parse("2025-08-01"));

        postRepository.saveAll(Arrays.asList(p1, p2, p3));
    }
}
