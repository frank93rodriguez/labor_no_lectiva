package labor_no_lectiva;

public class asesoria {
	
	private int alumnos;
	private String resolucion_oficio;
	private int horas_semanal;
	private int horas_mensual;
	private String detalle;
	
	public int getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}
	public String getResolucion_oficio() {
		return resolucion_oficio;
	}
	public void setResolucion_oficio(String resolucion_oficio) {
		this.resolucion_oficio = resolucion_oficio;
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
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public asesoria(int alumnos, String resolucion_oficio, int horas_semanal, int horas_mensual, String detalle) {
		super();
		this.alumnos = alumnos;
		this.resolucion_oficio = resolucion_oficio;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
		this.detalle = detalle;
	}
	
	

}
