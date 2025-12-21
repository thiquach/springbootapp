package org.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringbootappApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootappApplication.class, args);

        BankService cashBank = context.getBean(BankService.class);
        double totalBalance = cashBank.getBankTotalBalance();
        System.out.println("total balance " + totalBalance);
	}

}
