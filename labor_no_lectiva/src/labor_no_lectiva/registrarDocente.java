package labor_no_lectiva;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@SuppressWarnings("serial")
public class registrarDocente extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
		String nombre = req.getParameter("nombre").trim();
		String apellido_pat = req.getParameter("apellido_pat").trim();
		String apellido_mat = req.getParameter("apellido_mat").trim();
		String dep_acad = req.getParameter("dep_acad").trim();
		String categoria = req.getParameter("categoria").trim();
		String cargo = req.getParameter("cargo").trim();
		String correo = req.getParameter("correo").trim();
		String pass = req.getParameter("pass").trim();
		
		docente nuevo_docente = new docente(correo,pass,nombre,apellido_pat,apellido_mat,dep_acad,categoria,cargo);
		
		if(getServletContext().getAttribute("docentes")!=null){
			ArrayList<docente> docentes = (ArrayList<docente>) getServletContext().getAttribute("docentes");
			docentes.add(nuevo_docente);
			getServletContext().setAttribute("docentes", docentes);
			
		}
		else{
			ArrayList<docente> docentes = new ArrayList<docente>();
			docentes.add(nuevo_docente);
			getServletContext().setAttribute("docentes", docentes);
		}
		
		resp.sendRedirect("registro_exito.jsp");
		
	}
	
	
}
