package labor_no_lectiva;

public class proyeccion_social {
	private String actividades_realizadas;
	private String resolucion_aprobacion;
	private int horas_semanal;
	private int horas_mensual;
	private int avance;
	public String getActividades_realizadas() {
		return actividades_realizadas;
	}
	public void setActividades_realizadas(String actividades_realizadas) {
		this.actividades_realizadas = actividades_realizadas;
	}
	public String getResolucion_aprobacion() {
		return resolucion_aprobacion;
	}
	public void setResolucion_aprobacion(String resolucion_aprobacion) {
		this.resolucion_aprobacion = resolucion_aprobacion;
	}
	public int getHoras_semanal() {
		return horas_semanal;
	}
	public void setHoras_semanal(int horas_semanal) {
		this.horas_semanal = horas_semanal;
	}
	public int getHoras_mensual() {
		return horas_mensual;
	}
	public void setHoras_mensual(int horas_mensual) {
		this.horas_mensual = horas_mensual;
	}
	public int getAvance() {
		return avance;
	}
	public void setAvance(int avance) {
		this.avance = avance;
	}
	public proyeccion_social(String actividades_realizadas, String resolucion_aprobacion, int horas_semanal,
			int horas_mensual, int avance) {
		super();
		this.actividades_realizadas = actividades_realizadas;
		this.resolucion_aprobacion = resolucion_aprobacion;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
		this.avance = avance;
	}
	
	

}
