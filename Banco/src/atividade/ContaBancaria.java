package atividade;

public abstract class ContaBancaria {
protected double saldo;
protected String titular;

public ContaBancaria(double saldo, String titular) {
	super();
	this.saldo = saldo;
	this.titular = titular;
}

public abstract void sacar(double valor);

}
