package nassau;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class AtributoListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent se) {
		System.out.println("Atributo adicionado ");
		System.out.println("nome do atributo" + se.getName());
		System.out.println("valor do atributo" + se.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent se) {
		System.out.println("Atributo removido ");
		System.out.println("nome do atributo" + se.getName());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent se) {
		System.out.println("Atributo atualizado ");
		System.out.println("nome do atributo" + se.getName());
		System.out.println("valor do atributo" + se.getValue());
	}

}