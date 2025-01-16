# CineScope

CineScope é uma aplicação para avaliação e recomendação de filmes. Este projeto foi desenvolvido com o objetivo de consolidar conhecimentos em desenvolvimento back-end com **Spring Boot**, **JUnit** e boas práticas de **Testes Unitários**.

## Funcionalidades

- **Gerenciamento de Filmes**: Adicionar, buscar, listar e filtrar filmes por gênero.
- **Gerenciamento de Usuários**: Adicionar, listar e buscar usuários por e-mail.
- **Sistema de Avaliações**: Permitir aos usuários avaliarem filmes com notas e comentários.
- **Testes Unitários**: Cobertura de testes para serviços principais (MovieService, UserService e RatingService).

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (versão 3.1.0):
  - Spring Data JPA
  - Spring Web
- **H2 Database**: Banco de dados em memória para testes.
- **Maven**: Gerenciamento de dependências.
- **JUnit 5**: Para testes unitários.
- **Mockito**: Mock de repositórios nos testes unitários.

---

## Estrutura do Projeto

```plaintext
src/
├── main/
│   ├── java/com/cinescope/
│   │   ├── controller/       # Controladores REST
│   │   ├── model/            # Modelos e entidades JPA
│   │   ├── repository/       # Interfaces JPA Repository
│   │   ├── service/          # Lógica de negócios
│   └── resources/
│       ├── application.properties  # Configurações da aplicação
├── test/
│   ├── java/com/cinescope/   # Testes unitários
```

---

## Endpoints

### Filmes

- **GET /movies**: Retorna a lista de todos os filmes.
- **POST /movies**: Adiciona um novo filme.
  ```json
  {
    "title": "The Dark Knight",
    "genre": "Action",
    "description": "A gritty and intense tale of Batman facing his greatest foe, the Joker."
  }
  ```
- **GET /movies/{id}**: Retorna um filme pelo ID.

### Usuários

- **GET /users**: Retorna a lista de todos os usuários.
- **POST /users**: Adiciona um novo usuário.
  ```json
  {
    "name": "John Doe",
    "email": "john.doe@example.com"
  }
  ```
- **GET /users/{id}**: Retorna um usuário pelo ID.

### Avaliações

- **GET /ratings**: Retorna a lista de todas as avaliações.
- **POST /ratings**: Adiciona uma nova avaliação.
  ```json
  {
    "movieId": 1,
    "userId": 2,
    "score": 5,
    "comment": "Amazing movie!"
  }
  ```

---

## Como Rodar o Projeto

### Pré-requisitos

- **JDK 17**
- **Maven**

### Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/O_Farias/cinescope.git
   cd cinescope
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a aplicação no navegador em:
   ```
   http://localhost:8080
   ```

---

## Testes

1. Para rodar os testes unitários:
   ```bash
   mvn test
   ```

2. Cobertura de testes:
   - **MovieServiceTest**: Testa funcionalidades de gerenciamento de filmes.
   - **UserServiceTest**: Testa funcionalidades de gerenciamento de usuários.
   - **RatingServiceTest**: Testa funcionalidades de avaliação de filmes.

---

Este projeto está licenciado sob a MIT License. Veja o arquivo `LICENSE` para mais detalhes.
