create database pbo_tiket;
use pbo_tiket;

create table login (Id int(5), User_name varchar(30),
Pass varchar(30));

create table kereta (No_kursi varchar(20), Nama varchar(30), Jumlah_beli varchar(30),
uang_bayar varchar(30), ttl_bayar varchar(30), uang_kembali varchar(30));

insert into login values (1, 'admin', '123');
drop table kereta;