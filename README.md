Project: https://github.com/lexxxander/Cloud-Repos/tree/master/qudiniplaywsapi

About QudiniPlayWSAPI:

- A Restful Web Service that allow to sort customer list by due time.
Technologies:
- Java 8 (Comparable for sorting and Stream)
- Spring boot
- Tomcat server


How to run Qudini Play Web Service:
- Deploy war file to tomcat server. war location, https://github.com/lexxxander/Cloud-Repos/blob/master/qudiniplaywsapi/target/qudiniplaywsapi.war


Web Service API documentation:
- Method: sort
- Method type: POST
- Content type: applicatoin/json
- Data type: Object list
- Request body data: Integer id; String name; DateTime duetime; DateTime jointime;

URL: http://[serveraddress]:8080/qudiniplaywsapi/customer/sort

JSON sample: [ { "id": 10000000, "name": "Ulysses Leon", "duetime": "2014-06-18T06:26:56-07:00", "jointime": "2015-04-08T12:47:16-07:00" }, { "id": 10000001, "name": "Bruce Cardenas", "duetime": "2013-12-28T14:11:12-08:00", "jointime": "2014-07-03T21:53:42-07:00" } ]
