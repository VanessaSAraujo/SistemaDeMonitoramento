package com.example.sistemaMonitoramento.application;

import com.example.sistemaMonitoramento.entities.Clinica;
import com.example.sistemaMonitoramento.interfaces.IClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicaApplication {

    private IClinicaRepository clinicaRepository;

    @Autowired
    public ClinicaApplication(IClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }

    public void adicionarClinica(Clinica clinica) {
        clinicaRepository.create(clinica);
    }

    public void atualizarClinica(Clinica clinica) {
        int id = clinica.getId();
        clinicaRepository.update(id, clinica);
    }

    public void removerClinica(int id) {
        clinicaRepository.deleteById(id);
    }

    public List<Clinica> listarClinicas() {
        return clinicaRepository.findAll();
    }
}

