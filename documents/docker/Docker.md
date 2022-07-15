# Docker

## Docker compose


## Docker Run Configurations (in IDEA)
Ниже представлены конфигурации для запуска контейнеров из *IntelliJ IDEA*

### StartKeycloak
Для запуска кейлока (без бд)

*Docker Image*:
* Name: ``StartKeycloak``
* ImageName: `jboss/keycloak:16.1.1`
* Modify options: 
  * Bind ports -p: `9080:8080` (protocol: **tcp**)
  * Environment variable:
    * `KEYCLOAK_USER=admin`
    * `KEYCLOAK_PASSWORD=admin`

### AssistantWeb

*Dockerfile*:
* Dockerfile: `src\main\assistant-web\Dockerfile`
* Image tag: `assistant/web:0.0.1`
* Container name: ``AssistantWeb``
* Modify options:
  * Bind ports -p: `4200:4200` (host port : container port, protocol: **tcp**)

### AssistantStart

*Docker-compose*:
* docker-compose: [`docker-compose.yaml`](../../docker-compose.yaml)

## Запуск Keycloak в Docker

Для запуска **Keycloak** необходимо запустить **StartKeycloak**

### Запуск проекта в Docker
Проект можно запустить в **Docker**.
Для этого необходимо запустить
* Создать **jar** файл для модуля **assistant-core** 

[//]: # (* Создать **jar** файл для модуля **assistant-emulator**)
* **AssistantStart** или в файле [*docker-compose.yaml*](../../docker-compose.yaml) нажать на run возле **services**

[//]: # (Настройка PgAdmin4 https://linuxhint.com/postgresql_docker/)

Чтобы изменения:
- в assistant-core: mvn clean, mvn install
- в assistant-web: необходимо заново сбилдить image (пока что докер компос этого не делает). Требуется запустить AssistantWeb или или пнуть докерфайл в корне модуля assistant-web

После чего снова запустить AssistantStart