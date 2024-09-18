package com.example.sistemaMonitoramento.application;


import com.example.sistemaMonitoramento.entities.DadosDiarios;
import com.example.sistemaMonitoramento.interfaces.IDadosDiariosRepository;

import java.util.List;

public class DadosDiariosApplication {
    private IDadosDiariosRepository DadosDiariosRepository;

    public DadosDiariosApplication(IDadosDiariosRepository dadosDiariosRepository) {
        this.DadosDiariosRepository = dadosDiariosRepository;
    }

    public void adicionarDadosDiarios(DadosDiarios dadosDiarios) {
        DadosDiariosRepository.create(dadosDiarios);
    }

    public void atualizarDadosDiarios(DadosDiarios dadosDiarios) {
        int id = dadosDiarios.getId();
        DadosDiariosRepository.update(id, dadosDiarios);
    }

    public void removerDadosDiarios(int id) {
        DadosDiariosRepository.deleteById(id);
    }

    public List<DadosDiarios> listarDadosDiarios() {
        return DadosDiariosRepository.findAll();
    }
}
