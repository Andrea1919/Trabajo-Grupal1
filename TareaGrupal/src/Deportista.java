public class Deportista extends Persona {

    private String deporte;
    private String correo;
    private String categoria;

    public Deportista(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
}