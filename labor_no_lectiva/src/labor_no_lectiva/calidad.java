package labor_no_lectiva;

public class calidad {
	private String resolucion;
	private String tipo;
	private int horas_semanal;
	private int horas_mensual;
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public calidad(String resolucion, String tipo, int horas_semanal, int horas_mensual) {
		super();
		this.resolucion = resolucion;
		this.tipo = tipo;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
	}
	
	
	

}
