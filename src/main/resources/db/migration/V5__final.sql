CREATE TABLE color(
id BIGINT AUTO_INCREMENT,
name varchar(255) NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
constraint pk_color PRIMARY KEY (id)
);

CREATE TABLE car (
    id BIGINT AUTO_INCREMENT ,
    plate_number VARCHAR(255) NOT NULL,
    car_type enum('XL','SUV','COMPACT','HATCHBACK') NULL,
    brand VARCHAR(255) NULL,
    model VARCHAR(255) NULL,
    color_id bigint NULL,
    driver_id BIGINT NOT NULL,
    created_at datetime NOT NULL,
    updated_at datetime NOT NULL,
     constraint pk_car PRIMARY KEY(id)

);


CREATE TABLE exactlocation(
id bigint AUTO_INCREMENT,
longitude DOUBLE NOT NULL,
latitude DOUBLE NOT NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
constraint pk_location PRIMARY KEY (id)

);



ALTER TABLE color
ADD CONSTRAINT uc_color_name unique(name);

ALTER TABLE CAR
ADD CONSTRAINT uq_plate_number unique(plate_number);

ALTER TABLE car
add constraint FK_CAR_ON_DRIVER foreign key(driver_id) references driver(id);

ALTER TABLE car
add constraint FK_CAR_ON_COLOR foreign key(color_id) references color(id)
