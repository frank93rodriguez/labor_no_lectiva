package labor_no_lectiva;

public class comision_permanente {
	
	private String resolucion_oficio;
	private String tipo;
	private int horas_semanal;
	private int horas_mensual;
	public String getResolucion_oficio() {
		return resolucion_oficio;
	}
	public void setResolucion_oficio(String resolucion_oficio) {
		this.resolucion_oficio = resolucion_oficio;
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
	public comision_permanente(String resolucion_oficio, String tipo, int horas_semanal, int horas_mensual) {
		super();
		this.resolucion_oficio = resolucion_oficio;
		this.tipo = tipo;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
	}
	
	

}
