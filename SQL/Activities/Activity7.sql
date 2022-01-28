select sum(purchase_amount) as "total sum" from orders;
select avg(purchase_amount) as "average" from orders;
select max(purchase_amount) as "maximum" from orders;
select min(purchase_amount) as "minimum" from orders;
select count(distinct salesman_id)  as "maximum" from orders;