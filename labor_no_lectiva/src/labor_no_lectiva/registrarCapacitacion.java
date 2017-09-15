package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarCapacitacion extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String tipo = req.getParameter("tipo").trim();
	    int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
	    int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
	    int avanc = Integer.parseInt(req.getParameter("avanc").trim());
		
	    capacitacion nueva_capacitacion = new capacitacion(tipo,hrs_seman,hrs_mens,avanc);
	    
	    docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
		docente_actual.getCapacitacion_docente().add(nueva_capacitacion);
	    getServletContext().setAttribute("docente_actual", docente_actual);	

	    resp.sendRedirect("capacitacion.jsp");
	}
	
	
	

}
