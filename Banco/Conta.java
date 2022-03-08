package Banco;

public abstract class Conta implements IConta{
    //visibilidade apenas nesta classe
    private static final int AGENCIA_PADRAO = 150;
    private static int SEQUENCIAL = 1;

    //visibilidade para as classes filhas
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    

    
    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public void sacar(){}

    public void depoistar(){}

    public void transferir(){}

    @Override
    public void sacar(double valor) {
       saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);        
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        
    }
    protected void imprimirInformacoesComuns() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", saldo));
        
    }

    
    
}
