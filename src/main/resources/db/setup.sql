create database soteria;

create user 'soteria_shopper'@'localhost' identified by 'soteria90210';
grant all privileges on soteria.* to 'soteria_shopper'@'localhost';
flush privileges