# JavaSrExam
Examen Polygon

This application is build on Spring Boot so it will run with out a proper server, the only requirement is configure a local or remote MySql instance on the application.properties file, and the creation of the database.

The application comes with a set of users:

      repository.save(new User("Luigi", "Paolino", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luigi2", "Paolino", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luigi3", "Paolino", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luis", "Perez", "55555555", "luigi.pl@gmial.com", "Norte 75"));
			repository.save(new User("Luis2", "Perez", "55555555", "luigi.pl@gmial.com", "Norte 75"));
<h1>Configure DB</h1>

Search for the file /JavaSrExam/src/main/resources/application.properties

The file look like this:

spring.jpa.hibernate.ddl-auto=create<br>
spring.datasource.url=jdbc:mysql://localhost:3306/MYSQL_EXAM?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true<br>
#spring.datasource.url=jdbc:oracle:thin://adb.us-ashburn-1.oraclecloud.com:1522/offxnzvwdri7hub_mysqlexamdb_medium.atp.oraclecloud.com<br>
spring.datasource.username=ADMIN<br>
spring.datasource.password=tx43wm4FBqtC<br>

You have to modify the highlighted properties with your oun data base connection information:

spring.jpa.hibernate.ddl-auto=create<br>
spring.datasource.url=jdbc:mysql://<b>YOUR_DB_IP:YOUR_DB_PORT/YOUR_DB_NAME</b>?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true<br>
#spring.datasource.url=jdbc:oracle:thin://adb.us-ashburn-1.oraclecloud.com:1522/offxnzvwdri7hub_mysqlexamdb_medium.atp.oraclecloud.com<br>
spring.datasource.username=<b>DB User</b><br>
spring.datasource.password=<b>DB Password</b><br>

Thancks
