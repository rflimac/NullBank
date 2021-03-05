package model;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	private double saldo;

	Scanner sc = new Scanner(System.in);

	public void depositar(double valor) {
		if (super.isContaAtiva() == false) {
			System.out.println("Conta não ativa");
		} else if (valor > 0) {
			this.saldo = saldo + valor;
			System.out.println("Valor depositado com sucesso");
		} else {
			System.out.println("Falha na operação");
		}

	}

	public void sacar(double valor) {
		if (super.isContaAtiva() == false) {
			System.out.println("Conta não ativa");
			System.out.println("Deseja ativar a conta? \n1 - Sim\n2 - Não");
			int a = sc.nextInt();
			if (a == 1) {
				abrirConta();
			} else {
				System.out.println("Impossível realizar saque");
			}
		}
		if (saldo >= valor) {
			this.saldo = saldo - valor;
			System.out.println("Opeção realizada com sucesso");
		} else {
			System.out.println("Operação não realizada");
			
			
			System.out.println("Deseja fazer um emprestimo? \n1 - Sim \n2 - não");
			int empr = sc.nextInt();
			if (empr == 1) {
				System.out.println("Escolha o valor do emprestimo");
				System.out.println("1 - R$ 5.000,00");
				System.out.println("2 - R$ 4.000,00");
				System.out.println("3 - R$ 3.000,00");
				System.out.println("4 - sair do menu");

				int valorEmp = sc.nextInt();
					if(valorEmp == 1) {
						System.out.println("Emprestimo de R$ 5.000,00");
						System.out.println("Juros mesal de 5% a.m.");
						System.out.println("Periodo de 24 meses para pagamento");
						System.out.println("Parcela mensal = R$ 362,35");
						System.out.println("1 - aceita \n2 - não aceita");
						int opcao = sc.nextInt();
							if( opcao == 1) {
							System.out.println("Empretimo aceito");
							this.saldo = saldo + 5000;
									if(opcao == 2) {
									System.out.println("Emprestimo não aceito");
				}// opção 02 do emprestimo 01
				}// opção 01 do emprestimo 01
							
				}// fim opção 01
					if(valorEmp == 2) {
						System.out.println("Emprestimo de R$ 4.000,00");
						System.out.println("Juros mesal de 6,5% a.m.");
						System.out.println("Periodo de 18 meses para pagamento");
						System.out.println("Parcela mensal = R$ 383,42");
						System.out.println("1 - aceita \n2 - não aceita");
						int opcao = sc.nextInt();
							if( opcao == 1) {
							System.out.println("Empretimo aceito");
							this.saldo = saldo + 4000;
									if(opcao == 2) {
									System.out.println("Emprestimo não aceito");
				}// opção 02 do emprestimo 02
				}// opção 01 do emprestimo 02	
				
					
					}//fim opção 02
					if(valorEmp == 3) {
						System.out.println("Emprestimo de R$ 3.000,00");
						System.out.println("Juros mesal de 7% a.m.");
						System.out.println("Periodo de 12 meses para pagamento");
						System.out.println("Parcela mensal = R$ 377,71");
						System.out.println("1 - aceita \n2 - não aceita");
						int opcao = sc.nextInt();
							if( opcao == 1) {
							System.out.println("Empretimo aceito");
							this.saldo = saldo + 3000;
									if(opcao == 2) {
									System.out.println("Emprestimo não aceito");
				}// opção 02 do emprestimo 03
				}// opção 01 do emprestimo 03
					
					}//fim opção 03
				

				}if(empr == 2) {
					System.out.println("Emprestimo cancelado");
				}

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
			System.out.println("Conta não ativa");

			System.out.println("Deseja ativar a conta? \n1 - Sim\n2 - Não");
			int opc = sc.nextInt();

			if (opc == 1) {
				abrirConta();
			}
			if (this.saldo >= valor) {
				contaOrigem.sacar(valor);
				contaDestino.depositar(valor);
				System.out.println("Transferência concluida com sucesso");
			} else {
				System.out.println("Falha na operação");
			}
		} else {
			System.out.println("Impossível realizar transferência");
		}
		if (contaDestino.isContaAtiva() == false) {
			System.out.println("Impossível ralizar transferência" + ",pois a conta de destino está desativada");
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
		return "Saldo " + saldo + ", Dados; " + getPessoa() + ", Número " + getNumero() + ", Agencia " + getAgencia()
				+ ", ContaAtiva " + isContaAtiva();
	}

}