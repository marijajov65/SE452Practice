Start the app from BoredAppApplication.java. 
Before you start do this to set up Postgres:

cd database/docker
docker-compose up -d
docker exec -it bored-project-sql-container psql -Upostgres
create database boreddb

You can also switch between Postgres/Mongo and H2 environments from the application.properties file.
.
