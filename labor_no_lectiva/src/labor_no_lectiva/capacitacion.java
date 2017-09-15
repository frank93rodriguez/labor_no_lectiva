package labor_no_lectiva;

public class capacitacion {
	
	private String tipo_capacitacion;
	private int horas_semanal;
	private int horas_mensual;
	private int avance;
	public String getTipo_capacitacion() {
		return tipo_capacitacion;
	}
	public void setTipo_capacitacion(String tipo_capacitacion) {
		this.tipo_capacitacion = tipo_capacitacion;
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
	public capacitacion(String tipo_capacitacion, int horas_semanal, int horas_mensual, int avance) {
		super();
		this.tipo_capacitacion = tipo_capacitacion;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
		this.avance = avance;
	}
	
	

}
