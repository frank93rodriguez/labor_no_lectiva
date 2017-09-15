package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarCalidad extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String res_ofi = req.getParameter("res_ofi").trim();
		String tipo = req.getParameter("tipo").trim();
	    int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
	    int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
	    
	    calidad nueva_calidad = new calidad(res_ofi,tipo,hrs_seman,hrs_mens);
	    docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
		docente_actual.getCalidad_docente().add(nueva_calidad);
	    getServletContext().setAttribute("docente_actual", docente_actual);	

	    resp.sendRedirect("calidadacreditacion.jsp");
	    
	}
	
}
