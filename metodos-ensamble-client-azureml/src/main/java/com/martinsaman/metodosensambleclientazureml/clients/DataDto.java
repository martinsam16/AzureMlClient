package com.martinsaman.metodosensambleclientazureml.clients;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DataDto {

    @JsonProperty("Embarazos")
    private Integer embarazos;

    @JsonProperty("Glucosa")
    private Integer glucosa;

    @JsonProperty("PreTrueonSanguinea")
    private Integer preTrueonSanguinea;

    @JsonProperty("PliegueCutaneo")
    private Integer pliegueCutaneo;

    @JsonProperty("Insulina")
    private Integer insulina;

    @JsonProperty("Edad")
    private Integer edad;

    @JsonProperty("IndiceMasaCorporal")
    private Double indiceMasaCorporal;

    @JsonProperty("PedigriDiabetes")
    private Double pedigriDiabetes;

    @JsonProperty("MedicacionPrevia")
    private String medicacionPrevia;

    @JsonProperty("Observaciones")
    private String observaciones;

    @JsonProperty("FechaDiagostico")
    private String fechaDiagostico;

}
