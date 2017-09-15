package labor_no_lectiva;

public class investigacion {
	
	private String nombre;
	private String resolucion;
	private String reg_uni_inves;
	private String actividades_avance;
	private int horas_mensual;
	private int horas_semanal;
	private int porcentaje_avance;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getReg_uni_inves() {
		return reg_uni_inves;
	}
	public void setReg_uni_inves(String reg_uni_inves) {
		this.reg_uni_inves = reg_uni_inves;
	}
	public String getActividades_avance() {
		return actividades_avance;
	}
	public void setActividades_avance(String actividades_avance) {
		this.actividades_avance = actividades_avance;
	}
	public int getHoras_semanal() {
		return horas_semanal;
	}
	public void setHoras_semanal(int horas_semanal) {
		this.horas_semanal = horas_semanal;
	}
	public int getPorcentaje_avance() {
		return porcentaje_avance;
	}
	public void setPorcentaje_avance(int porcentaje_avance) {
		this.porcentaje_avance = porcentaje_avance;
	}
	public investigacion(String nombre, String resolucion, String reg_uni_inves, String actividades_avance,
			int horas_mensual,int horas_semanal, int porcentaje_avance) {
		super();
		this.nombre = nombre;
		this.resolucion = resolucion;
		this.reg_uni_inves = reg_uni_inves;
		this.actividades_avance = actividades_avance;
		this.horas_mensual = horas_mensual;
		this.horas_semanal = horas_semanal;
		this.porcentaje_avance = porcentaje_avance;
	}
	
	
	
}
