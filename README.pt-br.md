# Desafio: API para senha segura

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/joão-santos-1115a5304/)
![GPL License](https://img.shields.io/badge/License-GPL-blue) [![LinkedIn](https://img.shields.io/badge/Type-Challenge-purple)](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md)

Essa é a minha solução para o desafio backend **API para senha segura**. Acesse o [desafio](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md) para obter mais informações do problema.  

## Tabela de conteúdos

- [Introdução](#introdução)
- [Funcionalidades](#funcionalidades)
- [Tecnologias](#tecnologias)
- [Iniciando](#iniciando)
- [Endpoints](#endpoints)
- [Contribuições](#contribuições)
- [Contato](#contato)

## Introdução

O desafio consiste em implementar uma API que verifique se uma senha está de acordo com os critérios determinados.

## Funcionalidades

- Método POST para a senha.
- Visualização dos critérios não atendidos pela senha.
- Documentação com Swagger.

## Tecnologias

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Linguagem de programação.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework usado para a construção de aplicações.

## Iniciando

Siga esses passos para executar o projeto na sua máquina:

1. Clone o repositório: `git clone https://github.com/gabrieudev/secure-password.git`
2. Navegue para o diretório do projeto: `cd <caminho>`
3. Construa a aplicação: `./mvnw clean install` (para Windows: `mvnw.cmd clean install`)
4. Execute a aplicação: `./mvnw spring-boot:run` (para Windows: `mvnw.cmd spring-boot:run`)

## Endpoints

- `POST /validate-password`: Verifica se a senha está de acordo com os critérios, caso contrário, os critérios aparecerão no corpo da resposta.

Acesse a documentação no endpoint `/swagger-ui.html`

## Contribuições

Contribuições são muito bem vindas! Caso queira contribuir, faça um fork do repositório e crie um pull request.

## Contato

Caso tenha alguma sugestão ou dúvida, entre em contato comigo em [LinkedIn](https://www.linkedin.com/in/gabrieudev/)

---

**Licença:** Esse projeto é licenciado sob os termos da [GNU General Public License (GPL)](LICENSE).
