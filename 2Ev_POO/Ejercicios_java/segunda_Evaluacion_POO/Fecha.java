package segunda_Evaluacion_POO;

public class Fecha {
int dia=0;
int mes=0;
int yr=0;

public Fecha(int dia, int mes,int yr) {
	if (this.verificarFecha(dia, mes, yr)) {
		this.dia=dia;
		this.mes=mes;
		this.yr=yr;
	}else {
		System.out.println("Error");
	}
}

public void modificarDia(int dia) {
	if (this.verificarFecha(dia, this.mes, this.yr)) {
		this.dia=dia;
	}
	else {
		this.dia=0;
	}

		}
	

private boolean verificarFecha(int dia, int mes, int yr) {
	boolean esValida=true;
	int[] diasPorMes={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	     if (mes < 1 || mes > 12) {
	        esValida=false;
	    } else if (dia < 1 || dia > diasPorMes[mes - 1]) {
	        esValida=false;}
	if (((yr%4==0) && (yr%100!=0)||(yr%400==0))&& (mes==2 && dia<=29)) {
		 esValida=true;
	}

	return esValida;
}
public String toString() {
	String r= "dia: "+dia;
	r+="mes: "+mes;
	r+="año: "+yr;
	return r;
}
}

