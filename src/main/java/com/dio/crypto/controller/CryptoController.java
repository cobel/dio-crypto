package com.dio.crypto.controller;

import com.dio.crypto.model.Moeda;
import com.dio.crypto.service.MBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CryptoController {

    @Autowired
    private MBService mbService;

    @GetMapping
    public Moeda retornaMoeda() {
        return mbService.retornaMoeda();
    }
}
