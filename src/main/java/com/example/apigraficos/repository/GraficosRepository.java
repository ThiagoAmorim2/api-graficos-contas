package com.example.apigraficos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apigraficos.Specification.GraficoSpecification;
import com.example.apigraficos.model.dao.GraficosDAO;

public interface GraficosRepository extends JpaRepository<GraficosDAO, String>, GraficoSpecification{
    
}
