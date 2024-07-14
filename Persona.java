import java.util.Scanner;

public class Persona {
   private int edad=0;
   private String nombre;
   private String direccion;
   private String apellido;



 public String getDireccion(){
   return this.direccion;
 }   

 public String getApellido(){
   return this.apellido;
 }
 
public int getEdad(){
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
   Scanner tec = new Scanner(System.in);
   mostrarMensaje("ingrese el nombre de la persona");
   this.nombre=tec.nextLine();
}

public void setEdad(){
   Scanner tec= new Scanner(System.in);
   mostrarMensaje("ingrese la edad por favor");
   this.edad=tec.nextInt();
}

public void cargarDatos(){
   setNombre();
   setEdad();
   setDireccion();
   setApellido();
}

public void mostrarMensaje(String mensaje){
   System.out.println(mensaje);
}

public void carga(){
   
}

}
