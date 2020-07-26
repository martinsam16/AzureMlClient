package com.martinsaman.metodosensambleclientazureml.clients;

import com.martinsaman.metodosensambleclientazureml.dto.DataDtoList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(
        url = "http://d6ea0d2a-8a8a-4098-9833-598d3bc51802.centralus.azurecontainer.io",
        name = "ensambleClient"
)
public interface AzureMlClient {

    @GetMapping
    String serviceHealthCheck();

    @PostMapping("/score")
    String runMLService(@RequestBody DataDtoList dataDtoList);

}
