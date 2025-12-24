package com.springboot.app;

import com.springboot.app.model.Bank;
import com.springboot.app.service.BankService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);

        BankService service=context.getBean(BankService.class);
        Bank bank=context.getBean(Bank.class);
        service.add(bank);

        double totalBalance = bank.getBankTotalBalance();
        System.out.println("total balance " + totalBalance);
	}

}
