
public class Estudiante extends Persona {  
     
      
 private int numlista;
 String sexo;  
 private float nota;
 
 
      public Estudiante (String nombre ,String apellido, int edad, int numlista, float nota, String sexo ) {
          
          super ( nombre, apellido, edad  );
          
          this.numlista= numlista; 
          this.nota=nota; 
          this.sexo=sexo;
    
           
}
      
      public void verDatos () {
          
          System.out.println("Nombre: " + getNombre());
          System.out.println("Apellido: " + getApellido());
          System.out.println("Edad: " + getEdad());
          System.out.println("numlista: " + numlista );
          System.out.println("sexo: " + sexo );
          System.out.println("nota: " + nota );
      
          
  }

    public int getNumlista() {
        return numlista;
    }

    public void setNumlista(int numlista) {
        this.numlista = numlista;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
      
  }
