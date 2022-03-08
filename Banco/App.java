package Banco;
public class App {
    public static void main(String[] args) throws Exception {
        Cliente debora = new Cliente();
        debora.setNome("Débora");
        
        Conta cc = new Corrente(debora);
        Conta poupanca = new ContaPoupanca(debora);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
