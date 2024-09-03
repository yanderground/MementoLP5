package org.example;

public class TarefaEstadoConcluida implements TarefaEstado {

    private TarefaEstadoConcluida() {};
    private static TarefaEstadoConcluida instance = new TarefaEstadoConcluida();
    public static TarefaEstadoConcluida getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Concluída";
    }
}
