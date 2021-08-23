
package congreso;


public class Conferencista extends Participante{
    long horaCharla;

    public Conferencista(String titulo, String nombre, String especialidad, long documento, String empresa, long horaCharla) {
        super(titulo, nombre, especialidad, documento, empresa);
        this.horaCharla = horaCharla;
    }
    
    
    

    public long getHoraCharla() {
        return horaCharla;
    }

    public void setHoraCharla(long horaCharla) {
        this.horaCharla = horaCharla;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
       return "\t"+"Conferencista - Nombre: "+ nombre + "\n\t" +"Especialidad: "+ especialidad + "\n\t" +  "Documento: "+ documento+ "\n\t"+ "Empresa: " + empresa + "\n\t"+ "Hora Charla: "+ horaCharla+ "\n";   

    }
    
    public int compareTo(Participante participante){
        return toString().compareTo(participante.toString());
    }
    
    

    


    
}
