
package congreso;


public class Participante {
   String nombre;
   String especialidad;
   String empresa;
   long documento;
   String titulo;

    public Participante(String titulo, String nombre, String especialidad, long documento, String empresa) {
      
        this.titulo = titulo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.documento = documento;
        this.empresa = empresa;
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
        return "Participante{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", empresa=" + empresa + ", documento=" + documento + '}';
    }
    

    

   
}
