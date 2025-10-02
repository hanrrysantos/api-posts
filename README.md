# 🚀 API Posts: Seu Diário de Bordo Digital (Spring Boot 3) ✍️

Bem-vindo(a) à **API Posts**! Este projeto é um backend robusto e simples, construído com as melhores práticas do Spring Boot, para gerenciar seus posts, artigos, ou qualquer conteúdo que você queira compartilhar. É a base perfeita para o seu blog, feed de notícias ou rede social!

## ✨ Destaques Tecnológicos

Construído com o poder do ☕️ Java e a mágica do Spring Boot:

* **Framework:** Spring Boot **3.5.6** (Fácil, rápido e eficiente!).
* **Linguagem:** Java **21** (A versão LTS mais recente!).
* **Persistência:** Spring Data JPA (Gerencie dados como um mestre Jedi!).
* **Banco de Dados:** PostgreSQL (Driver configurado para alta performance).
* **Auxílio:** Lombok (Diga adeus ao código boilerplate! 🧙‍♂️).

## 🗃️ Modelo de Dados (A Entidade `Post`)

O coração da aplicação é a entidade `Post`, que é mapeada para a tabela `tb_post`:

| Campo | Tipo | Descrição |
| :--- | :--- | :--- |
| `id` | `Long` | Chave primária e gerada automaticamente. |
| `title` | `String` | O título do post. |
| `content` | `String` | O conteúdo principal do post. |
| `date` | `Date` | A data de criação/publicação do post. |

## 🗺️ Endpoints da API (CRUD Completo)

Todos os endpoints estão sob o caminho base `/posts` e implementam as quatro operações básicas (CRUD).

| Método HTTP | Endpoint | Função | Código de Resposta |
| :--- | :--- | :--- | :--- |
| `GET` | `/posts` | 📚 Retorna todos os posts cadastrados. | `200 OK` |
| `GET` | `/posts/{id}` | 🔍 Retorna um post específico pelo ID. | `200 OK` |
| `POST` | `/posts` | ➕ Insere um novo post no banco de dados. | `201 Created` |
| `PUT` | `/posts/{id}` | ✏️ Atualiza as informações de um post existente. | `200 OK` |
| `DELETE` | `/posts/{id}` | 🗑️ Remove um post pelo ID. | `204 No Content` |

## 🛠️ Configuração Inicial (Rode em 3 passos!)

### 1. Banco de Dados

A API está configurada para usar o **PostgreSQL**. Certifique-se de que ele está rodando e crie o banco de dados conforme o arquivo `application.properties`:

* **Nome do Banco:** `posts-db`
* **Usuário:** `postgres`
* **Senha:** `1234`

### 2. Dados de Teste

A classe `Instantiation` popula o banco de dados automaticamente com 3 posts de exemplo:

* Viagem para Paris 🇫🇷
* Viagem para Rio de Janeiro 🇧🇷
* Viagem para BH 🏟️
