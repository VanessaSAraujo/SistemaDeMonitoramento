package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.entities.ObservacoesMedicas;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDadosDiariosRepository {

    @Transactional
    void create(DadosDiarios dadosDiarios);

    DadosDiarios findById(Integer id);

    List<DadosDiarios> findAll();

    List<DadosDiarios> findByName(String name);

    @Transactional
    void update(int id, DadosDiarios dadosDiarios);

    @Transactional
    void deleteById(int id);
}
