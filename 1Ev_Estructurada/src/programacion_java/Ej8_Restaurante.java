package programacion_java;
import java.util.Scanner;

public class Ej8_Restaurante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        char selec;
        System.out.println("Bienvenidx al restaurante por favór indica el menú que quieres");
        System.out.println("1.Menú vegano");
        System.out.println("2.Menú Hamburguesa + patatas");
        System.out.println("3.Menú Sandwich + refresco");
        System.out.println("4.Menú ensalada");
        System.out.println("0.Salir");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El menú vegano es una ensalada con seitán, frutos secos con bebida.");
                System.out.println("¿Quieres esta opción? yes/no");
                selec = teclado.next().charAt(0);
                if (selec == 'y' || selec == 'Y') {
                    System.out.println("Fenomenal");
                } else {
                    System.out.println("Por favor, reinicia el programa");
                }
                break;
            case 2:
                System.out.println("El menú hamburguesa se compone por una hamburguesa de buey");
                System.out.println("¿Quieres esta opción?yes/no");
                selec = teclado.next().charAt(0);
                if (selec == 'y' || selec == 'Y') {
                    System.out.println("Fenomenal");
                } else {
                    System.out.println("Por favor, reinicia el programa");
                }
                break;
            case 3:
                System.out.println("El menú sandwich es un mixto con bebida");
                System.out.println("¿Quieres esta opción?yes/no");
                selec = teclado.next().charAt(0);
                if (selec == 'y' || selec == 'Y') {
                    System.out.println("Fenomenal");
                } else {
                    System.out.println("Por favor, reinicia el programa");
                }
                break;
            case 4:
                System.out.println("Ensalada césar");
                System.out.println("¿Quieres esta opción?yes/no");
                selec = teclado.next().charAt(0);
                if (selec == 'y' || selec == 'Y') {
                    System.out.println("Fenomenal");
                } else {
                    System.out.println("Por favor, reinicia el programa");
                }
                break;
            case 0:
                teclado.close();
            default:
                System.out.println("El número no corresponde con ningún menú");
        }
    }
}

