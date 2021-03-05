package model;

	public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	private String dataNascimento;
	

	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cpf, String endereco, String dataNascimento) {
		setNome(nome);
		setCpf(cpf);
		setEndereco(endereco);
		setDataNascimento(dataNascimento);
	}
	
	public Pessoa(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Nome = " + nome 
				+ ", CPF = " + cpf 
				+ ", Endereço = " + endereco 
				+ ", Data de nascimento = " + dataNascimento;
	}

	
	
	
	
}
