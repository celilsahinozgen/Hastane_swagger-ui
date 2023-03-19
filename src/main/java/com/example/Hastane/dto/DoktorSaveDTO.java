package com.example.Hastane.dto;

import com.example.Hastane.model.Hastane;
import lombok.Data;



@Data
public class DoktorSaveDTO {


    private String ad;

    private String soyad;

    private Hastane hastane;
}
