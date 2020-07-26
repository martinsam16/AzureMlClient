package com.martinsaman.metodosensambleclientazureml.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class DataDtoList {
    private List<DataDto> data;
}
