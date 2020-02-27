## Kafka
- In real world the source systems and destination systems make a complex mesh if each one connect to other via different transport like messaging, api, ftp files etc.
- Thus each system has its own connection source, its own protocol, its own format of the data. This is very hard to manage.

## Kafka
- Topic - Stream of data. This is similar to table in database schema
- Partition - Topics are split into partitions. It starts with 0.
- Offset - Each partition has incremental id called offset. Offset starts with 0.

- Message order is guaranteed only within the partition but not across the partition.
- Data is kept on kafka for retaintion time which is 1 week by default then data is deleted.
- Once data is written to Kafka then it can not be changed. Its immutable append only log.

## Kafka Cluster - Composed of multiple brokers
- Broker Is the server with an identifier. 
###### Broker has some Topic Partitions. 
###### Topic Partitions are distrubuted among different brokers.
###### When we connect to one broker we can connect to entire cluster.
###### Replication factor - 3 is standard, Broker data is replicated to other broker for backup
###### At given moment only one broker will be leader for given partition with multiple in sync replica.(ISR)
###### Leader and ISR are determined by zookeeper.
###### Producer - writes data to Partition of a Topic. Producer will load balance and send data to different partitions.
###### Producer Ack - acks=0 - Producer wont wait for ack(possible data loss)
###### Producer Ack - acks=1 - Producer wait for Leader broker (partial loss possible) (most common)
###### Producer Ack - acks=all - Producer wait for Leader as well as all partitions  (partial loss possible) (most common)

