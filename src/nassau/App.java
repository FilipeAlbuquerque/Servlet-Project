package nassau;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class App extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

		Object qtdAcessosObj = session.getAttribute("qtdAcessos");
		if (qtdAcessosObj == null) {
			session.setAttribute("qtdAcessos", 1);
		} else {
			int qtdAcessos = Integer.parseInt(qtdAcessosObj.toString());
			qtdAcessos++;
			session.setAttribute("qtdAcessos", qtdAcessos);
		}
		resp.sendRedirect("login.html");

	}

}