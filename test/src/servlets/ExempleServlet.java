package servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ExempleServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		int i=5;
		PrintWriter out= response.getWriter();
		out.println("<html>"+"<body>"+"<h1>Un exemple de servlet </h1>"+"<br/>"+"valeur de i : "+i+"</body></html>");
	}

}
