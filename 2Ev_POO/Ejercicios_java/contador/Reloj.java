package contador;

public class Reloj {
	private int hora;
	private int minutos;
	private int segundos;

	    public Reloj() {
	        hora = 0;
	        minutos = 0;
	        segundos = 0;
	    }

	    public Reloj(int h, int m, int s) throws Exception {
	    	if ((h<=24) && (m<=60) && (s<=60)) {
		        hora = h;
		        minutos = m;
		        segundos = s;
	    	}
	    	else
	    		throw new Exception("introduce una hora valida");
	    }
	    

	    public int getHora() {
			return hora;
		}

		public void setHora(int hora) {
			this.hora = hora;
		}

		public int getMinutos() {
			return minutos;
		}

		public void setMinutos(int minutos) {
			this.minutos = minutos;
		}

		public void ponerEnHora (int hh, int mm, int ss) {
			if ((hh<=24) && (mm<=60) && (ss<=60)) {
		        hora = hh  ;
		        minutos = mm ;
		        segundos = ss;
			}
		}
		public void setAlarma(Alarma alarma) {}


	    public void incrementar() {
	        segundos++;
	        if (segundos == 60) {
	            segundos = 0;
	            minutos++;
	            if (minutos == 60) {
	                minutos = 0;
	                hora = (hora + 1) % 24;
	            }
	        }
	    }

	    public void decrementa() {
	        segundos--;
	        if (segundos < 0) {
	            segundos = 59;
	            minutos--;
	            if (minutos < 0) {
	                minutos = 59;
	                hora = (hora - 1) % 24;
	            }
	        }
	    }
	    
	    public boolean verificarAlarma( Alarma alarma) {
	    	boolean v;
	        if (alarma.isAlarmaActivada() && hora == alarma.getAlarmaHora() && minutos == alarma.getAlarmaMinutos()) {
	        	v=true;
	        }
	        else v=false;
	      return v;
	    }

	    public String toString() {
	        String hms = "Son las ";
	        hms += hora + ":" + minutos + ":" + segundos;
	        return hms;
	    }

}
