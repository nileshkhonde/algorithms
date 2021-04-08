### Relational model best practices
###### Have a separate table for lookup value with static ids and which will be flown into other entities as foreign key.
This will help avoid duplicate value, the key would remain static and will become a business key even if its just a surrogate key.
###### Another alternative is to keep direct value in the table with check constraint to avoid same value with different string.
The issue with this is values are getting repeated, when new value is added we have to change ddl.


### Kimbell Model
Star Schema

Snowflake Schema

Possible models in many to many
Vehicle - properties is many to many.
We can have vehicle(id, vin etc), vehicle_property(id, property_id, value), property(id, name). The value in vehicle_property is free form with no constraint or
bounded list.

We can have vehicle(id, vin etc), vehicle_property(id, property_id), property(id, name, value). The value is bounded list.  

We can have kimbell dimention model - vehicle(id, vin, engine_id, body_id etc), engine(id, value), body(id, value). Dimension for each property. list of values is possible.





