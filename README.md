# sensorsimulator
Aims to simulate values for temperature, humidity and pressure.

To start the application:
    ./play run

And then http://localhost:9000

To use the REST API:
	curl -X POST http://localhost:9000/users -H "Content-Type: application/json" -d "{\"name\": \"user_name\"}"
	curl -X GET http://localhost:9000/users/1 
	curl -X DELETE http://localhost:9000/users/1 
