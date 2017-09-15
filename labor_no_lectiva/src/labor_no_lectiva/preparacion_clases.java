package labor_no_lectiva;

public class preparacion_clases {
	
	private String asignatura;
	private int horas_lectiva;
	private int preparacion_clases;
	private int examenes;
	private int trabajos;
	public String getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	public int getHoras_lectiva() {
		return horas_lectiva;
	}
	public void setHoras_lectiva(int horas_lectiva) {
		this.horas_lectiva = horas_lectiva;
	}
	public int getPreparacion_clases() {
		return preparacion_clases;
	}
	public void setPreparacion_clases(int preparacion_clases) {
		this.preparacion_clases = preparacion_clases;
	}
	public int getExamenes() {
		return examenes;
	}
	public void setExamenes(int examenes) {
		this.examenes = examenes;
	}
	public int getTrabajos() {
		return trabajos;
	}
	public void setTrabajos(int trabajos) {
		this.trabajos = trabajos;
	}
	public preparacion_clases(String asignatura, int horas_lectiva, int preparacion_clases, int examenes,
			int trabajos) {
		super();
		this.asignatura = asignatura;
		this.horas_lectiva = horas_lectiva;
		this.preparacion_clases = preparacion_clases;
		this.examenes = examenes;
		this.trabajos = trabajos;
	}
	
	

}
