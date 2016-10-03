package nassau;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ContadorSessao implements HttpSessionListener {
	private static int contador;

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		contador++;
		System.out.println("Sessao criada");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		contador--;
		System.out.println("Sessao destruida");
	}

	public static final int getContador() {
		return contador;
	}
}