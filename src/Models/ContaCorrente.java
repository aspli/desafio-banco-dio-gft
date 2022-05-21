package Models;

public class ContaCorrente extends Conta{


    public ContaCorrente(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Models.Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
