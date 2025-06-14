package com.vitor.tarefas.repository;

import com.vitor.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Aqui você pode criar métodos customizados se quiser, como buscar por status
}
