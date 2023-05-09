package com.example.apigraficos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.apigraficos.repository.GraficosRepository;
import com.example.apigraficos.utils.UrlUtils;

@RestController
@RequestMapping("/graficos")
public class GraficoController {

    private final GraficosRepository graficosRepository;
    private final UrlUtils urlUtils;

    public GraficoController(GraficosRepository graficosRepository, UrlUtils urlUtils) {
        this.graficosRepository = graficosRepository;
        this.urlUtils = urlUtils;
    }

    @PostMapping
    public ResponseEntity<?> criarNovoGrafico(){
        return null;
    }

    
}
