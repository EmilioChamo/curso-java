import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[]args){
      // variables a utilizar//
      int op;
      boolean menu=false,bienvenido=false,carga=false;
      char resp;
      Scanner tec=new Scanner(System.in);
      ArrayList<Persona>lista= new ArrayList<>();
      Persona obj =new Persona();

// Codigo del menu inicio//

while (menu==false){
      
               if (bienvenido==false){
                      
                          System.out.println("bienvenido al sistema de carga" +"\n"+"1:Cargas"+"\n"+"2:Busqueda"+"\n"+"3:Modificacion:"+"\n"+"4:Eliminacion"+"\n"+"5:Salir");
           
                            op = tec.nextInt();
                              switch(op){   
                                       case 1: 
                                         cargarLista(lista,obj);
                                           break;
                                       case 2:
                                         mostrarLista(lista);
                                           break;       
                                       case 5:
                                          menu=true;
                                           break;
                                          }  
                                    }//ciere de bienvenido//
                     }  //cierre de while menu//
   
   
  }   //cierre de main//

               
         //modulos inico static//
             static void cargarLista(ArrayList<Persona>lista,Persona per){
              per.crearPersona();
              lista.add(per);
             }
            
             static void mostrarLista(ArrayList<Persona>lista){
                  mensaje("ingrese el nombre a buscar");
                  Scanner in= new Scanner(System.in);
                  String per;
                  per=in.nextLine();
                     for(Persona persona:lista){
                        if(persona.getNombre().equals(per)){
                              for(Persona person:lista){
                         System.out.println("------------------------------------------------------------------------------------------");           
                         System.out.println(person.getNombre()+"\n"+person.getApellido()+"\n"+person.getEdad()+"\n"+person.getDireccion());
                         System.out.println("------------------------------------------------------------------------------------------");
                         }                       
                           }                 
                            }  
                        }   
          
       
  
  static void mensaje(String mensaje){
           System.out.println(mensaje);
  }
  //modulos cierre static//
 
}//cierre de clase//
