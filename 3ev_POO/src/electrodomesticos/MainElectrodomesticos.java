package electrodomesticos;

public class MainElectrodomesticos {

	public static void main(String[] args) {
		Electrodomestico[] l=new Electrodomestico[4];
		Television t1=new Television(100,25);
		Television t2=new Television(100,25);
		t2.setTDT(true);
		Lavadora l1=new Lavadora(500,8);
		Lavadora l2=new Lavadora(324,6);
		l[0]=t1;
		l[1]=t2;
		l[2]=l1;
		l[3]=l2;
		for (int i=0; i<l.length;i++) {
			if (l[i] instanceof Television) {
				((Television)l[i]).imprimeLibroCaracteristicasElectrodomestico();
				System.out.println("precio final: " + ((Television)l[i]).precioFinal());
				System.out.println("\n"+"\n");
			}
			if (l[i] instanceof Lavadora) {
				((Lavadora)l[i]).imprimeLibroCaracteristicasElectrodomestico();
				System.out.println("precio final: " + ((Lavadora)l[i]).precioFinal());
				System.out.println("\n"+"\n");
			}
			

			;
		}
	}

}
