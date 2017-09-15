package labor_no_lectiva;

public class asistencia_sesiones {
	
	private int departamento_numero;
	private int departamento_horas_mes;
	private int consejo_numero;
	private int consejo_horas;
	private int cons_univ_numero;
	private int cons_univ_horas;
	public int getDepartamento_numero() {
		return departamento_numero;
	}
	public void setDepartamento_numero(int departamento_numero) {
		this.departamento_numero = departamento_numero;
	}
	public int getDepartamento_horas_mes() {
		return departamento_horas_mes;
	}
	public void setDepartamento_horas_mes(int departamento_horas_mes) {
		this.departamento_horas_mes = departamento_horas_mes;
	}
	public int getConsejo_numero() {
		return consejo_numero;
	}
	public void setConsejo_numero(int consejo_numero) {
		this.consejo_numero = consejo_numero;
	}
	public int getConsejo_horas() {
		return consejo_horas;
	}
	public void setConsejo_horas(int consejo_horas) {
		this.consejo_horas = consejo_horas;
	}
	public int getCons_univ_numero() {
		return cons_univ_numero;
	}
	public void setCons_univ_numero(int cons_univ_numero) {
		this.cons_univ_numero = cons_univ_numero;
	}
	public int getCons_univ_horas() {
		return cons_univ_horas;
	}
	public void setCons_univ_horas(int cons_univ_horas) {
		this.cons_univ_horas = cons_univ_horas;
	}
	public asistencia_sesiones(int departamento_numero, int departamento_horas_mes, int consejo_numero,
			int consejo_horas, int cons_univ_numero, int cons_univ_horas) {
		super();
		this.departamento_numero = departamento_numero;
		this.departamento_horas_mes = departamento_horas_mes;
		this.consejo_numero = consejo_numero;
		this.consejo_horas = consejo_horas;
		this.cons_univ_numero = cons_univ_numero;
		this.cons_univ_horas = cons_univ_horas;
	}
	public asistencia_sesiones() {
		super();
	}
	
	
	

}
