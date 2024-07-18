import java.util.Scanner;


public class Persona {
   private String edad;
   private String nombre;
   private String direccion;
   private String apellido;
   private Scanner tec= new Scanner(System.in);
    


public Persona crearPersona(){
   Persona per =new Persona();
   setNombre();
   setApellido();
   setEdad();
   setDireccion();
   return per;
}

   public String getDireccion(){
   return this.direccion;
 }   

 public String getApellido(){
   return this.apellido;
 }
 
public String getEdad(){
   return this.edad;
    }

public String getNombre(){
         return this.nombre;
   }

public void setDireccion(){
         Scanner tec = new Scanner(System.in);
         mostrarMensaje("ingrese la direccion");
         this.direccion=tec.nextLine();
   }


public void setApellido(){
   Scanner tec = new Scanner(System.in);
   mostrarMensaje("ingrese el apellido");
   this.apellido=tec.nextLine();
}
    
public void setNombre(){
   String nom;
   Scanner tec = new Scanner(System.in);
   mostrarMensaje("ingrese el nombre de la persona");
   nom=tec.nextLine();
   while(nom.isEmpty()){
      mostrarMensaje("el campo no puede estar vacio,debe ingresar un nombre valido");
      nom=tec.nextLine();
   }
   this.nombre=nom;
   
}

public void setEdad(){
   Scanner tec= new Scanner(System.in);
   mostrarMensaje("ingrese la edad por favor");
   this.edad=tec.nextLine();
}

/*public void cargarDatos(){
setNombre();
setApellido();
setEdad();
setDireccion();
}*/

public void mostrarMensaje(String mensaje){
   System.out.println(mensaje);
}

 

}
