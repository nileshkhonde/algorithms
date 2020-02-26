## Kafka
- In real world the source systems and destination systems make a complex mesh if each one connect to other via different transport like messaging, api, ftp files etc.
- Thus each system has its own connection source, its own protocol, its own format of the data. This is very hard to manage.

## Kafka
- Topic - Stream of data. This is similar to table in database schema
- Partition - Topics are split into partitions. It starts with 0.
- Offset - Each partition has incremental id called offset. Offset starts with 0.

Message order is guaranteed only within the partition but not across the partition.
