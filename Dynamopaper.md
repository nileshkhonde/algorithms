1. Availability and Partition Tolerance is preferred over Consistency.
2. Application need is not complex querying but accessing information based on key and no other data items are needed thus no relational schema is needed.
3. Amazon has seen that data store which has ACID properties has poor availability.
4. Dynamo does not support ACID properties. It provides eventual consistency (C) and no guarantee of Isolation.
5. SLA - request should return in 300ms for 99.9% of the time. Each dynamo node should take 500 requests/sec with commodity hardware.
6. Client->Page renderer->response Aggregator -> services->dynamo + s3 + other databases.
7. As dynamo is eventually consistent, the design decision comes is when there is a conflict in state when to resolve it, while writing or reading.
8. Amazon always writes customer data even when there is conflict of state, and while at read the conflict is resolved based on versioning.
9. Conflict can be resolved by data store which uses "last write wins". But app dev can resolved it as well by merging the two states.
10. Decentralized - Any node can be accessed. centralized approach cause downtime when center node is down.
11. Symmetry - every node is same no master slave approach.
12. Heterogeniocity - Every node can have different configuration and should not affect each other.
13. Incremental Scalability - New node should be able to add without any issue.
14. Dynamo has put(key, context, data) where key is to identify the object, context is additional info such as versioning etc, and the data
15. While storing Dynamo selects the node using MD5 hashing of key which is also used while executing get(key) call.
16. partitioning - consistent hashing. hash(key) would choose the point on ring and walking in clockwise will give the node which will serve the data.
    It would also create virtual node for even distribution with different hash so each node gets even load.
17. replication - replicate data to n nodes in clockwise direction so if this node fails following nodes will have the data.
18. versioning - versioning is used to reconsile the object states. if some node has old state still the new state is stored
19. membership - they key space is registered using hash functions
20. failure handling - when node fails the Markle tree of hashing is used to find which data is not copied and only that will be copied
21. scaling - any node can by dynamically added where in it steals the keyset from other nodes and replicate data
