package App;

public class Elemento {
	private String titulo;
	private int duracion;
	private Boolean estado;
	private String descripcion;

	
	public Elemento (String titulo, int duracion, Boolean estado, String descripcion ) {
		this.titulo=titulo;
		this.duracion=duracion;
		this.estado=estado;
		this.descripcion=descripcion;
		
	 }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nTitulo: "+getTitulo()+ 
			   "\nDuracion: "+getDuracion()+ 
			   "\nEstado: " +estado+ 
			   "\nDescripcion: "+getDescripcion();
	}

}
