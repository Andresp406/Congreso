
package congreso;


public class Asistente extends Participante{
    long nroTickets;

    public Asistente(String titulo, String nombre, String especialidad, long documento, String empresa, long nroTickets) {
        super(titulo, nombre, especialidad, documento, empresa);
        this.nroTickets = nroTickets;
    }

    public long getNroTickets() {
        return nroTickets;
    }

    public void setNroTickets(long nroTickets) {
        this.nroTickets = nroTickets;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   


    @Override
    public String toString() {
        return "\t"+"Asistente - Nombre: "+ nombre + "\n\t" +"Especialidad: "+ especialidad + "\n\t" +  "Documento: "+ documento+ "\n\t"+ "Empresa: " + empresa + "\n\t"+ "No. ticket: "+ nroTickets+ "\n";   

    }
       public int compareTo(Participante participante){
        return toString().compareTo(participante.toString());
    }
      
    
}
