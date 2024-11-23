package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainSerializable {

	public static void main(String[] args) {
		
		//aqui recupero el arraylist lp1, lo guardo en la variable lp2 y la imprimo
		ArrayList<Persona> lp2=deserializar("personas.obj");
		System.out.println(lp2.toString());
		
		//aqui comienza el codigo y guardo 4 nombres en un arraylist con nombre lp1
		ArrayList<Persona> lp1= new ArrayList<Persona>();
		lp1.add(new Persona("Luis","Perez",6666655));
		lp1.add(new Persona("Ainhoa","Balboa",1266655));
		lp1.add(new Persona("Carlos","Alvarez",2666655));
		lp1.add(new Persona("Benito","Celso",3666655));
		Serializar(lp1);
		System.out.println(lp1.toString());
	}
	
	
	public static void Serializar(ArrayList<Persona> a) {
		FileOutputStream fichero;
		try {
			fichero = new FileOutputStream("personas.obj");
			try {
				ObjectOutputStream salida = new ObjectOutputStream(fichero);
			salida.writeObject(a);
			salida.close();
			}
			catch(Exception e){
				e.getMessage();
			}

			try {
				fichero.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
		public static ArrayList<Persona> deserializar(String a) {
			FileInputStream ficheroEntrada;
			ArrayList<Persona> deserializado= new ArrayList<Persona>();
			try {
				ficheroEntrada = new FileInputStream(a);
				ObjectInputStream entrada;
				try {
					entrada = new ObjectInputStream(ficheroEntrada);
					deserializado = (ArrayList<Persona>) entrada.readObject();
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			ficheroEntrada.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
				return deserializado;

			
		}

	}


