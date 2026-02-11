ALTER TABLE Booking
ADD COLUMN start_location_id bigint not null,
ADD constraint fk_start_location_on_exact_location_id
foreign key (start_location_id)
references exactlocation(id);



ALTER TABLE Booking
ADD COLUMN end_location_id bigint not null,
ADD constraint fk_end_location_on_exact_id
foreign key (end_location_id)
references exactlocation(id);

