package director_pelicula;

public class Director_main {

	public static void main(String[] args) {
		//Experimento 1
		Director dir1=new Director( "Woody Allen","Francia", 1935);
		Pelicula peli1=new Pelicula();
		peli1.setTitulo("Manhattan");
		peli1.setDirector(dir1);
		peli1.setYR(1979);
		System.out.println(peli1.toString());
		
		//Experimento 2
		Director dir2=new Director("Peter Jackson","Nueva Zelanda",1961);
		Pelicula peli=new Pelicula ("El señor de los anillos");
		peli.setDirector(dir2);
		peli.setYR(1979);
		System.out.println(peli.toString());
		
		//Expeimento 3
		Pelicula peli3=new Pelicula(dir1);
		peli3.setTitulo("Dias de Radio");
		peli3.setYR(1987);
		peli3.getDirector().setPais("Estados Unidos");
		System.out.println(peli3.toString());
		System.out.println(peli1.toString());		

	}

}
