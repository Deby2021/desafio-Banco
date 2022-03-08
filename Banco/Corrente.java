package Banco;

public class Corrente extends Conta {

    public Corrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInformacoesComuns();
    }

   

   
}
