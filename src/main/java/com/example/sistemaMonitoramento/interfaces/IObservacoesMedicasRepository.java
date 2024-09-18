package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.ObservacoesMedicas;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IObservacoesMedicasRepository {

    @Transactional
    void create(ObservacoesMedicas observacoesMedicas);

    ObservacoesMedicas findById(Integer id);

    List<ObservacoesMedicas> findAll();

    List<ObservacoesMedicas> findByName(String name);

    @Transactional
    void update(int id, ObservacoesMedicas observacoesMedicas);

    @Transactional
    void deleteById(int id);
}
