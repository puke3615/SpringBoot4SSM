# SpringBoot4SSM
*零配置的SSM模板*

* 修改`src/main/resources/application.yml`的数据库配置
    ```java
    spring:
      datasource:
         url: jdbc:mysql://127.0.0.1:3306/mytest
         username: root
         password: wuzijiao
         driver-class-name: com.mysql.jdbc.Driver
    ```

* 建表语句

    ```mysql
    CREATE DATABASE mytest;

    USE mytest;

    CREATE TABLE t_user(
      id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
      name VARCHAR(255) NOT NULL ,
      password VARCHAR(255) NOT NULL ,
      phone VARCHAR(255) NOT NULL
    ) ENGINE=INNODB DEFAULT CHARSET=utf8;

    INSERT INTO T_USER(NAME, PASSWORD, PHONE) VALUES("zijiao", "123456", "1234567890");
    ```

* 运行`SpringBoot4SsmApplication`的main方法开启服务，访问 [`http://localhost:8080/index`](http://localhost:8080/index)


