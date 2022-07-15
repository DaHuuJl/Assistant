# Keycloak

## Доступ к Administration Console

1. Открыть [docker-compose.yaml](../../../docker-compose.yaml)
2. Сменить `port` для сервиса `keycloak` (при необходимости)
3. Run `docker-compose up`
4. Открыть `http://localhost:[keycloak-port]`
5. После отображения страницы входа ввести логин `KEYCLOAK_USER` и пароль `KEYCLOAK_PASSWORD`

## Realm import

1. Навести на реалм (по дефолту *Master*) и нажать на **Add realm**
2. Выбрать файл [realm.json](./realm.json)
3. При необходимосте изменить название
4. Нажать **Save**
