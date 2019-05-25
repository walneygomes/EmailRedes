package Subject;

import Observer.Email;

public interface SubjectsRedesSocial {

	public void notificarInformacao(int ano, String mes, String titulo, String texto, String empresa);

	public void addEmail(Email email);
}
