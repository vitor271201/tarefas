API RESTful de Gerenciamento de Tarefas

Este é um projeto de backend construído com Spring Boot que expõe uma API RESTful para o gerenciamento de tarefas. O sistema permite criar, listar, atualizar, excluir e consultar tarefas, com persistência de dados em banco H2 em memória e documentação interativa via Swagger UI.

---

Como executar a aplicação

- Java 17 ou superior
- Maven
- IDE (recomendado: VSCode, IntelliJ, Eclipse)

Passo a passo para rodar o backend

1. Clone o repositório:
   ```bash
   git clone https://github.com/vitor271201/tarefas.git
Acesse a pasta do projeto:

cd tarefas

Execute a aplicação com Maven:

./mvnw spring-boot:run

Acesse no navegador:

Swagger UI: http://localhost:8080/swagger-ui.html

Console H2: http://localhost:8080/h2-console

Tecnologias Utilizadas

Java 21

Spring Boot

Spring Web

Spring Data JPA

H2 Database (memória)

Springdoc OpenAPI (Swagger UI)

Maven

Como testar os endpoints

Com a aplicação rodando, acesse o Swagger UI:

http://localhost:8080/swagger-ui.html

Principais endpoints disponíveis:

Método	Endpoint	Descrição
GET	/api/tarefas	Lista todas as tarefas
GET	/api/tarefas/{id}	Retorna uma tarefa pelo ID
POST	/api/tarefas	Cadastra uma nova tarefa
PUT	/api/tarefas/{id}	Atualiza uma tarefa existente
DELETE	/api/tarefas/{id}	Remove uma tarefa pelo ID

Os dados devem ser enviados/recebidos no formato JSON.

📂 Estrutura de Pastas

src
└── main
    ├── java
    │   └── com.vitor
    │       ├── controller
    │       ├── model
    │       ├── repository
    │       └── service
    └── resources
        └── application.properties

👨‍💻 Autor
NOME COMPLETO: Vitor Siqueira Santos
Faculdade: Uniube
Disciplina: Arquitetura de Software
Professor: CLENIO EDUARDO DA SILVA

