# Разработка CRUD Rest API
Разработка CRUD Rest API для работы с мероприятиями (создание, изменение,
удаление, получение), выполняется на Java 11 или 17 и PostgreSQL.

Это задание было выполнено с помощью SpringBoot и Hibernate (чистый, не в обертке Spring Data).

Как запустить приложение:

1. Клонировать этот репозиторий себе на локальный компьютер

   `https://github.com/Bo4um/events-api.git`
2. Создание базы данных и конфигурация Hibernate

    `create database events_api`

    Создание таблицы событий

    `create table events
    (
        id          serial primary key,
        theme       varchar(100) not null,
        description varchar(100) not null,
        organizer   varchar(50)  not null,
        datetime    timestamp    not null,
        location    varchar(50)  not null
    );`

    Также нужно поменять данные пользователя PostgreSQL. Открываем файл src/main/resources/db.properties и меняем свойства jdbc.username и jdbc.password на свои.

3. Запустить приложение через основной класс EventsApplication.

Приложение поддерживает следущие методы:

    GET /events/
    POST /events/
    GET /events/{id}
    PUT /events/{id}
    DELETE /events/{id}
Эти методы можно протестировать с помощью Postman либо любой другой прогаммы для тестирование HTTP запросов.
