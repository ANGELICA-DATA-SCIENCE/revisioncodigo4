package org.generation;

import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) { //las propiedades y funciones deben estar dentro de un metodo main
		//no estaba importado el Scanner de java.util
		Scanner s = new Scanner(System.in);  // le falta el tipo de escaner que en este caso es de entrada
	    
		//el System.out estaba mal escrito
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {   //habia un cierre de parentesis de más
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	          } //faltaba el cierre de case de switch
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  //faltó cerrar el scanner
	    s.close();
	  
	}
		
		
	}
    