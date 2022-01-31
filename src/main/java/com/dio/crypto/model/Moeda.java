package com.dio.crypto.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Moeda {

    private String ticker;
    private Double high;
    private Double low;
    private Double vol;
    private Double last;
    private Double buy;
    private Double sell;
    private Integer date;

}
