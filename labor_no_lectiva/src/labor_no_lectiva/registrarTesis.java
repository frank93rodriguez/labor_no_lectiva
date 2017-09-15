package labor_no_lectiva;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registrarTesis extends HttpServlet{
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String tit_tesis = req.getParameter("tit_tesis").trim();
		String res_prov = req.getParameter("res_prov").trim();
		String ase_dic_jur = req.getParameter("ase_dic_jur").trim();
	    int hrs_seman = Integer.parseInt(req.getParameter("hrs_seman").trim());
	    int hrs_mens = Integer.parseInt(req.getParameter("hrs_mens").trim());
	    int avanc = Integer.parseInt(req.getParameter("avanc").trim());
	    
	    tesis nueva_tesis = new tesis(tit_tesis,res_prov, ase_dic_jur,hrs_seman,hrs_mens ,avanc);
	    
	    docente docente_actual = (docente) getServletContext().getAttribute("docente_actual");
	    
	    docente_actual.getTesis_docente().add(nueva_tesis);
	    getServletContext().setAttribute("docente_actual", docente_actual);
	    
	    resp.sendRedirect("tesis.jsp");

	}

}
