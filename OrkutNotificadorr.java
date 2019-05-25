package Subject;

import java.util.ArrayList;

import Observer.Email;

public class OrkutNotificadorr implements SubjectsRedesSocial {

	private ArrayList<Email> membros = new ArrayList<Email>();

	@Override
	public void notificarInformacao(int ano, String mes, String titulo, String texto, String empresa) {
		// TODO Auto-generated method stub
		for (Email e : membros) {
			e.notificarInformacao(ano, mes, titulo, texto, empresa);
		}

	}

	@Override
	public void addEmail(Email email) {
		membros.add(email);

	}
}
