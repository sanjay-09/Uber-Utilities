CREATE TABLE OTP(
id bigint AUTO_INCREMENT,
code varchar(255),
phoneNumber varchar(255),
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
constraint pk_OTP PRIMARY KEY (id)

);

CREATE TABLE namedlocation(
id bigint AUTO_INCREMENT,
exact_location_id bigint NOT NULL,
name varchar(255) NULL,
zip_code varchar(255) NULL,
city varchar(255) NULL,
country varchar(255) NULL,
state varchar(255) NULL,
created_at datetime NOT NULL,
updated_at datetime NOT NULL,
constraint pk_namedlocation PRIMARY KEY (id)

);

ALTER TABLE namedlocation
ADD CONSTRAINT fk_namedlocation_exact_location
FOREIGN KEY (exact_location_id)
REFERENCES exactlocation(id);

ALTER TABLE driver
ADD COLUMN last_known_location_id BIGINT NULL,
ADD CONSTRAINT fk_driver_location
FOREIGN KEY (last_known_location_id)
REFERENCES exactlocation(id);

ALTER TABLE driver
ADD COLUMN home_location_id BIGINT NULL,
ADD CONSTRAINT fk_driver_home_location
FOREIGN KEY (home_location_id)
REFERENCES exactlocation(id);

ALTER TABLE driver
ADD COLUMN driver_approved_status VARCHAR(20) NULL;

ALTER TABLE driver
ADD COLUMN rating DECIMAL(3,2) NULL;
