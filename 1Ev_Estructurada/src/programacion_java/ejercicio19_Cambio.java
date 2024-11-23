package programacion_java;
import java.util.Scanner;

public class ejercicio19_Cambio {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int b500=0, b200=0, b100=0, b50=0, b20=0, b10=0, b5=0, e2=0, e1=0, c50=0, c20=0, c10=0, c5=0, c2=0, c1=0;
        int payment, purchase, change;
        float transPayment, transPurchase, transChange;
        
        System.out.println("Introduzca valor de la compra.");
        transPurchase = scanner.nextFloat();
        purchase = (int) (transPurchase * 100);
        
        System.out.println("Introduzca pago.");
        transPayment = scanner.nextFloat();
        payment = (int) (transPayment * 100);
        
        change = payment - purchase;
        transChange = (float) (change / 100);
        
        System.out.println("---------------------");
        
        System.out.println("Su cambio es " + transChange);

        System.out.println("---------------------");
        
        while (change != 0) {
            if (change >= 500) {
                b500++;
                change = change - 50000;
                
            } else if (change >= 20000) {
                b200++;
                change = change - 20000;
                
            } else if (change >= 10000) {
                b100++;
                change = change - 10000;
                
            } else if (change >= 5000) {
                b50++;
                change = change - 5000;
                
            } else if (change >= 2000) {
                b20++;
                change = change - 2000;
                
            } else if (change >= 1000) {
                b10++;
                change = change - 1000;
                
            } else if (change >= 500) {
                b5++;
                change = change - 500;
                
            } else if (change >= 200) {
                e2++;
                change = change - 200;
                
            } else if (change >= 100) {
                e1++;
                change = change - 100;
                
            } else if (change >= 50) {
                c50++;
                change = (change - 50);
                
            } else if (change >= 20) {
                c20++;
                change = (change - 20);
                
            } else if (change >= 10) {
                c10++;
                change = (change - 10);
                
            } else if (change >= 5) {
                c5++;
                change = (change - 5);
                
            } else if (change >= 2) {
                c2++;
                change = (change - 2);
                
            } else if (change >= 1) {
                c1++;
                change = (change - 1);
                
            }
        }

        if (b500 > 0) {
            System.out.println("Billetes de 500 euros: " + b500);
            
        }
        
        if (b200 > 0) {
            System.out.println("Billetes de 200 euros: " + b200);
            
        }
        
        if (b100 > 0) {
            System.out.println("Billetes de 100 euros: " + b100);

            
        }
        
        if (b50 > 0) {
            System.out.println("Billetes de 50 euros: " + b50);
        }

        if (b20 > 0) {
            System.out.println("Billetes de 20 euros: " + b20);

        }

        if (b10 > 0) {
            System.out.println("Billetes de 10 euros: " + b10);

        }

        if (b5 > 0) {
            System.out.println("Billetes de 5 euros: " + b5);

        }

        if (e2 > 0) {
            System.out.println("Monedas de 1 euros: " + e2);

        }

        if (e1 > 0) {
            System.out.println("Monedas de 1 euro: " + e1);

        }

        if (c50 > 0) {
            System.out.println("Monedas de 50 centimos: " + c50);

        }

        if (c20 > 0) {
            System.out.println("Monedas de 20 centimos: " + c20);

        }

        if (c10 > 0) {
            System.out.println("Monedas de 10 centimos: " + c10);

        }

        if (c5 > 0) {
            System.out.println("Monedas de 5 centimos: " + c5);

        }

        if (c2 > 0) {
            System.out.println("Monedas de 2 centimos: " + c2);

        }

        if (c1 > 0) {
            System.out.println("Monedas de 1 centimo: " + c1);

        }
        
    }
}
