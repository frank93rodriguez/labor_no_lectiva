package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarAsistenciaSesiones extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		
	    int dep_num_ses = Integer.parseInt(req.getParameter("dep_num_ses").trim());
	    int dep_horas_mes = Integer.parseInt(req.getParameter("dep_horas_mes").trim());
	    int cons_num_ses = Integer.parseInt(req.getParameter("cons_num_ses").trim());
	    int cons_hrs_mes = Integer.parseInt(req.getParameter("cons_hrs_mes").trim());
	    int cons_univ = Integer.parseInt(req.getParameter("cons_univ").trim());
	    int cons_uni_hrs_mes = Integer.parseInt(req.getParameter("cons_uni_hrs_mes").trim());
	    
	    asistencia_sesiones nueva_asistencia = new asistencia_sesiones(dep_num_ses,dep_horas_mes,cons_num_ses,cons_hrs_mes,cons_univ,cons_uni_hrs_mes);

	    docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
		docente_actual.setAsistencia_docente(nueva_asistencia);
	    getServletContext().setAttribute("docente_actual", docente_actual);	

	    resp.sendRedirect("asistencia.jsp");

	}
	
	
}
