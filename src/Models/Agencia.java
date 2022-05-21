package Models;

import java.util.List;

public class Agencia {

    private static int SEQUENCIAL = 1;
    private int numero = 1;
    private Endereco endereco;
    private List<Cliente> clientes;

    public Agencia(Endereco endereco) {
        this.numero = SEQUENCIAL++;
        this.endereco = endereco;
    }

}
