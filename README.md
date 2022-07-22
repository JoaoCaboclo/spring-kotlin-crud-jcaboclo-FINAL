
API REST desenvolvida com Spring Boot e KOTLIN
==============================================


   1-Projeto permite consumir todos os métodos HTTP (POST, GET, DELETE, PUT )

   2-Configurações da aplicação e acesso a banco de dados no arquivo applicaation.properties

   3-Estrutura do projeto padrão (Pacotes: model, repositório, controle, service ( interface e implementação )

   4-Configurado para gerar a documentação SWAGGER - permitindo executar testes na API pelo SWAGGER

   5-Configurado para executar uma carga inicial de dados, criando a tabela e inserindo dados

   6-Acompanha class de testes unitários 


1-Os métodos poderão ser testados pelo Postman, pela própria documentação da api swagger/openapi
  e pelas classes de testes do JUnit5

2-link para consular a documentação do sistema no swagger:           
   http://localhost:8080/swagger-ui/index.html#/

3-link para abrir o banco H2 pelo browse 
  http://localhost:8080/h2-console --  

4-Os arqquivos de configuração e carga inicial de dados estão na pasta resources
  schema.sql e data.sql

5-GitHub:

TECNOLOGIAS
===========
   1-Gradle
   
   2-Spring boot  - versão 2.7.1  -  JavaVersion.VERSION_1_8
   
   3-Kotlin -  kotlin-stdlib-jdk8
   
   4-JUNIT 5 e MOCKMVC
   
   5-SWAGGER
   
   6-Springdoc-openapi
   
   7-H2

'# spring-kotlin-crud-jcaboclo-


DEVOPS
======

1-BAIXAR O JENKIS
  https://blog.tiagopariz.com/jenkins-instalar-no-windows/
  baixe o jenkins.war
        execute o comando [  java -jar jenkins.war  ]

2-Executando  o JENKINS para configurar a apiline de devops
   http://localhost:8080/login?from=%2F

3-Link para integração continua/devops no github
    http://localhost:8080/job/spring-kotlin-crud-jcaboclo-continuosintegration-devops/
 