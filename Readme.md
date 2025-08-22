
## Intensive Spring Boot - DevSuperior - Nélio alves
## Stack utilizada

- Java 17
- Spring Boot 3.5.4
- PostgreSQL
- Docker
- Docker Compose


# EndPoints


> /games - Buscar Todos os Games </br>
> /game/{id} - Busca Por Identificação Única </br>
> /lists - Lista as GameList </br>
> /lists/{id}/games - Lista as GameList por Categoria
## 🚀 Como executar o projeto

> Pré-requisitos: Docker e Docker Compose instalados.

1. Clone este repositório:

Clone o projeto

```bash
  https://github.com/matheusandre1/ds-list
```

Entre no diretório do projeto
```bash
cd ds-list
```


Rode o Comando

```bash
docker-compose up -d 
```

Rode aplicação Java
```bash
mvn clean install
```

Acesse o link:
```bash
http://localhost:8081/swagger-ui/index.html
```