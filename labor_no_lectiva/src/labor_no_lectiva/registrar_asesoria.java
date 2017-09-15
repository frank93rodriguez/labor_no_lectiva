package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class registrar_asesoria extends HttpServlet{
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String res_ofi = req.getParameter("res_ofi").trim();
	    int nro_alumnos = Integer.parseInt(req.getParameter("nro_alumnos").trim());
	    int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
	    int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
	    String detalle = req.getParameter("detalle").trim();
	    
	    
	    asesoria nueva_asesoria = new asesoria(nro_alumnos,res_ofi,hrs_seman ,hrs_mens,detalle);
	    
	    docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
	    docente_actual.getAsesoria_docente().add(nueva_asesoria);
	    getServletContext().setAttribute("docente_actual", docente_actual);
	    
	    resp.sendRedirect("asesoriatutoria.jsp");
	}
	

}
