package Observer;

public class Pessoa {
	private Email email;
	private String nome;

	public Pessoa(Email e) {
		this.email = e;

	}

	public void notificarNumero() {
		while (!(email.getNumeroNoticacao() == 0)) {
			System.out.print("Tem " + email.getNumeroNoticacao() + "notificao");
		}
	}

	public void abrirCaixaDeEmail() {
		email.abrirCaixaEmailRecebidos();
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
