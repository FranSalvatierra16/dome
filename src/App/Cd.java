package App;

public class Cd extends Elemento{
private String cantante;
	public Cd(String titulo, int duracion, Boolean estado, String descripcion,String cantante) {
		super(titulo, duracion, estado, descripcion);
	this.cantante=cantante;
		// TODO Auto-generated constructor stub
	}
	public String getCantante() {
		return cantante;
	}
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString()+"\nCantante: "+getCantante();
		}
	
	
}
