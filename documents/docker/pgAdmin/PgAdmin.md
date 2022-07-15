# PgAdmin

## Доступ к PgAdmin из браузера

1. Открыть [docker-compose.yaml](../../../docker-compose.yaml)
2. Сменить `port` для сервиса `pgadmin` (при необходимости)
3. Run `docker-compose up`
4. Открыть `http://localhost:[pgAdmin4-port]`
5. После отображения страницы входа ввести адрес электронной почты `PGADMIN_DEFAULT_EMAIL` и пароль `PGADMIN_DEFAULT_PASSWORD`
6. После отображения панели управления PgAdmin щелкните правой кнопкой мыши на **Servers** > **Create** > **Server...**
7. На странице **General** заполняем поле **Name** (Оно может быть любым, например, *Assistant*)
8. На странице **Connection** заполняем следующие поля (из файла *docker-compose.yaml*):
   * **Host name/address**: PostgreSQL service name (в файле: db, postgres)
   * **Username**: `POSTGRES_USER`
   * **Password**: `POSTGRES_PASSWORD`
   * **Save password** поставить галочку 
