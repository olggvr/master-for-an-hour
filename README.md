# Master for an hour
## Overall description 
This is a platform where user with client role can place task (plumbing work, for example) and users with master roles will be able to respond on avaible tasks and complete them if client accepts.

API has 4-layered design: **controller, service, repository, model layers**

**Stack of technologies**
- Spring boot
- Spring Security
- Spring Data JPA, Hibernate
- Thymeleaf
- Docker

## Main controllers and endpoints
1. **Auth controller:** \
    Provides `POST /auth/sign-up` and `POST /auth/sign-in` methods.

3. **Admin controller:**
    Provides methods to manage user records, ban users and manage their profiles, a few of them below:
    `PATCH /admin/ban-user`, `POST /admin/verify/{id}`, `GET /admin/clients`

4. **Client controller:**
    Provides methods for clients:
    `DELETE /clients/bid/{id}`, `GET /clients/bids/task/{id}`

5. **Master controller:**
    Provides methods related to masters, a few of them below:
    `GET /masters/info/{id}`, `POST /masters/email`, `POST /masters/documents`

*You may also familiarize with full list of endpoints by following **controllers** folder*

## Build & run with Docker
**Building from project directory:** `docker build -t master:latest .` \
**Run application:** `docker run -p 8081:8000 master:latest`

## Additional info
- API uses **PostgreSQL** as main database on project, it currently running as docker container on separated server.
- DB designed with 3NF
- Session control made with JWT token.
- Using global excaption handler as common way to catch and return exceptions
