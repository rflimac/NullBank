package model;

import java.util.Scanner;

public class ContaPoupanca extends Conta {
	private double saldo;

	Scanner sc = new Scanner(System.in);

	public void depositar(double valor) {
		if (super.isContaAtiva() == false) {
			System.out.println("Conta n�o ativa");
		} else if (valor > 0) {
			this.saldo = saldo + valor;
			System.out.println("Valor depositado com sucesso");
		} else {
			System.out.println("Falha na opera��o");
		}

	}

	public void sacar(double valor) {
		if (super.isContaAtiva() == false) {
			System.out.println("Conta n�o ativa");
			System.out.println("Deseja ativar a conta? \n1 - Sim\n2 - N�o");
			int a = sc.nextInt();
			if (a == 1) {
				abrirConta();
			} else {
				System.out.println("Imposs�vel realizar saque");
			}
		}
		if (saldo >= valor) {
			this.saldo = saldo - valor;
			System.out.println("Ope��o realizada com sucesso");
		}
	}

	public void sacarTransferir(double valor) {
		if (saldo >= valor) {
			this.saldo = saldo - valor;
		}
	}

	public void depositarTransferir(double valor) {
		if (valor > 0)
			this.saldo = saldo + valor;

	}

	public void transferir(Conta contaOrigem, Conta contaDestino, double valor) {
		if (contaOrigem.isContaAtiva() == false) {
			System.out.println("Conta n�o ativa");

			System.out.println("Deseja ativar a conta? \n1 - Sim\n2 - N�o");
			int opc = sc.nextInt();

			if (opc == 1) {
				abrirConta();
			}
			if (this.saldo >= valor) {
				contaOrigem.sacar(valor);
				contaDestino.depositar(valor);
				System.out.println("Transfer�ncia concluida com sucesso");
			} else {
				System.out.println("Falha na opera��o");
			}
		} else {
			System.out.println("Imposs�vel realizar transfer�ncia");
		}
		if (contaDestino.isContaAtiva() == false) {
			System.out.println("Imposs�vel ralizar transfer�ncia" + ",pois a conta de destino est� desativada");
		}
	}

	public void investimento(double valorInvest) {
		if (valorInvest <= this.saldo) {
				System.out.println("Valor aplicado ser� de " + valorInvest);
				this.saldo = saldo - valorInvest;
				System.out.println("Valor na Conta pupan�a: " + this.saldo);
				System.out.println("Valor Investido: " + valorInvest);
				}else {
			System.out.println("Investimento n�o realizado");
		}
}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [saldo=" + saldo + " " + getPessoa() + ", getNumero()=" + getNumero() + ", getAgencia()=" + getAgencia() + ", isContaAtiva()="
				+ isContaAtiva();
	}

	

}
