package com.example.sistemaMonitoramento.facade;

import com.example.sistemaMonitoramento.application.ClinicaApplication;
import com.example.sistemaMonitoramento.entities.Clinica;

import java.util.List;


    public class ClinicaFacade {
        private ClinicaApplication clinicaApplication;

        public ClinicaFacade(ClinicaApplication clinicaApplication) {
            this.clinicaApplication = clinicaApplication;
        }

        public void adicionarClinica(Clinica clinica) {
            clinicaApplication.adicionarClinica(clinica);
        }

        public void atualizarClinica(Clinica clinica) {
            clinicaApplication.atualizarClinica(clinica);
        }

        public void removerClinica(int id) {
            clinicaApplication.removerClinica(id);
        }

        public List<Clinica> listarClinicas() {
            return clinicaApplication.listarClinicas();
        }
    }


