package com.martinsaman.metodosensambleclientazureml.service;

import com.google.gson.Gson;
import com.martinsaman.metodosensambleclientazureml.clients.AzureMlClient;
import com.martinsaman.metodosensambleclientazureml.dto.DataDtoList;
import com.martinsaman.metodosensambleclientazureml.dto.ScoreDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AzureMlService {

    @Autowired
    private AzureMlClient azureMlClient;

    @Autowired
    private Gson gson;

    public String serviceHealthCheck() {
        return azureMlClient.serviceHealthCheck();
    }

    public ScoreDto runMLService(DataDtoList dataDtoList) {
        return gson.fromJson(gson.fromJson(azureMlClient.runMLService(dataDtoList), String.class), ScoreDto.class);
    }
}
