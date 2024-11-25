package atividade;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(double saldo, String titular) {
		super(saldo, titular);

	}

	@Override
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado");
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

	public double exibirSaldo() {
		return this.saldo;
	}

}
