package App;

import java.util.Scanner;



public class Main {
static Scanner kb;
 
	
	public static void main(String[] args) {
	kb=new Scanner(System.in);
	Domee oficina= new Domee();
	Boolean continuar=true;
	int tipo_carga;
	Dvd dvd1=null;
	Cd cd1=null;

	
	while(continuar==true)
	{
		tipo_carga=0;
		System.out.println("\n 1.Agregar dvd \n 2.Agregar cd \n 3.Buscar cantante \n 4.Buscar director \n 5.Mostrar cd disponibles \n 6.Mostrar dvd disponibles \n 7.Salir");
tipo_carga=kb.nextInt();

switch (tipo_carga) {

case 1: 
	String nombre="";
	int tiem=0;
	Boolean hola=true;
	String descr="";
	String direc="";
	System.out.println("Titulo: ");
	kb.nextLine();
	nombre=kb.nextLine();
	System.out.println("Tiempo:  ");
	
	tiem=kb.nextInt();
	System.out.println("Descripcion: ");
	kb.nextLine();
	descr=kb.nextLine();
	System.out.println("Director: ");
	kb.nextLine();
	direc=kb.nextLine();
	System.out.println("Cargado correctamente!");
	
dvd1= oficina.cargarDvd(nombre, tiem, hola, descr, direc);

break;
case 2:
	cd1= oficina.cargarCd("Vete", 3, true, "GO", "Santiago");
		break;
case 3:
	String cant="";
	System.out.println("Ingrese nombre del cantante a buscar ");
	kb.nextLine();
	cant=kb.nextLine();
	oficina.buscarcantante(cant);
	break;
case 4:
	
	String dir="";
	System.out.println("Ingrese nombre del director a buscar ");
	kb.nextLine();
	dir=kb.nextLine();
	oficina.buscardirector(dir);
	break;
case 5:
	oficina.mostrar_listacd();
	break;
case 6:
	oficina.mostrar_listadvd();
	break;
	
case 7:
	continuar=false;
	

	break;

default:
	System.out.println("Opcion invalida");
	break;
}


}
	oficina.mostrar_lista();
	}
	public static void	cargandoDvd( String nombre,int  tiem,String descr,String direc)
	{
		 
		
		
	}
}
