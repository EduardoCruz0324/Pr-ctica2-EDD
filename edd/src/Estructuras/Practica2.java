package edd.src.Estructuras;

import java.util.Scanner;

import javax.security.sasl.AuthorizeCallback;

public class Practica2 {

    

    public static void torresHanoi(int cantidadDiscos, Pila<Integer> origen, Pila<Integer> auxiliar, Pila<Integer> destino) {
        // No olvides imprimir cada paso de la solución.
        int nm = (int) (Math.pow(2, cantidadDiscos) - 1);

        System.out.println("Forma original \nOrigen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n\n");
        for (int i = 1; i <= nm ; i++) {
	    
            if(cantidadDiscos % 2 == 0){
		
                if (i % 3 == 1) {
		    
                    if(origen.isEmpty()){
                        origen.push(auxiliar.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else if(auxiliar.isEmpty()){
                        auxiliar.push(origen.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else{
                        Integer a = origen.peek();
                        Integer b = auxiliar.peek();
                        if(a < b){
                            origen.pop();
                            auxiliar.push(a);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }else{
                            auxiliar.pop();
                            origen.push(b);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }
                    }
		    
                } else if (i % 3 == 2) {
		    
                    if(origen.isEmpty()){
                        origen.push(destino.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else if (destino.isEmpty()){
                        destino.push(origen.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else{
                        Integer a = origen.peek();
                        Integer b = destino.peek();
                        if(a < b){
                            origen.pop();
                            destino.push(a);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }else{
                            destino.pop();
                            origen.push(b);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");  
                        }
                    }
                } else{
		    
                    if(auxiliar.isEmpty()){
                        auxiliar.push(destino.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else if(destino.isEmpty()){
                        destino.push(auxiliar.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else{
                        Integer a = auxiliar.peek();
                        Integer b = destino.peek();
                        if(a < b){
                            auxiliar.pop();
                            destino.push(a);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }else{
                            destino.pop();
                            auxiliar.push(b);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }  
                    }   
                }
		
            }else{  		
                if (i % 3 == 1) {
		    
                    if(origen.isEmpty()){
                        destino.push(origen.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else if(destino.isEmpty()){
                        destino.push(origen.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else{
                        Integer a = origen.peek();
                        Integer b = destino.peek();
                        if(a < b){
                            origen.pop();
                            destino.push(a);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }else{
                            destino.pop();
                            origen.push(b);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");  
                        }  
                    }
                } else if (i % 3 == 2) {
		    
                    if(origen.isEmpty()){
                        origen.push(auxiliar.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else if(auxiliar.isEmpty()){
                        auxiliar.push(origen.pop());
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			
                    }else{
                        Integer a = origen.peek();
                        Integer b = auxiliar.peek();
                        if(a < b){
                            origen.pop();
                            auxiliar.push(a);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
                        }else{
			    
                            auxiliar.pop();
                            origen.push(b);
                            System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
			    
                        }  
                    }
                } else{
		    
                    if(destino.isEmpty()){
                    destino.push(auxiliar.pop()); //AQUÍ 
                    System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
                    
                    } else if(auxiliar.isEmpty() ){
                    auxiliar.push(destino.pop());
                    System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
                    
                    } else {
                    Integer a = destino.peek();
                    Integer b = auxiliar.peek();
                    if(a < b){
                        destino.pop();
                        auxiliar.push(a);
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");
                        
                    } else {
                        auxiliar.pop();
                        destino.push(b);
                        System.out.println("Origen < "+origen.toString()+"\nAuxiliar < "+auxiliar.toString()+"\nDestino < "+destino.toString()+"\n");

                        }
		            }
		        }
	        }
	    }
        System.out.println("Existieron "+nm+" movimientos");
    }


    public static void binarioColas(int N) {
        
        /*for(int i = 0; i <= N; i++){
            String a = Integer.toBinaryString(i);
            System.out.println(" "+i+"-> "+a);
        }*/
    }

    public static void main(String[] args) {
        // Escribe aqui tu codigo para probar los metodos anteriores.
        // No olvides comentar tu codigo y escribir tu nombre en el readme.
        /*Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de discos: ");
        int n = sc.nextInt();*/

        Pila<Integer> origen = new Pila<>();
        Pila<Integer> auxiliar = new Pila<>();
        Pila<Integer> destino = new Pila<>();

        /*for (int i = 1; i > n; i--) {
            origen.push(i);
        }*/

	    origen.push(5);
	    origen.push(4);
        origen.push(3);
        origen.push(2);
        origen.push(1);
	
        torresHanoi(5, origen, auxiliar, destino); //AQUÍ

        /*for (int i = 0; i < 3; i++) {
            origen.push(i);
        }
        */
    }

}