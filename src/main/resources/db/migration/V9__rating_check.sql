ALTER Table driver
add constraint ck_rating check(rating>1.00 and rating<5.00)