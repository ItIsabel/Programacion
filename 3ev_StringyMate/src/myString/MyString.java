package myString;
import java.util.*;

public class MyString {
	    private char[] cadena;

	    public MyString(String cadena) {
	    	this.cadena=new char[cadena.length()];
	    	this.cadena=cadena.toCharArray();
	    }
	    
	    public MyString(char[] cadena){
	    	this.cadena=new char[cadena.length];
	    	for (int i=0; i<cadena.length;i++) {
	    		this.cadena[i]=cadena[i];
	    	}	
	    }
	    	    
	    public MyString(ArrayList<Character> cadena){
	    	char[] r=new char[cadena.size()];
	    	for (int i=0;i < cadena.size();i++) {
	    		r[i]=cadena.get(i);
			}
	    	this.cadena=r;
	    }
		
	    
	    public char[] getCadena(){
	    	return this.cadena;
	    }
	    
	    public char myCharAt(int i) throws Exception {
	        if (i < 0 || i >= cadena.length) {
	            throw new Exception("Error. Se ha pedido la posición: " + i + ", y la cadena tiene " + cadena.length + "posiciones");
	        }
	        return this.cadena[i];
	    }

	    public int myCompareTo (MyString cadena2) {
	    	int r=0;
	        if (this.cadena.length!= cadena2.myLength()) {
	        	r=-1;
	        }
	        for (int i = 0; i < cadena.length; i++) {
	            int difer = this.cadena[i] - cadena2.cadena[i];
	            if (difer != 0) {
	                r=-1; 
	            }
	        }
	        return r; 
	    }
	    
	    public int myCompareToIgnoreCase (MyString cadena2){
	    	int r=-1;
	        if (this.cadena.length!= cadena2.myLength()) {
	        	r=-1;
	        }
	        for (int i = 0; i < cadena.length; i++) {
	            int difer = this.cadena[i] - cadena2.cadena[i];
	            if ((difer == 0) || (difer==32)) {
	                r=0; 
	            }
	        }
	        return r; 
	    }  
	    
	    public void myConcat(MyString cadena2){ 
	        char[] newCadena = new char[this.cadena.length + cadena2.myLength()];
	        
	        System.arraycopy(this.cadena, 0, newCadena, 0, this.cadena.length);
	        System.arraycopy(cadena2, 0, newCadena, this.cadena.length, cadena2.myLength());
	        
	        this.cadena = newCadena;
	    }
	    
	    public int myIndexOf(int caracter) {
	        for (int i = 0; i < cadena.length; i++) {
	            if (cadena[i] == caracter) {
	                return i; 
	            }
	        }
	        return -1; 
	    }
	    
	    public int myLastIndexOf(int caracter) {
	        for (int i = cadena.length - 1; i >= 0; i--) {
	            if (cadena[i] == caracter) {
	                return i; 
	            }
	        }
	        return -1; 
	    }
	    
	    public int myLength(){
	    	return cadena.length;
	    }
	    
	        
	    public MyString mySubstring(int inicio, int fin) throws Exception {
	        if (inicio < 0 || fin > cadena.length || inicio > fin) {
	            throw new Exception("datos erróneos");
	        }
	        
	        int newLength = fin - inicio;
	        char[] subString = new char[newLength];
	        System.arraycopy(cadena, inicio, subString, 0, newLength);
	        return new MyString(subString);
	    }
	    
	    
	    public MyString myToLowerCase(){
	    	for (char c : cadena) {
	    		if((c>=97)& (c<=122)) {
	    			
	    		}
				
			}
	    	return new MyString(cadena);
	    }
	    
	    
	    public MyString myToLowerCase(char[] cadena){
	    	for (char c : cadena) {
	    		if((c>=65)& (c<=90)) {
	    			c+=32;
	    		}
			}
	    	return new MyString(cadena);
	    }
	    
	    
	    public MyString myToUpperCase(){
	    	for (char c : this.cadena) {
	    		if((c>=97) & (c<=122)) {
	    			c-=32;
	    		}
			}
	    	return new MyString(this.cadena);
	      }
	    
	    public String myToString() {
	    	String r="";
	    	for (char c : cadena) {
	    		r+=c;

	    	}
	        return r;
	    }

}

