package labor_no_lectiva;

public class tesis {
	
	private String titulo_tesis;
	private String resolucion_proveido;
	private String asesoria;
	private int horas_semanal;
	private int horas_mensual;
	private int avance;
	
	public String getTitulo_tesis() {
		return titulo_tesis;
	}
	public void setTitulo_tesis(String titulo_tesis) {
		this.titulo_tesis = titulo_tesis;
	}
	public String getResolucion_proveido() {
		return resolucion_proveido;
	}
	public void setResolucion_proveido(String resolucion_proveido) {
		this.resolucion_proveido = resolucion_proveido;
	}
	public String getAsesoria() {
		return asesoria;
	}
	public void setAsesoria(String asesoria) {
		this.asesoria = asesoria;
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
	public tesis(String titulo_tesis, String resolucion_proveido, String asesoria, int horas_semanal, int horas_mensual,
			int avance) {
		super();
		this.titulo_tesis = titulo_tesis;
		this.resolucion_proveido = resolucion_proveido;
		this.asesoria = asesoria;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
		this.avance = avance;
	}
	
	

}
