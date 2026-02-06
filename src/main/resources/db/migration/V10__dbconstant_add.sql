CREATE TABLE dbconstant(
id bigint AUTO_INCREMENT,
name varchar(255) NOT NULL,
value varchar(255) NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
constraint pk_dbconstant PRIMARY KEY (id)
);

ALTER TABLE dbconstant
add constraint uq_db_constant_name unique(name);