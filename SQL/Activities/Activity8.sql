select customer_id, max(purchase_amount) from orders group by customer_id;

select salesman_id, max(purchase_amount) from orders where order_date = to_date('2012/08/17', 'YYYY/MM/DD') group by salesman_id, order_date;

select customer_id, max(purchase_amount) from orders group by customer_id, order_date having MAX(purchase_amount) in (2030, 3450, 5760, 6000);