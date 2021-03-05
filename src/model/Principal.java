package model;

//import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);

		
		System.out.println("Conta controle");
		Pessoa p2 = new Pessoa();
		p2.setNome("João");
		p2.setCpf("5569");
		p2.setEndereco("Rua yyyyy");
		p2.setDataNascimento("25/12/2001");

		ContaCorrente cc2 = new ContaCorrente();
		cc2.setNumero(2);
		cc2.setAgencia(10);
		cc2.setSaldo(2500);
		cc2.setContaAtiva(false);
		cc2.setPessoa(p2);
		cc2.abrirConta();
		System.out.println(cc2);

		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.setAgencia(2);
		cp1.setNumero(252525);
		cp1.setSaldo(2000);
		cp1.setPessoa(p2);
		cp1.setContaAtiva(true);
		
		
		System.out.println(cp1);
		
		cp1.investimento(1000);
		
		
		
		System.out.println(cp1.getSaldo() + " " + cp1.isContaAtiva());
		
		System.out.println(cc2.getSaldo() + " " + cc2.isContaAtiva());
		
		cp1.transferir(cp1, cc2, 200);
		System.out.println(cp1.getSaldo());
		System.out.println(cc2.getSaldo());
		
		/*System.out.println("Digite o nome, cpf, endereço e data de nascimento");
		Pessoa p1 = new Pessoa();
		String pNome = sc.nextLine();
		p1.setNome(pNome);
		String pCpf = sc.nextLine();
		p1.setCpf(pCpf);
		String pEndereco = sc.nextLine();
		p1.setEndereco(pEndereco);
		String pDataNascimento = sc.nextLine();
		p1.setDataNascimento(pDataNascimento);

		System.out.println("Digite o numero da conta, agencia, saldo, se está ativa");
		ContaCorrente cc1 = new ContaCorrente();
		int cNumero = sc.nextInt();
		cc1.setNumero(cNumero);
		int cAgencia = sc.nextInt();
		cc1.setAgencia(cAgencia);
		double cSaldo = sc.nextDouble();
		cc1.setSaldo(cSaldo);
		boolean cContaAtiva = sc.nextBoolean();
		cc1.setContaAtiva(cContaAtiva);
		cc1.setPessoa(p1);
		System.out.println(cc1);

		cc1.abrirConta();

		System.out.println(cc1.isContaAtiva());

		cc1.sacar(200);

		System.out.println(cc1.getSaldo());

		cc1.sacar(1000);

		System.out.println(cc1);
		
		cc1.transferir(cc1, cc2, 750);
		
		System.out.println(cc1.getSaldo());
		System.out.println(cc2.getSaldo());*/

	}
}
