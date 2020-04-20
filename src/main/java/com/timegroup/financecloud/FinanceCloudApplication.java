package com.timegroup.financecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceCloudApplication.class, args);
    }


    public void devlop(){
        System.out.println("这是一个bug修复工作！");
    }

}
