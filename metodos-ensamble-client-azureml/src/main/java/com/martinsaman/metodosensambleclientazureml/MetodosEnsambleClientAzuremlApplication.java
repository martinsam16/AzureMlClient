package com.martinsaman.metodosensambleclientazureml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MetodosEnsambleClientAzuremlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MetodosEnsambleClientAzuremlApplication.class, args);
    }

}
