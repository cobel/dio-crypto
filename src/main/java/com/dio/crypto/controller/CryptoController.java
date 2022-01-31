package com.dio.crypto.controller;

import com.dio.crypto.model.Moeda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CryptoController {

    @Autowired
    private ConsumindoApi consumindoApi;

    @GetMapping
    public Moeda retornaMoeda() {
        return consumindoApi.retornaMoeda();
    }
}
