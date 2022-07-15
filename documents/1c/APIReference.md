# API Reference

## Структура университета

```http
  /api/structure
```

### Получение данных о группах

```http
  GET /api/structure/getGroups
```

##### Response

###### HTTP 200

| Parameter       | Type                    | Description                                  |
|:----------------|:------------------------|:---------------------------------------------|
| `title`         | `string` **(not null)** | Номер группы (например, **бАП-181**)         |
| `faculty`       | `string` **(not null)** | Абривиатура факультета (например, **ФИТКБ**) |

### Получение данных о факультетах

```http
  GET /api/structure/getFaculties
```

##### Response

###### HTTP 200

| Parameter      | Type                    | Description                                  |
|:---------------|:------------------------|:---------------------------------------------|
| `title`        | `string` **(not null)** | Полное название факультета                   |
| `abbreviation` | `string` **(not null)** | Абривиатура факультета (например, **ФИТКБ**) |

[//]: # (#### Получение данных о департаментах)

[//]: # ()
[//]: # (```http)

[//]: # (  GET /api/)

[//]: # (```)

## Пользователи

```http
  /api/users/
```

### Получение данных студента

```http
  GET /api/users/student/getStudent/${gradeBook}
```

##### Request

| Parameter   | Type                    | Description                    |
|:------------|:------------------------|:-------------------------------|
| `gradeBook` | `string` **(not null)** | Номер зачётной книжки студента |

##### Response

###### HTTP 200

| Parameter          | Type                    | Description                                               |
|:-------------------|:------------------------|:----------------------------------------------------------|
| `group`            | `string` **(not null)** | Группа, в которой учится студент                          |
| `tuitionType`      | `string` **(not null)** | Тип обучения (например, **бюджет**/**контракт**)          |
| `tuitionForm`      | `string` **(not null)** | Форма обучения (например, **очное**/**заочное**)          |
| `trainingLevel`    | `string` **(not null)** | Уровень подготовки (например, **бакалавр**/**магистр**)   |
| `studentCondition` | `string` **(not null)** | Состояние (например, является **студентом**/**отчислен**) |
| `startDate`        | `string` **(not null)** | Дата начала обучения                                      |
| `endDate`          | `string` **(not null)** | Предпологаемая дата окончания обучения                    |

###### HTTP 404

| Parameter | Type                    | Description     |
|:----------|:------------------------|:----------------|
| `error`   | `string` **(not null)** | Описание ошибки |


### Получение данных сотрудника

```http
  GET /api/employee/getEmployee/${email}
```

##### Request

| Parameter | Type                    | Description      |
|:----------|:------------------------|:-----------------|
| `email`   | `string` **(not null)** | Почта сотрудника |

##### Response

###### HTTP 200

| Parameter    | Type                    | Description                              |
|:-------------|:------------------------|:-----------------------------------------|
| `post`       | `string` **(not null)** | Должность сотрудника                     |
| `department` | `string` **(not null)** | Департамент в котором работает сотрудник |


###### HTTP 404

| Parameter | Type                    | Description     |
|:----------|:------------------------|:----------------|
| `error`   | `string` **(not null)** | Описание ошибки |

## Ведомости

```http
  /api/
```

### Получение ведомости

```http
  GET /api/
```