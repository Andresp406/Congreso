
package congreso;

import java.util.Arrays;
import java.util.Scanner;


public class Congreso {

    protected String nombre;
    protected Participante[] persona;
    private int n;

    public Congreso(String nombre) {
        this.nombre = nombre;
        this.persona = new Participante[10];
        this.n = 0;
        
    }

    public void addParticipante(Asistente asistente){
        this.persona[this.n] = asistente;
        this.n++;
    }
    
    public void addConferencista(Conferencista conferencista){
        
        this.persona[this.n] = conferencista;
        this.n++;
    }
    
    public void listaParticipantes(){
        System.out.println("*** Participantes Congreso***"+"\n");
        for (int i =0; i < n; i++){
            
            System.out.println(this.persona[i]);
        }
    }
    
    
   
    
    public void ejecutarApp(){
        String[] cadena;
        String empresa;
        int opc, nroTickets, documento, horaCharla;
        Scanner consola = new Scanner(System.in);
        do{
            cadena = consola.nextLine().split(";");
            opc = Integer.parseInt(cadena[0]);
            switch(opc){
                case 1 :
                    System.out.println(Arrays.toString(cadena));
                    documento = Integer.parseInt(cadena[4]);
        
                    if(cadena[1].equals("Conferencista")){
                        horaCharla = Integer.parseInt(cadena[6]);
                        Conferencista conferencista = new Conferencista(cadena[1], cadena[2], cadena[3], documento, cadena[5], horaCharla );
                        this.addConferencista(conferencista); 
                        
                        
                    }else if(cadena[1].equals("Asistente")){
                        nroTickets = Integer.parseInt(cadena[6]);
                        Asistente asistente = new Asistente(cadena[1], cadena[2], cadena[3], documento, cadena[5], nroTickets );
                        this.addParticipante(asistente);
                     
                    }else{
                        System.out.println("nombre invalido");
                    }
                        
                   break;
                case 2:
                    
                    this.listaParticipantes();
                    break;
                case 3:
                    return;
                
                default: 
                    System.out.println("Opción inválida");
            }
            
            
        }while(opc!=3);
        
    }
     public static void main(String[] args) {        
        Scanner consola = new Scanner(System.in);
        Congreso congreso = new Congreso(consola.toString());
        congreso.ejecutarApp();
        

    }
    
}
