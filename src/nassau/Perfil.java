package nassau;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Perfil extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);

		HttpSession session = request.getSession(false);
		if (session != null) {
			String name = (String) session.getAttribute("name");

			out.print("Olá, " + name + " , " + " Seja Bem-vindo ao seu perfil. Existem " + ContadorSessao.getContador()
					+ " usuário(s) logado(s)");
		} else {
			out.print("Efetue o login, por favor.");
			request.getRequestDispatcher("login.html").include(request, response);

		}
		out.close();
	}
}