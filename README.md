Este repositório está sendo utilizado para estudos com base no vídeo de Giuliana Bezerra. A demo apresentada foi retirada [deste vídeo](https://www.youtube.com/watch?v=hit0XHGt4WI), onde é ilustrada a implementação da arquitetura limpa utilizando Spring Boot.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JDBC](https://spring.io/projects/spring-data-jdbc)
- [H2](https://www.h2database.com)

## Como Executar

- Clonar repositório git:

```
git clone https://github.com/Renan1Pollo/spring-boot-cleanarch.git
```

- Construir o projeto:

```
./mvnw clean package
```

- Executar:

```
java -jar ./target/spring-boot-cleanarch-0.0.1-SNAPSHOT.jar
```

- Testar (com [httppie](https://httpie.io)):

```
http POST :8080/users username=username password=password email=email
```

## Versões do Projeto

Para ajudar a acompanhar o vídeo, foram criadas tags com cada fase do projeto:

- [Projeto Inicial](https://github.com/giuliana-bezerra/spring-boot-cleanarch/releases/tag/v1.0)
- [Projeto com Clean Arch](https://github.com/giuliana-bezerra/spring-boot-cleanarch/releases/tag/v2.0)

## Créditos

Todo o conteúdo foi desenvolvido por **Giuliana Bezerra**. Agradecimento especial por compartilhar conhecimento e contribuir com a comunidade de desenvolvedores!
