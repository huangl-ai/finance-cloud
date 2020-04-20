package com.timegroup.financecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinanceCloudApplication.class, args);
    }


    public void bugg(){
        System.out.println("这是一个bug修复工作！");
    }

    public void bugger(){
        System.out.println("这是一个继续的bug修复工作！");
    }

}
