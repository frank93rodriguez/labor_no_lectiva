package labor_no_lectiva;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class buscar_docente extends HttpServlet{
	
	public docente buscar_docentes(String correo , String pass , ArrayList<docente> docs){
		
		if(docs==null){return null;}
		
		for(docente docen : docs){
			if(docen.getCorreo_electronico().equals(correo) && docen.getPass().equals(pass)){
				return docen;
			}
		}
		return null;
		
		
	}
	
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		
	
		String correo = req.getParameter("correo").trim();
		String pass = req.getParameter("pass").trim();
		
		ArrayList<docente> docentes = (ArrayList<docente>) getServletContext().getAttribute("docentes");
		docente docente_actual = buscar_docentes(correo,pass,docentes);
		if(docente_actual!=null){
			getServletContext().setAttribute("docente_actual", docente_actual);
			resp.sendRedirect("investigacion.jsp");
			
		}
		else{
			resp.sendRedirect("error_buscar.jsp");
		}
			
		
	}
	
	

}
