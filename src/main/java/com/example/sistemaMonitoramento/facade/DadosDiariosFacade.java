package com.example.sistemaMonitoramento.facade;

import com.example.sistemaMonitoramento.application.ClinicaApplication;
import com.example.sistemaMonitoramento.application.DadosDiariosApplication;
import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.entities.DadosDiarios;

import java.util.List;

public class DadosDiariosFacade {

        private DadosDiariosApplication dadosDiariosApplication;

        public DadosDiariosFacade(DadosDiariosApplication dadosDiariosApplication) {
            this.dadosDiariosApplication = dadosDiariosApplication;
        }

        public void adicionarDadosDiarios(DadosDiarios dadosDiarios) {
            dadosDiariosApplication.adicionarDadosDiarios(dadosDiarios);
        }

        public void atualizarDadosDiarios(DadosDiarios dadosDiarios) {
            dadosDiariosApplication.atualizarDadosDiarios(dadosDiarios);
        }

        public void removerDadosDiarios(int id) {
            dadosDiariosApplication.removerDadosDiarios(id);
        }

        public List<DadosDiarios> listarDados() {
            return dadosDiariosApplication.listarDadosDiarios();
        }
    }


