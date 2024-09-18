package com.example.sistemaMonitoramento.interfaces;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface IDadosDiariosRepository extends JpaRepository<DadosDiarios, Integer> {

    List<DadosDiarios> findByPacienteId(Integer pacienteId);

    List<DadosDiarios> findByPacienteIdAndDataBetween(Integer pacienteId, Date startDate, Date endDate);

    List<DadosDiarios> findByData(Date data);

    List<DadosDiarios> findByPacienteIdAndData(Integer pacienteId, Date data);

    List<DadosDiarios> findByDescricaoDiaContaining(String keyword);

    List<DadosDiarios> findByDesconfortoIsNotNull();


}
