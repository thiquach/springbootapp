package com.springboot.app.service;

import com.springboot.app.model.Bank;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    public void add(Bank bank){
        System.out.println("bank add ");
    }
}
