package org.example;

public class TarefaEstadoNova implements TarefaEstado {

    private TarefaEstadoNova() {};
    private static TarefaEstadoNova instance = new TarefaEstadoNova();
    public static TarefaEstadoNova getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Nova";
    }
}
