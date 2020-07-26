package com.martinsaman.metodosensambleclientazureml.rest;

import com.martinsaman.metodosensambleclientazureml.dto.DataDto;
import com.martinsaman.metodosensambleclientazureml.dto.DataDtoList;
import com.martinsaman.metodosensambleclientazureml.service.AzureMlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class AzureMlRest {

    @Autowired
    private AzureMlService azureMlService;

    @GetMapping
    String serviceHealthCheck() {
        return azureMlService.serviceHealthCheck();
    }

    @PostMapping("/predecir")
    List<Boolean> runMLService(@RequestBody List<DataDto> dataDtos) {
        System.out.println(dataDtos);
        return azureMlService.runMLService(DataDtoList.builder().data(dataDtos).build()).getResult();
    }
}
