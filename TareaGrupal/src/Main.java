public class Main {
      
   public static void main (String [ ] Args) {

      Estudiante estudiante = new Estudiante("Pedro","Rodriguez",15, 19 , 78, "Masculino");
      Deportista deportista=new Deportista("Juan", "Perez ", 25,"Futbol","juanperez@gmail.com","A");
      
      
       estudiante.verDatos();
       System.out.println();
       
       System.out.println("Nombre :"+deportista.getNombre()+"\n"+"Apellido :"+deportista.getApellido()
       +"\n"+"Edad :"+deportista.getEdad()+"\n"+"Deporte :"+deportista.getDeporte()+"\n"+"Correo :"+deportista.getCorreo()+"\n"+"Categoria :"+deportista.getCategoria());
      
 }
    
}