package Models;

import java.util.List;

public class Banco {

    private static int SEQUENCIAL = 1;
    private String nome;
    private int codigo;
    private List<Agencia> agencias;
    public Banco(String nome) {
        this.codigo = SEQUENCIAL++;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencias(List<Agencia> agencias) {
        this.agencias = agencias;
    }
}
