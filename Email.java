package Observer;

import java.util.ArrayList;

public class Email {
	public ArrayList<String> informcaAmazenados = new ArrayList<String>();
	private String nomeDono;
	private int ano;
	private String mes;
	private String titulo;
	private String texto;

	private String empresa;

	public void notificarInformacao(int ano, String mes, String titulo, String texto, String empresa) {
		this.setAno(ano);
		this.setMes(mes);
		this.setTexto(texto);
		this.setTitulo(titulo);
		this.setEmpresa(empresa);
		informcaAmazenados.add(ano + "" + mes + titulo + texto + empresa);

	}

	public void notificar() {
		System.out.println("EMAIL:" + this.getEmpresa());
		System.out.println(this.getTitulo());
		System.out.println(this.getTexto());
			for (int i = 0,valor=100; i < this.getTexto().length(); i+=99) {
			     for(int j = 0; j<valor; j++){
					System.out.print(this.getTexto().charAt(i + j));
		
		}
				
			}

	}

	public void abrirCaixaEmailRecebidos() {
		for (String s : informcaAmazenados) {
			System.out.println(s);
		}

	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public ArrayList<String> getInformcaAmazenados() {
		return informcaAmazenados;
	}

	public void setInformcaAmazenados(ArrayList<String> informcaAmazenados) {
		this.informcaAmazenados = informcaAmazenados;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
