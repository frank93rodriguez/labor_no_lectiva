package labor_no_lectiva;



public class produccion_intelectual {
	
	private String titulo;
	private String tipo_produccion;
	private int horas_semanal;
	private int horas_mensual;
	private int avance;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	public String getTipo_produccion() {
		return tipo_produccion;
	}
	public void setTipo_produccion(String tipo_produccion) {
		this.tipo_produccion = tipo_produccion;
	}
	public produccion_intelectual(String titulo, String tipo_produccion, int horas_semanal, int horas_mensual,
			int avance) {
		super();
		this.titulo = titulo;
		this.tipo_produccion = tipo_produccion;
		this.horas_semanal = horas_semanal;
		this.horas_mensual = horas_mensual;
		this.avance = avance;
	}

	

}
