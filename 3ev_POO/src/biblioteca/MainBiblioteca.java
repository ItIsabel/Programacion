package biblioteca;

import java.util.ArrayList;
/*
 * 
-- Ejercicio 8.6:
Escriba un programa para una biblioteca que contenga libros y revistas.

a) Las características comunes que se almacenan tanto para las revistas como para los libros son el código, el título y el año de publicación. Estas tres características se pasan por parámetro en el momento de crear los objetos.

b) Los libros tienen además un atributo prestado. Los libros cuando se crean no están prestados.

c) Las revistas tienen un número. En el momento de crear las revistas se pasa el número por parámetro.

d) Tanto las revistas como los libros deben tener (aparte de los constructores) un método toString() que devuelve el valor de todos los atributos en una cadena de caracteres. También tienen un método que devuelve el año de publicación y otro para el código.

e) Para prevenir posibles cambios en el programa se tiene que implementar una interfaz Prestable con los métodos prestar(), devolver() y prestado(). La clase Libro implementa esta interfaz.


-- Ejercicio 8.7:
Escriba una aplicación en la que se implementen dos métodos:

a) cuentaPrestados(): recibe por parámetro un array de objetos y devuelve cuántos de ellos están prestados.

b) publicacionesAnterioresA(): recibe por parámetro un array de Publicaciones y un año, devuelve cuántas publicaciones tienen fecha anterior al año recibido por parámetro.

En el método main():

Crear un array de Publicaciones con 2 libros y 2 revistas.
Prestar uno de los libros.
Mostrar por pantalla los datos almacenados en el array.
Mostrar por pantalla cuántas publicaciones hay prestadas y cuántas hay anteriores a 1980 utilizando los métodos escritos anteriormente.
Planteamiento:

a) cuentaPrestados():

Recibe un array de Objetos para que se pueda utilizar tanto con Publicaciones como con cualquier otro tipo de objetos que se puedan prestar.
Para contar cuántos objetos están prestados, se utiliza un contador que se inicializa a 0.
Se recorre el array comprobando si cada una de las celdas es Prestable.
Si lo es, se comprobará si está prestado y en este caso se incrementará un contador.
Para comprobar si está prestado, antes hay que convertirlo a Prestable, ya que la clase Object no tiene el método prestado().
b) publicacionesAnterioresA():

Utiliza también un contador inicializado a 0.
Se recorre el array obteniendo el año de cada una de las publicaciones.
Se comprueba si es menor que el año recibido por parámetro y si es así, se incrementa el contador.
c) El array se puede crear de varias maneras, en esta ocasión se le dan los datos en el momento de crearlo.

Para prestar uno de los libros, se accede a una de las celdas, se transforma a Libro y se llama al método prestar().
	 
 */
public class MainBiblioteca {

	public static void main(String[] args) {
		Biblioteca b1 =new Biblioteca(); 
		Libro lib1= new Libro(01,"Lo que el viento se llevó", 1995);
		Libro lib2= new Libro (02,"El señor de los anillos",2000);
		Revista rev1=new Revista(01,"Architect digest",2022,1);
		Revista rev2=new Revista(02,"Muy Interesante", 2024,2);
		
		b1.addPublicacion(lib1);
		b1.addPublicacion(lib2);
		b1.addPublicacion(rev1);
		b1.addPublicacion(rev2);
		
		System.out.println(b1.cuentaPrestados());
		try {
			System.out.println(lib1.prestar());
		}catch (Exception e) {e.getMessage();
		}
		System.out.println(b1.cuentaPrestados());

		System.out.println(b1.publicacionesAnterioresA(2024));
		}
}
