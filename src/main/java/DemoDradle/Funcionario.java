package DemoDradle;

import java.sql.Date;

public class Funcionario {

	private String nome;
	private float salario;
	private Date data;
	private int idade;
	private String cpf;
	
	public Funcionario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome : "+ this.nome+"\nSalario : "+this.salario+"\nCpf : "+this.cpf+"\nEntrada : "+this.data+"\nIdade : "+this.idade;
	}
	
}
