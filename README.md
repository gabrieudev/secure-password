# Challenge: Secure Password API

![Java](https://img.shields.io/badge/Java-8%2B-orange) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green) [![LinkedIn](https://img.shields.io/badge/Connect%20on-LinkedIn-blue)](https://www.linkedin.com/in/joão-santos-1115a5304/)
![GPL License](https://img.shields.io/badge/License-GPL-blue) [![LinkedIn](https://img.shields.io/badge/Type-Challenge-purple)](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md)

This is my solution for the backend challenge **Secure Password API**. 

Please select your preferred language:

- [English](README.md)
- [Português (Brasil)](README.pt-br.md)

Visit the [challenge](https://github.com/backend-br/desafios/blob/master/secure-password/PROBLEM.md) to get more information about the problem.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Technologies](#technologies)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Contributions](#contributions)
- [Contact](#contact)

## Introduction

The challenge is to implement an API that checks if a password meets the specified criteria.

## Features

- POST method for password validation.
- View the criteria not met by the password.
- Documentation with Swagger.

## Technologies

- ![Java](https://img.shields.io/badge/Java-8%2B-orange): Programming language.
- ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3-green): Framework used for building applications.

## Getting Started

Follow these steps to run the project on your machine:

1. Clone the repository: `git clone https://github.com/gabrieudev/secure-password.git`
2. Navigate to the project directory: `cd <path>`
3. Build the application: `./mvnw clean install` (for Windows: `mvnw.cmd clean install`)
4. Run the application: `./mvnw spring-boot:run` (for Windows: `mvnw.cmd spring-boot:run`)

## Endpoints

- `POST /validate-password`: Checks if the password meets the criteria; otherwise, the criteria will be shown in the response body.

Access the documentation at the endpoint `/swagger-ui.html`

## Contributions

Contributions are very welcome! If you want to contribute, fork the repository and create a pull request.

## Contact

If you have any suggestions or questions, contact me on [LinkedIn](https://www.linkedin.com/in/gabrieudev/)

---

**License:** This project is licensed under the terms of the [GNU General Public License (GPL)](LICENSE).