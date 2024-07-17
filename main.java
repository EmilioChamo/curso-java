import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main (String[]args){
      // variables a utilizar//
      String nombre;
      String apellido;
      String direccion;
      String edad;
      int op;
      boolean menu=false,bienvenido=false,carga=false;
      char resp;
      Scanner tec=new Scanner(System.in);
      ArrayList<Persona>lista = new ArrayList<>();
             
// Codigo del menu inicio//
     
      while (menu==false){
      
      if (bienvenido==false){
                      
            System.out.println("bienvenido al sistema de carga" +"\n"+"1:Cargas"+"\n"+"2:Busqueda"+"\n"+"3:Modificacion:"+"\n"+"4:Eliminacion"+"\n"+"5:Salir");
               op=tec.nextInt();
              
                
                             switch(op){
                   
                                       }
                            }

                         }  
     
   }// fin del metodo principal//                           
    

               

             
            
                     
   static void cargar(){
    Persona per = new Persona();
    per.getNombre();
    per.getApellido();
    per.getEdad();
    per.getEdad();

    
   }     
       
  
  static void mensaje(String mensaje){
           System.out.println(mensaje);
  }
}