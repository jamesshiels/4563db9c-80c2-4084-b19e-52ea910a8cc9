# 4563db9c-80c2-4084-b19e-52ea910a8cc9
Initial commit

Genesys Coding Challenge

A spring boot application using MySql.

Add table "models" to a MySql db.
CREATE TABLE `db3`.`models` (
`idmodels` INT NOT NULL AUTO_INCREMENT,
`sensor_id` VARCHAR(45) NULL,
`temperature` VARCHAR(45) NULL,
`wind_speed` VARCHAR(45) NULL,
`humidity` VARCHAR(45) NULL,
`min_` VARCHAR(45) NULL,
`max_` VARCHAR(45) NULL,
`sum_` VARCHAR(45) NULL,
`average` VARCHAR(45) NULL,
`date` VARCHAR(45) NULL,
PRIMARY KEY (`idmodels`));

Add db name, username and password to appication.properties. 

Run in maven with mvn spring-boot:run