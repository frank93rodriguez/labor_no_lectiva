package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarProduccionIntelectual extends HttpServlet  {
	
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String titulo = req.getParameter("titulo").trim();
		String tip_prod = req.getParameter("tip_prod").trim();
	    int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
	    int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
	    int avanc = Integer.parseInt(req.getParameter("avanc").trim());
	    
	   
		docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
		
		
		produccion_intelectual nueva_produccion = new produccion_intelectual(titulo,tip_prod,hrs_seman,hrs_mens, avanc);
		docente_actual.getProduccion_docente().add(nueva_produccion);
		
		 getServletContext().setAttribute("docente_actual", docente_actual);	
		 
		 resp.sendRedirect("produccionintelectual.jsp");
		
	}

}
