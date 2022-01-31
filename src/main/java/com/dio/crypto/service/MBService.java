package com.dio.crypto.service;

import com.dio.crypto.model.Moeda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "mb", url = "https://www.mercadobitcoin.net/api/")

public interface MBService {

    @RequestMapping(method = RequestMethod.GET, value = "BTC/ticker/")
    Moeda retornaMoeda();

}
