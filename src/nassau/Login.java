package nassau;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Date date = new Date();
		SimpleDateFormat ultimoAcesso = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		request.getRequestDispatcher("link.html").include(request, response);

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if (password.equals("123")) {
			out.println("Bem-vindo, " + name + " .");
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			
			session.getLastAccessedTime();
			out.println(" Seu último acesso foi em : " + ultimoAcesso.format(date));

		} else {
			out.println("Desculpe, usuário ou senha incorretos!");
			request.getRequestDispatcher("login.html").include(request, response);	

		}
		out.close();
	}
}