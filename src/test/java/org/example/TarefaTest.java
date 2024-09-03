package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaTest {

    @Test
    void deveArmazenarEstados() {
        Tarefa tarefa = new Tarefa();
        tarefa.setEstado(TarefaEstadoNova.getInstance());
        tarefa.setEstado(TarefaEstadoEmProgresso.getInstance());
        assertEquals(2, tarefa.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Tarefa tarefa = new Tarefa();
        tarefa.setEstado(TarefaEstadoNova.getInstance());
        tarefa.setEstado(TarefaEstadoEmProgresso.getInstance());
        tarefa.restauraEstado(0);
        assertEquals(TarefaEstadoNova.getInstance(), tarefa.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Tarefa tarefa = new Tarefa();
        tarefa.setEstado(TarefaEstadoNova.getInstance());
        tarefa.setEstado(TarefaEstadoEmProgresso.getInstance());
        tarefa.setEstado(TarefaEstadoEmRevisao.getInstance());
        tarefa.setEstado(TarefaEstadoConcluida.getInstance());
        tarefa.restauraEstado(2);
        assertEquals(TarefaEstadoEmRevisao.getInstance(), tarefa.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Tarefa tarefa = new Tarefa();
            tarefa.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}
