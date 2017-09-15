package labor_no_lectiva;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
public class registrarInvestigacion extends HttpServlet {
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String nom_proy = req.getParameter("nom_proy").trim();
		String resolucion = req.getParameter("res").trim();
		String reg_uni_inv = req.getParameter("reg_uni_inves").trim();
		String actividades = req.getParameter("activ").trim();
		int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
		int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
		int avance = Integer.parseInt(req.getParameter("avanc"));
		
		docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
	
		investigacion nueva_investigacion = new investigacion(nom_proy,resolucion,reg_uni_inv,actividades,hrs_seman,hrs_mens,avance);
		docente_actual.getInv_docente().add(nueva_investigacion);
		getServletContext().setAttribute("docente_actual", docente_actual);
		
		resp.sendRedirect("investigacion.jsp");
	}

}
