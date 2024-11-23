package e_libro;

import java.util.Scanner;

import segunda_Evaluacion_POO.Fecha;
import segunda_Evaluacion_POO.Persona;

public class Libro {
	static int numtotallibros;
	int numlibro;
	String titulo;
	String ed;
	Persona autor;
	String isbn;
	String lugar;
	Fecha fecha;
	int paginas;
	
	public Libro() {};
	
	public Libro(String nombre) {
		this.titulo=nombre;
	}
	public Libro(String nombre,	String ed, Persona autor, String isbn,String lugar,Fecha fecha, int paginas) {
		this.titulo=nombre;
		this.ed=ed;
		this.autor=autor;
		this.isbn=isbn;
		this.lugar=lugar;
		this.fecha=fecha;
		this.paginas=paginas;
		this.numlibro=this.numtotallibros+1;
		this.numtotallibros++;
	}
	
	///crear este metodo en el main para que no haya syso en la clase:
	public static String crearArrayLibro(Libro [] lib){
		for (int i=0;i<lib.length;i++) {
				Scanner sc= new Scanner(System.in);
				System.out.println("Por favor introduce el titulo del libro " + (i+1));
				String n=(sc.nextLine());
				System.out.println("introduce la edicion");
				String ed= (sc.nextLine());
				
				//guardamos el nombre y el apellido del autor en una variable y los usamos en el constructor de la persona
				System.out.println("introduce el nombre del autor");
				String nombreAutor=sc.nextLine();
				String apellidoAutor=sc.nextLine();
				Persona autor=new Persona(nombreAutor,apellidoAutor);
				System.out.println("introduce el ISBN");
				String isbn= sc.nextLine();
				System.out.println("pls introduce la ciudad y el país");
				String lugar=sc.nextLine();
				
				// conseguimos las variables de la fecha para utilizarlo dentro de la clase libro.
				System.out.println("pls introduce primero el dia de creacion en formato dd");
				int d=sc.nextInt();
				System.out.println("pls introduce primero el mes de creacion en formato mm");
				int m= sc.nextInt();
				System.out.println("pls introduce primero el año de creacion en formato aaaa");
				int a=sc.nextInt();
				Fecha fecha=new Fecha(d,m,a);
				System.out.println("introduce el numero de páginas");
				int pags=sc.nextInt();
				lib[i]= (new Libro(n,ed,autor,isbn,lugar,fecha,pags));
				}
		return "ya esta";
	}
	
	public void setTitulo(String nombre) {
		this.titulo=nombre;
	}
	public void setEd(String nombre) {
		this.ed=nombre;
	}
	public void setPersona(Persona nombre) {
		this.autor=nombre;
	}
	public void setlugar(String ciudad, String pais) {
		this.lugar=ciudad + ","+"pais";
	}
	public void setFecha(Fecha nombre) {
		this.fecha=nombre;
	}
	public void setPaginas(int nombre) {
		this.paginas=nombre;
	}
	public static int getLibros() {
		return numtotallibros;
	}
	public String toStringlibro(int idLibro) throws Exception{
		String r= "LIBRO NUMERO "+this.numlibro+"\n";
		if (idLibro== this.numlibro){
			r+= "LIBRO NUMERO "+this.numlibro+"\n";
			r+="Titulo: "+ this.titulo +"\n";
			r+="Edicion: "+ this.ed +"\n";
			r+="Autor: "+ this.autor + "\n";
			r+="ISBN: "+ this.isbn +"\n";
			r+="Lugar: "+ this.lugar +"\n";
			r+="Fecha: "+ this.fecha +"\n";
			r+="Paginas: "+ this.paginas +"\n";
		}
		else  throw new Exception("El libro no existe");
		return r;
		
	}
	public String toString() {
		String r= "LIBRO NUMERO "+this.numlibro+"\n";
		r+="Titulo: "+ this.titulo +"\n";
		r+="Edicion: "+ this.ed +"\n";
		r+="Autor: "+ this.autor + "\n";
		r+="ISBN: "+ this.isbn +"\n";
		r+="Lugar: "+ this.lugar +"\n";
		r+="Fecha: "+ this.fecha +"\n";
		r+="Paginas: "+ this.paginas +"\n";
		return r;
		
	}
	
	
	
	
	
	
	

}
