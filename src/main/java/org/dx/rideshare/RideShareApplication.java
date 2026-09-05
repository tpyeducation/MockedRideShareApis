package org.dx.rideshare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://github.com/tpyeducation/spring-boot-basic-db-operations/blob/main/ReadmeDocs/Urls.txt
//java -jar target/Mocked-DoctorsAndPatientsApis-TP-YEAR2.jar --spring.profiles.active=local --BANK_CREDITLIMIT=900
@SpringBootApplication
public class RideShareApplication {

	public static void main(String[] args) {
		SpringApplication.run(RideShareApplication.class, args);
	}

}
