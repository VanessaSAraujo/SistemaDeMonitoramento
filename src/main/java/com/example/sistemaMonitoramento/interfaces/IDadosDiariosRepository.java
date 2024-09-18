package com.example.sistemaMonitoramento.repositories;

import com.example.sistemaMonitoramento.entities.DadosDiarios;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DadosDiariosRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public DadosDiarios salvar(DadosDiarios dadosDiarios) {
        if (dadosDiarios.getId() == null) {
            entityManager.persist(dadosDiarios); // Novo registro
        } else {
            entityManager.merge(dadosDiarios); // Atualizar registro
        }
        return dadosDiarios;
    }

    public DadosDiarios buscarPorId(Integer id) {
        return entityManager.find(DadosDiarios.class, id);
    }

    public List<DadosDiarios> buscarTodos() {
        return entityManager.createQuery("FROM DadosDiarios", DadosDiarios.class).getResultList();
    }

    @Transactional
    public void deletarPorId(Integer id) {
        DadosDiarios dadosDiarios = buscarPorId(id);
        if (dadosDiarios != null) {
            entityManager.remove(dadosDiarios);
        }
    }
}
