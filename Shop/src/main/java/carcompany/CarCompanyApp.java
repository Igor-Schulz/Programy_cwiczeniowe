package carcompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling // TODO eventually further features
@SpringBootApplication
@EnableAspectJAutoProxy
public class CarCompanyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CarCompanyApp.class, args);
	}

}
