### Relational model best practices
###### Have a separate table for lookup value with static ids and which will be flown into other entities as foreign key.
This will help avoid duplicate value, the key would remain static and will become a business key even if its just a surrogate key.
###### Another alternative is to keep direct value in the table with check constraint to avoid same value with different string.
The issue with this is values are getting repeated, when new value is added we have to change ddl.


### Kimbell Model
Star Schema

Snowflake Schema
