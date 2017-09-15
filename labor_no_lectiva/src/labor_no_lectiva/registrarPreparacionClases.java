package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarPreparacionClases  extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String asig = req.getParameter("asig").trim();
	    int hrs_lec = Integer.parseInt(req.getParameter("hrs_lec").trim()); 
	    int prep_clas = Integer.parseInt(req.getParameter("prep_clas").trim()); 
	    int examenes = Integer.parseInt(req.getParameter("exam").trim()); 
	    int trab = Integer.parseInt(req.getParameter("trab").trim()); 
	    
	    preparacion_clases nueva_preparacion = new preparacion_clases(asig,hrs_lec,prep_clas,examenes,trab);

	    docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
		docente_actual.getPreparacion_docente().add(nueva_preparacion);
	    getServletContext().setAttribute("docente_actual", docente_actual);	
	
	    
	    resp.sendRedirect("preparacionclases.jsp");
		
	}

}
