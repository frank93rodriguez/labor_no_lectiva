package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarProyeccion extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String act_real = req.getParameter("act_real").trim();
		String res_apro = req.getParameter("res_apro").trim();
	    int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
	    int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
	    int avanc = Integer.parseInt(req.getParameter("avanc").trim());
	    
		proyeccion_social nueva_proyeccion = new proyeccion_social(act_real,res_apro,hrs_seman,hrs_mens,avanc);
		docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
		docente_actual.getProyeccion_docente().add(nueva_proyeccion);
	    getServletContext().setAttribute("docente_actual", docente_actual);	 
	    
	    resp.sendRedirect("proyeccionsocial.jsp");
		
	}
	
	
	

}
