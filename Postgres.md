###### MVCC - Multiversion Concurrency Control - multiple version of same tuple to handle concurrent request isolation.
###### Data model - Normalized model with tables and reference relationships or dynamic schema with JSONB
###### Extendibility - Fully extendible which allows new data types, adding available extensions/modules. select * from pg_extension etc \dx
###### psql postgresql://myuser:mypasswd@myhost:5432/mydb   psql -h host -p port -d database -U user 
###### database server is a database cluster as postgres allows to define one or more databases
###### server has max connection limit which can be found by "show max_connections"
###### SELECT current_database() - shows current database, select current_user -- shows current user id, select version()
###### \? list of metadata commands 
###### .pgpass file host:port:database:user:password
###### select pg_postmaster_start_time() from what the sever is up?
###### listing database - \l list of dbs, (select datname from pg_database)
###### create database mydatabase
###### \d to list the tables (select * from pg_tables)
###### select * from pg_database details about the database
###### Sequential scan when every row is loaded from disk and accessed, index only scan - when index is present only index is loaded and accessed
###### pg_class table information 
###### \d+ tablename to get info about the table
###### pg_settings for all the settings for the db server
###### Connection limit - alter user abc connection limit 1;
###### select pg_terminate_backend(pid)
###### create schema xyz; create table xyz.t1 (definition)
###### GRANT - USAGE, CREATE, SELECT, INSERT, DELETE, UPDATE, 
###### ALTER DEFAULT PRIVILEGES FOR USER x - this will automatically give grants for future objects
###### naming - index - tablename_columnname_idx
###### never use quote or mixed case, same is needed to be used in querying
###### ctid is internal sequence column of postgres same as rownum in oracle, this is useful for duplication removal related tasks
###### Avoid duplicates - Create primary key (this internally creates index). Add unique constraint. Create unique index.
###### Unique index can be created with where clause if we know its unique only in certain cases. This will create partial index.
###### Primary key, unique constraint and unique index all internally creates index.
###### pg_dump to export the data and psql COPY to import it back. pgloader
###### Alter user uname superuser or nosuperuser to make any user superuser. this should be avoided. the common superuser is postgres
###### CREATEDB and CREATEUSER roles are also reserved for superuser.
###### \dp table will give us which roles are granted access to table
###### \du user will give all roles for user
###### create views to mask data, show consistent interface when underline table can change.
###### USING clause can be applied to rows
###### ON CONFLICT DO ..
###### for roles that doesnt need login, create them with NOLOGIN clause.
###### removing user without dropping their data - disconnect login of old user ALTER USER a NOLOGIN then REASSIGN OWNED BY a to b
###### 
######
######
######
######
######
######
######
######
######
######
######
######
######
######

