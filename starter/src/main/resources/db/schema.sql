CREATE TABLE `orm_department`
(
    `department_id`    bigint       NOT NULL AUTO_INCREMENT,
    `created_by`       int          NOT NULL,
    `creation_date`    time(6)      NOT NULL,
    `last_update_by`   int          NOT NULL,
    `last_update_date` time(6)      NOT NULL,
    `levels`           int          NOT NULL DEFAULT '0',
    `name`             varchar(255) NOT NULL,
    `order_no`         int          NOT NULL DEFAULT '0',
    `superior`         bigint                DEFAULT NULL,
    PRIMARY KEY (`department_id`),
    KEY `FKiyfp4fhyvv1m93vnprgn48v39` (`superior`),
    CONSTRAINT `FKiyfp4fhyvv1m93vnprgn48v39` FOREIGN KEY (`superior`) REFERENCES `orm_department` (`department_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

CREATE TABLE `orm_user`
(
    `user_id`          bigint  NOT NULL AUTO_INCREMENT,
    `created_by`       int     NOT NULL,
    `creation_date`    time(6) NOT NULL,
    `last_update_by`   int     NOT NULL,
    `last_update_date` time(6) NOT NULL,
    `email`            varchar(255) DEFAULT NULL,
    `last_login_time`  datetime(6)  DEFAULT NULL,
    `name`             varchar(255) DEFAULT NULL,
    `password`         varchar(255) DEFAULT NULL,
    `phone_number`     varchar(255) DEFAULT NULL,
    `salt`             varchar(255) DEFAULT NULL,
    `status`           int          DEFAULT NULL,
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

CREATE TABLE `orm_user_dept`
(
    `user_id` bigint NOT NULL,
    `dept_id` bigint NOT NULL,
    KEY `FK1f0y68jnkm6d3pfcenp8bje4f` (`dept_id`),
    KEY `FKgjdnywm8vnx1lhykq8wht71sp` (`user_id`),
    CONSTRAINT `FK1f0y68jnkm6d3pfcenp8bje4f` FOREIGN KEY (`dept_id`) REFERENCES `orm_department` (`department_id`),
    CONSTRAINT `FKgjdnywm8vnx1lhykq8wht71sp` FOREIGN KEY (`user_id`) REFERENCES `orm_user` (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

CREATE TABLE `tbl_number_generator_rule`
(
    `rule_id`          bigint  NOT NULL AUTO_INCREMENT,
    `created_by`       int     NOT NULL,
    `creation_date`    time(6) NOT NULL,
    `last_update_by`   int     NOT NULL,
    `last_update_date` time(6) NOT NULL,
    `description`      varchar(500) DEFAULT NULL,
    `enable_flag`      varchar(1)   DEFAULT NULL,
    `rule_name`        varchar(80)  DEFAULT NULL,
    PRIMARY KEY (`rule_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

CREATE TABLE `tbl_number_generator_rule_condition`
(
    `rule_condition_id` bigint       NOT NULL AUTO_INCREMENT,
    `created_by`        int          NOT NULL,
    `creation_date`     time(6)      NOT NULL,
    `last_update_by`    int          NOT NULL,
    `last_update_date`  time(6)      NOT NULL,
    `biz_code`          varchar(255) NOT NULL,
    `rule_condition`    varchar(255) DEFAULT NULL,
    `rule_id`           bigint       NOT NULL,
    PRIMARY KEY (`rule_condition_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

CREATE TABLE `tbl_number_generator_rule_segment`
(
    `rule_id`              bigint       NOT NULL AUTO_INCREMENT,
    `created_by`           int          NOT NULL,
    `creation_date`        time(6)      NOT NULL,
    `last_update_by`       int          NOT NULL,
    `last_update_date`     time(6)      NOT NULL,
    `attribute_clz`        varchar(255) DEFAULT NULL,
    `attribute_name`       varchar(255) DEFAULT NULL,
    `description`          varchar(255) DEFAULT NULL,
    `format_key`           varchar(255) DEFAULT NULL,
    `independent_sequence` varchar(255) DEFAULT NULL,
    `max_length`           int          NOT NULL,
    `padding`              varchar(255) DEFAULT NULL,
    `segment_idx`          int          NOT NULL,
    `segment_name`         varchar(255) DEFAULT NULL,
    `segment_type`         varchar(255) NOT NULL,
    `sequence_from`        bigint       DEFAULT NULL,
    `sequence_to`          bigint       DEFAULT NULL,
    `text`                 varchar(255) DEFAULT NULL,
    PRIMARY KEY (`rule_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

CREATE TABLE `tbl_number_generator_rule_sequence_record`
(
    `rule_segment_record_id` bigint       NOT NULL AUTO_INCREMENT,
    `created_by`             int          NOT NULL,
    `creation_date`          time(6)      NOT NULL,
    `last_update_by`         int          NOT NULL,
    `last_update_date`       time(6)      NOT NULL,
    `composition_key`        varchar(255) NOT NULL,
    `current_data_sequence`  varchar(255) DEFAULT NULL,
    `current_sequence`       bigint       DEFAULT NULL,
    `rule_segment_id`        bigint       NOT NULL,
    PRIMARY KEY (`rule_segment_record_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
;

