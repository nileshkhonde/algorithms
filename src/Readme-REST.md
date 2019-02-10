REST API principles:
REST api has all nouns and no verb. Verbs are represented by http method.
URIs are in two forms – singular resource or collection.
collection can be primary or secondary.
Keep version of the api in the path so upgrade won't break older apis

Data format:
JSON or XML. Mostly preferred JSON.

API:
/employees  --browse all/primary collection
/employees?from=0&to=100  --browse all/primary collection with filter
/employees/{empid}  -- singular resource
/depts
/depts/{deptid}/employees  -- browse all but secondary collection employees within given dept.

Http Methods - verbs - tells action:
GET - idempotent - gets the data - non mutating
POST - non-idempotent - creates new element - mutating
PUT - idempotent - updates existing element - mutating
DELETE - idempotent - deletes existing element - mutating

HTTP response:
2xx - Success
4xx - error (data not found, not authorized etc, no issues with server)
5xx - server error 

Below could be achieved using additional parameters:
Searching - /employees?lastname=khonde
filtering - /employees?location=india also pagination related like /employees?from=100&to=150
Sorting - /employees?sort=lastname&sorttype=asc

