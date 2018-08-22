package br.unitins.helloworldjsf2.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ExemploAjaxController implements Serializable{

	private static final long serialVersionUID = 7226429401127143745L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprimirConsole() {
		System.out.println("Imprimir no Console");
	}

}
