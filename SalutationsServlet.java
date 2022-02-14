import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*;

public class SalutationsServlet extends HttpServlet {
 public void service( HttpServletRequest request, HttpServletResponse response )throws ServletException, IOException { 
	response.setContentType( "text/html" ); 
	PrintWriter out = response.getWriter(); 
	out.println( "<html><body>" ); 
	out.println( "<h1>Bonjour Samer Khallouf</h1>" ); 
	out.println( "</body></html>" ); 
 } 
}