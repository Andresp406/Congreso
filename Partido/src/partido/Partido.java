package partido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Partido {

    public static void main(String[] args) {
        /* Scanner consola = new Scanner(System.in);
           String teclado = consola.nextLine();
           int i = 1;
           ArrayList<String> listaEquipos = new ArrayList<>();
           ArrayList<Integer> listaPosiciones = new ArrayList<>();
           String nombreEquipo;
           
           listaEquipos.add(teclado);
           listaPosiciones.add(consola.nextInt());
           nombreEquipo = consola.nextLine();
           
           miequipo(listaPosiciones, listaEquipos, nombreEquipo);*/

        ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(3,5,7,10,15,16));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(3,5,10,13,33, 16));
        

        String nombre = "Newpi";

        System.out.println("diferencia " + diferencia(lista1, lista2));
    }

    public static ArrayList<String> equipos(ArrayList<String> listaEquipo) {
        ArrayList<String> eliminarRepetidos = new ArrayList<>();
        for (String elem : listaEquipo) {
            if (!eliminarRepetidos.contains(elem)) {
                eliminarRepetidos.add(elem);
            }
        }
        return eliminarRepetidos;
    
    }

    public static ArrayList<Integer> miequipo(ArrayList<Integer> listaPosiciones, ArrayList<String> listaEquipos, String nombreEquipo) {

        ArrayList<Integer> cadenaResult = new ArrayList<>();
        for (Integer elem : listaPosiciones) {
            if (listaEquipos.get(elem).equals(nombreEquipo)) {
                cadenaResult.add(elem);

            }

        }

        return cadenaResult;
    }

    public static ArrayList<Integer> faltantes(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {

        ArrayList<Integer> lista_result = new ArrayList<Integer>();

        for (Integer elem : lista1) {
            if (!lista2.contains(elem) && !lista_result.contains(elem)) {
                lista_result.add(elem);

            }

        }
        return lista_result;

    }

      
    public static int diferencia(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        int diferencia = 0;
        int count1 = 0;
        int count2 = 0;
        for(Integer elem : lista2){
            if(!lista1.contains(elem)){
                count1 +=1;
            }
        } 
        for(Integer elem : lista1){
            if(!lista2.contains(elem)){
                count2 +=1;
            }
        }
        
        if(count1<count2){
            diferencia = count1;
        }else{
            diferencia = count2;
        }
        return diferencia;
    }
    
   

}
