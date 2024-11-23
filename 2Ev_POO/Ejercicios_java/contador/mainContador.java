package contador;

public class mainContador {

	public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        Alarma desayuno=new Alarma(10,10);
        Alarma cena= new Alarma(20,30);
        reloj1.ponerEnHora(17, 10, 10);
        reloj1.setAlarma(desayuno); 
        System.out.println(reloj1.toString());
        reloj1.incrementar();
        reloj1.verificarAlarma(desayuno);
        System.out.println(reloj1.toString());

	}

}
