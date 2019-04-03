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

spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/MYSQL_EXAM?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
#spring.datasource.url=jdbc:oracle:thin://adb.us-ashburn-1.oraclecloud.com:1522/offxnzvwdri7hub_mysqlexamdb_medium.atp.oraclecloud.com
spring.datasource.username=ADMIN
spring.datasource.password=tx43wm4FBqtC

You have to modify the highlighted properties with your oun data base connection information:

spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://<b>localhost:3306/MYSQL_EXAM</b>?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
#spring.datasource.url=jdbc:oracle:thin://adb.us-ashburn-1.oraclecloud.com:1522/offxnzvwdri7hub_mysqlexamdb_medium.atp.oraclecloud.com
spring.datasource.username=<b>ADMIN</b>
spring.datasource.password=<b>tx43wm4FBqtC</b>

Thancks
