package com.vitor.tarefas.service;

import com.vitor.tarefas.model.Tarefa;
import com.vitor.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    // Criar nova tarefa
    public Tarefa criarTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    // Listar todas as tarefas
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    // Buscar tarefa por ID
    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefaRepository.findById(id);
    }

    // Atualizar tarefa
    public Optional<Tarefa> atualizarTarefa(Long id, Tarefa novaTarefa) {
        return tarefaRepository.findById(id).map(tarefaExistente -> {
            tarefaExistente.setTitulo(novaTarefa.getTitulo());
            tarefaExistente.setDescricao(novaTarefa.getDescricao());
            tarefaExistente.setStatus(novaTarefa.getStatus());
            tarefaExistente.setDataCriacao(novaTarefa.getDataCriacao());
            tarefaExistente.setDataConclusao(novaTarefa.getDataConclusao());
            return tarefaRepository.save(tarefaExistente);
        });
    }

    // Deletar tarefa
    public boolean deletarTarefa(Long id) {
        if (tarefaRepository.existsById(id)) {
            tarefaRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
