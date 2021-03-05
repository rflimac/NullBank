package model;



public abstract class Conta{
	private Pessoa pessoa;
	private int numero;
	private int agencia;
	private boolean contaAtiva = false;

	
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	public abstract void depositarTransferir(double valor);
	public abstract void sacarTransferir(double valor);
	
	
	
	public void abrirConta() {
		if (contaAtiva == false) {
			this.contaAtiva = true;
			System.out.println("Conta aberta com sucesso");
		} else {
			System.out.println("Conta já existente");
		}
		
	}
	
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public boolean isContaAtiva() {
		return contaAtiva;
	}
	public void setContaAtiva(boolean contaAtiva) {
		this.contaAtiva = contaAtiva;
	}
	@Override
	public String toString() {
		return "Conta [pessoa=" + pessoa + ", numero=" + numero + ", agencia=" + agencia + ", contaAtiva=" + contaAtiva
				+ "]";
	}
	


	
	
	
	
	
	
}
