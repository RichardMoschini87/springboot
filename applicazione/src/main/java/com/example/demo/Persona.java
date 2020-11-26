package com.example.demo;

public class Persona {
	private String nome;

	public Persona(String nome, String cog) {
		super();
		this.nome = nome;
		this.cog = cog;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCog() {
		return cog;
	}

	public void setCog(String cog) {
		this.cog = cog;
	}

	private String cog;
}
