public class Deportista extends Persona {

    private String deporte;
    private String correo;
    private String categoria;

    public Deportista(String nombre, String apellido, int edad, String deporte, String correo, String categoria) {
        super(nombre, apellido, edad);
        this.deporte=deporte;
        this.correo=correo;
        this.categoria= categoria;
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