# Conflict Tracker API

API REST per gestió de conflictes bèl·lics amb Spring Boot.

## Executar
mvn spring-boot:run

## Frontend
http://localhost:8080/index.html

## API
GET /api/v1/conflicts  
GET /api/v1/conflicts?status=ACTIVE  
GET /api/v1/conflicts/{id}  
POST /api/v1/conflicts  
PUT /api/v1/conflicts/{id}  
DELETE /api/v1/conflicts/{id}  
GET /api/v1/countries/{code}/conflicts  

## Exemple
curl http://localhost:8080/api/v1/conflicts
