package App;



	public class Dvd extends Elemento{
		private String director;
		public Dvd(String titulo, int duracion, Boolean estado, String descripcion, String director) {
			super(titulo, duracion, estado, descripcion);
			this.director=director;
			// TODO Auto-generated constructor stub
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString()+"\nDirector: "+getDirector();
}
		
		
	
		
		
		

	}
