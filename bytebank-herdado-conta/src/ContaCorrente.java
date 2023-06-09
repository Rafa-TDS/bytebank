public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);//chama o construtor da classe mãe, não se faz necessário, nesse caso apenas está explícito
    }

    @Override
    public void deposita(double valor) {
        super.saldo += + valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
