package com.martinsaman.metodosensambleclientazureml.rest;

import com.martinsaman.metodosensambleclientazureml.clients.AzureMlClient;
import com.martinsaman.metodosensambleclientazureml.clients.DataDto;
import com.martinsaman.metodosensambleclientazureml.clients.DataDtoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AzureMlRest {

    @Autowired
    private AzureMlClient azureMlClient;

    @GetMapping
    String serviceHealthCheck() {
        return azureMlClient.serviceHealthCheck();
    }

    @PostMapping("/score")
    Object runMLService(@RequestBody List<DataDto> dataDtos) {
        System.out.println(dataDtos);
        return azureMlClient.runMLService(DataDtoList.builder().data(dataDtos).build());
    }
}
