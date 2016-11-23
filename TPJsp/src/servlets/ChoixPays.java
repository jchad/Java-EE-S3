package servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

	public class ChoixPays extends HttpServlet{
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Séjours</title>");
			out.println("</head>");
			out.println("</body>");
			out.println("<H1 align='center'>FAITES VOTRE CHOIX:</H1>");
			out.println("<br><br>");
			out.println("<A href='contenu/catalogue/belgique.html'>Belgique</A>");
			out.println("<A href='contenu/catalogue/espagne.html'>Espagne</A>");
			out.println("<A href='contenu/catalogue/italie.html'>Italie</A>");
			out.println("<br><br>");
			out.println("</body></html>");
		}
	}
