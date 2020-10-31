
### Scalability - Systems ability to grow
- Horizontal Scaling - Adding more nodes/machines in 
- Vertical Scaling - Adding more hardware like Memory(RAM), Better CPU etc.
	
### Reliability - System could degrade but should be reliable without single point failure
- The system should be reliable and wont have single point failure.
- We can achieve this by redundancy of servers and data stores. 
- Replicating user data will ensure if one server fails other will take over.

## Availability - System if available to perform operation.

## Efficiency/Throughput - tasks performed in give time.

## Manageability - System can be fixed in case of failure, can be enhanced.

## Load Balancer - Distribute the load, detect errors and stop sending request to that server
- Load balancer between user and web server, web server and app server and app and database.

## Caching - Loads data into memory and never read again.
- Write-Through Cache - write data in cache as well as source of truth, database.
- Write-Around cache - data written in database but not in cache, the force cache miss and reread
- Write-Back Cache - data is written only to cache, and control returns to caller, then data is written to db.
- Cache eviction can be - LRU - Least Recently Used MRU -Most Recently Used LFU - Least Frequently Used
- How much to cache - 20% ?
- CDN - Content Distribution Network - caches data locally and accesses it from the server.

## Performance:
- Data partitioning/Sharding - Data is divided into chunks for better management and performance.
- Range Partitioning
- List Partitioning
- Vertical partitioning - data of different entities kept in different servers.
- Issues with joins, issues with accessing data beyond partition.

## Indexes
- Redundancy - Duplication of critical system so if one goes down other is present for backup.

## Replication - Syncing the information to redundant servers.

## SQL/NoSQL 
- SQL are structure, good for OLTP, Oracle, MYSql. 
- NoSQL is key value store like Redis, or Document database like MongoDB, Columnar databases like Cassandra 
- SQL Schema is fixed, NoSQL it is dynamic. SQL querying is fast than NOSQL
- SQL databases are vertically scalable, NOSQL are horizontally scalable
- SQL databases follows ACID properties, NoSQL databases sacrifise some of the ACID properties.
- SQL databases if data is structured and unchanging.
- NOSQL when storing large data which doesn't have much structure.
- NOSQL can scale horizontally across clusters out of the box no additional efforts needed.
- NOSQL good for rapid development. Frequent update to structure without down time.

## URL Shortening - Short url is easy to send across message, email etc.

## Purging database - 

