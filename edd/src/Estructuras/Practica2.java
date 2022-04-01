package edd.src.Estructuras;

import java.util.List;
import java.util.Scanner;

import javax.security.sasl.AuthorizeCallback;

public class Practica2 {

    
    /* 
    El método torresHanoi, se hizo implementado la estructura de control de pilas.
    Tomamos como referencia principal la cantida de Discos que el usuario nos pida.
    Para que funcionara lo que hicmos fue analizar los diferentes casos posibles y que el programa fuera buscando correctamente el destino
    de culquier disco, siguiendo las reglas originales de torres de Hanoi.
    */
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

    /* 
    El método binarioColas, se hizo implementado la estructura de control de colas.
    Tomamos como referencia principal la cantida de números que queremos convertir.
    Para que funcionara lo que hicmos fue analizar los diferentes casos posibles y analizando el patrón
    de la conversión de números binarios a decimales.
    */
    public static void binarioColas(int N) {
        
        String x = " ";
        Cola<String> ini = new Cola<String>();
        
        for(int i = 0; i <= N; i++){
            
            if(i == 0){
                ini.push("0");
                System.out.println("-> "+i+" en binario es: "+ini.pop());

            }else if(i == 1){
                ini.push("1");
                x = ini.peek();
                System.out.println("-> "+i+" en binario es: "+ini.pop());

            }else{
                String m = x + "0";
                ini.push(m);

                String n = x + "1";
                ini.push(n);

                x = ini.peek();
                System.out.println("-> "+i+" en binario es: "+ini.pop());
            }    
        }

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


        binarioColas(25);

        /*for (int i = 0; i < 3; i++) {
            origen.push(i);
        }
        */
    }

}