package atividade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	static ArrayList<ContaBancaria> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente(4000.00, "Lucas");
		ContaPoupanca conta2 = new ContaPoupanca(3000.00, "Eduardo");
		Banco b = new Banco();
		b.adicionarConta(conta1);
		b.adicionarConta(conta2);
		b.realizaSaques(300.00);

	}

	public void adicionarConta(ContaBancaria conta) {
		contas.add(conta);
		System.out.println("Conta de:" + conta.titular + " Adicionada");
		System.out.println("==========================");
	}

	public void realizaSaques(double valor) {
		for (ContaBancaria contaBancaria : contas) {
			contaBancaria.sacar(valor);
			System.out.println("Novo Saldo R$" + contaBancaria.saldo);
			System.out.println("==========================");
		}
	}

	public List<String> resumoContas(){
		List<String> resumo = new ArrayList<String>();
		for (ContaBancaria conta : contas) {
			resumo.add("Titular" + conta.titular + "Saldo" + conta.saldo);
		}
		return resumo;
		
	}
	
}
