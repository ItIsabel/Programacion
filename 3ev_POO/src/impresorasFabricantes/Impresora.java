package impresorasFabricantes;

import java.util.Comparator;

public abstract class Impresora implements Comparable<Impresora>{
	String marca;
	String modelo;
	tipoImpresora tipo;
	public Impresora(String marca, String modelo, tipoImpresora tipo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public tipoImpresora getTipo() {
		return tipo;
	}
	public void setTipo(tipoImpresora tipo) {
		this.tipo = tipo;
	}
	
	/**
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a imprimir en la impresora XXX:"
	@param textoAImprimir el texto que se acompañará al prefijo indicado
	@return El texto a imprimir junto con el texto que precede ("Texto a imprimir...").
	**/
	public  String imprimir(String textoAImprimir) {
		return "Texto a imprimir en la impresora" + marca+" "+ modelo +": "+ textoAImprimir;
	}
	
	/**       
	Retornará un String con el texto a imprimir precedido de la cadena: "Texto a copiar por la impresora XXX"       
	@param textoACopiar el texto que se acompañará al prefijo indicado       
	@return El texto a copiar junto con el texto que precede ("Texto a copiar...").
	**/
	public String copiar (String textoACopiar) {
		return "Texto a copiar en la impresora" + marca+" "+ modelo +": "+ textoACopiar;

	}
	
	/**       
	Retornará un String con el texto a escanear precedido de la cadena: "Texto a escanear en la impresora XXX:"       
	@param textoAEscanear el texto que se acompañará al prefijo indicado      
	@return El texto a imprimir junto con el texto que precede ("Texto a escanear...").**/
	public String escanear(String textoAEscanear) {
		return "Texto a escanear en la impresora" + marca+" "+ modelo +": "+ textoAEscanear;

	}



	
	@Override
	public String toString() {
		return "Impresora - marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + "\n";
	}
	

}
