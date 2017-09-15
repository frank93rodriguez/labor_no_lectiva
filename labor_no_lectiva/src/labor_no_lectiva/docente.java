package labor_no_lectiva;

import java.util.ArrayList;

public class docente {
	
	private static int id_docente=0;
	
	private String correo_electronico;
	private String pass;
	
	
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String departamento_academico;
	private String categoria;
	private String cargo;
	
	ArrayList<investigacion> inv_docente;
	ArrayList<tesis> tesis_docente;
	ArrayList<asesoria> asesoria_docente;
	ArrayList<proyeccion_social> proyeccion_docente;
	ArrayList<produccion_intelectual> produccion_docente;
	ArrayList<capacitacion> capacitacion_docente;
	ArrayList<calidad> calidad_docente;
	ArrayList<comision_permanente> comision_docente;
	ArrayList<comision_temporal> com_temp_docente;
	ArrayList<preparacion_clases> preparacion_docente;
	asistencia_sesiones asistencia_docente;
	
	
	public docente() {
		super();
	}
		
	public docente(String correo_electronico, String pass, String nombre, String apellido_paterno,
			String apellido_materno, String departamento_academico, String categoria, String cargo) {
		super();
		this.id_docente = docente.id_docente +1;
		this.correo_electronico = correo_electronico;
		this.pass = pass;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.departamento_academico = departamento_academico;
		this.categoria = categoria;
		this.cargo = cargo;
		
		
		this.inv_docente = new ArrayList<investigacion>();
		this.tesis_docente = new ArrayList<tesis>();
		this.asesoria_docente = new ArrayList<asesoria>();
		this.proyeccion_docente = new ArrayList<proyeccion_social>();
		this.produccion_docente = new ArrayList<produccion_intelectual>();
		this.capacitacion_docente = new ArrayList<capacitacion>();
		this.calidad_docente = new ArrayList<calidad>();
		this.comision_docente = new ArrayList<comision_permanente>();
		this.com_temp_docente = new ArrayList<comision_temporal>();
		this.preparacion_docente = new ArrayList<preparacion_clases>();
		this.asistencia_docente = new asistencia_sesiones();
		
		
	}



	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getDepartamento_academico() {
		return departamento_academico;
	}
	public void setDepartamento_academico(String departamento_academico) {
		this.departamento_academico = departamento_academico;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public ArrayList<investigacion> getInv_docente() {
		return inv_docente;
	}
	public void setInv_docente(ArrayList<investigacion> inv_docente) {
		this.inv_docente = inv_docente;
	}
	public ArrayList<tesis> getTesis_docente() {
		return tesis_docente;
	}
	public void setTesis_docente(ArrayList<tesis> tesis_docente) {
		this.tesis_docente = tesis_docente;
	}
	public ArrayList<asesoria> getAsesoria_docente() {
		return asesoria_docente;
	}
	public void setAsesoria_docente(ArrayList<asesoria> asesoria_docente) {
		this.asesoria_docente = asesoria_docente;
	}
	public ArrayList<proyeccion_social> getProyeccion_docente() {
		return proyeccion_docente;
	}
	public void setProyeccion_docente(ArrayList<proyeccion_social> proyeccion_docente) {
		this.proyeccion_docente = proyeccion_docente;
	}
	public ArrayList<produccion_intelectual> getProduccion_docente() {
		return produccion_docente;
	}
	public void setProduccion_docente(ArrayList<produccion_intelectual> produccion_docente) {
		this.produccion_docente = produccion_docente;
	}
	public ArrayList<capacitacion> getCapacitacion_docente() {
		return capacitacion_docente;
	}
	public void setCapacitacion_docente(ArrayList<capacitacion> capacitacion_docente) {
		this.capacitacion_docente = capacitacion_docente;
	}
	public ArrayList<calidad> getCalidad_docente() {
		return calidad_docente;
	}
	public void setCalidad_docente(ArrayList<calidad> calidad_docente) {
		this.calidad_docente = calidad_docente;
	}
	public ArrayList<comision_permanente> getComision_docente() {
		return comision_docente;
	}
	public void setComision_docente(ArrayList<comision_permanente> comision_docente) {
		this.comision_docente = comision_docente;
	}
	public ArrayList<comision_temporal> getCom_temp_docente() {
		return com_temp_docente;
	}
	public void setCom_temp_docente(ArrayList<comision_temporal> com_temp_docente) {
		this.com_temp_docente = com_temp_docente;
	}
	public ArrayList<preparacion_clases> getPreparacion_docente() {
		return preparacion_docente;
	}
	public void setPreparacion_docente(ArrayList<preparacion_clases> preparacion_docente) {
		this.preparacion_docente = preparacion_docente;
	}
	public asistencia_sesiones getAsistencia_docente() {
		return asistencia_docente;
	}
	public void setAsistencia_docente(asistencia_sesiones asistencia_docente) {
		this.asistencia_docente = asistencia_docente;
	}

	public static int getId_docente() {
		return id_docente;
	}

	public static void setId_docente(int id_docente) {
		docente.id_docente = id_docente;
	}
	

	
}
