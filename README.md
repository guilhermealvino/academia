# 🏋️‍♂️ Academia API

Bem-vindo à **API de Academia**!  
Este projeto é uma aplicação backend desenvolvida em **Java 17** com **Spring Boot 3**, pronta para ser deployada na **Azure**.

## 🚀 Sobre o Projeto

A API de Academia permite o gerenciamento de alunos, matrículas e funcionalidades típicas de uma academia.  
Ela foi construída com foco em escalabilidade, segurança e facilidade de integração, utilizando as melhores práticas do ecossistema Spring.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database** (para desenvolvimento)
- **Springdoc OpenAPI (Swagger UI)**
- **Deploy-ready para Azure**

## 🌐 Documentação Interativa

Acesse a documentação Swagger em:  
```
/swagger-ui.html
```
ou  
```
/swagger-ui/index.html
```

## ☁️ Deploy na Azure

Esta aplicação está pronta para ser deployada na Azure App Service ou em containers no Azure.  
Basta configurar suas variáveis de ambiente e banco de dados conforme necessário.

## 📦 Como Executar Localmente

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/seu-usuario/academia-api.git
   cd academia-api
   ```

2. **Execute com Maven:**
   ```sh
   ./mvnw spring-boot:run
   ```

3. **Acesse:**  
   [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 💙 Feito para a Nuvem

- Pronto para deploy contínuo na Azure
- Configuração via `application.yml`
- Suporte a variáveis de ambiente para produção

---

> Feito com 💪 por apaixonados por tecnologia