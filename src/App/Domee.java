package App;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Domee {
	
	 Elemento[] lista_videos;
	 int vlista;
	 Cd[] list_cd;
	 int vCd;
	 Dvd[] list_dvd;
	 int vdvd;
	 static Scanner kb;
	 public Domee(){
		 lista_videos= new Elemento[10];
		 vlista=0;
		 list_cd= new Cd[5];
		 vCd=0;
		 list_dvd= new Dvd[5];
		 vdvd=0;
	 }
	
	 public Dvd cargarDvd(String titulo, int duracion, Boolean estado, String descripcion, String director) {
		
		 Dvd nuevodvd= new Dvd(titulo, duracion, estado, descripcion, director);
		 int pos=buscarUltimapos();
		 int posdvd=buscarUltimaposDvd();
		 lista_videos[pos]=nuevodvd;
		 list_dvd[posdvd]=nuevodvd;
		 vdvd++;
		 vlista++;
		 return nuevodvd; 
		 
	}
	 public Cd cargarCd(String titulo, int duracion, Boolean estado, String descripcion,String cantante) {
		 Cd nuevocd= new Cd (titulo, duracion, estado, descripcion, cantante);
		 int pos=buscarUltimapos();
		 int poscd=buscarUltimaposcd();
		 lista_videos[pos]=nuevocd;
		 list_cd[poscd]=nuevocd;
		 vCd++;
		 vlista++;
		 return nuevocd; 
		 
	}
	 public int buscarUltimapos()
		{
			int i=0;
			while(lista_videos[i]!=null&&i<=vlista)
			{
				i++;
			}
			return i;
		}
	 public int buscarUltimaposDvd()
		{
			int i=0;
			while(list_dvd[i]!=null&&i<=vdvd)
			{
				i++;
			}
			return i;
		}
	 public int buscarUltimaposcd()
		{
			int i=0;
			while(list_cd[i]!=null&&i<=vCd)
			{
				i++;
			}
			return i;
		}
	
	
	 public void mostrar_lista() {
			
		 int i=0;
		 while(lista_videos[i]!=null) {

		 System.out.println(lista_videos[i].toString());
		 i++;
		 		
		 	}
		 }
	 public void mostrar_listacd() {
			
		 int i=0;
		 while(list_cd[i]!=null) {

		 System.out.println(list_cd[i].toString());
		 i++;
		 		
		 	}
		 }
	 public void mostrar_listadvd() {
			
		 int i=0;
		 while(list_dvd[i]!=null) {

		 System.out.println(list_dvd[i].toString());
		 i++;
		 		
		 	}
		 }
	 public void buscardirector(String director)
	 {
		 int i=0;
		 int flag=0;
		while(list_dvd[i]!=null)
		{
			if(list_dvd[i].getDirector().equals(director))
			{
				 System.out.println(list_dvd[i].toString());
				flag=1;
				
		}
			i++;
		
			 
	 }
		if(flag==0)
		{
			System.out.println("El director "+director+ " no se encuentra");
		}
	 }
		public void buscarcantante(String cant)
		 {
			
			int i=0;
			int flag=0;
		
			while(list_cd[i]!=null)
			{
				
				if(list_cd[i].getCantante().equals(cant)) {
					
					flag=1;
					System.out.println(list_cd[i].toString());
					i++;
				
		}
				else {
				i++;
			
			}
			}

				if(flag==0)
				{
					System.out.println("El cantante "+cant+ " no se encuentra");
				}
				
			 
		 
			

}
	
}
