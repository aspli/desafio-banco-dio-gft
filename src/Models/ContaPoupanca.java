package Models;

public class ContaPoupanca extends Conta {


    public ContaPoupanca(Agencia agencia, Cliente cliente) {
        super(agencia, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Models.Conta Poupança ===");
        super.imprimirInfosComuns();
    }

}