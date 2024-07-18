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
      

// Codigo del menu inicio//

while (menu==false){
      
               if (bienvenido==false){
                      
                          System.out.println("bienvenido al sistema de carga" +"\n"+"1:Cargas"+"\n"+"2:Busqueda"+"\n"+"3:Modificacion:"+"\n"+"4:Eliminacion"+"\n"+"5:Salir");
           
                            op = tec.nextInt();
                              switch(op){   
                                       case 1: 
                                         cargarLista(lista);
                                           break;
                                       case 2:
                                         mostrarLista(lista);
                                           break;       
                                       case 5:
                                       mensaje("Gracias por utilizar nuestro sistema");
                                          menu=true;
                                           break;
                                          }  
                                          
                                    }//ciere de bienvenido//
                     }  //cierre de while menu//
      
   

  }   //cierre de metodo main//

               
         //modulos inico static//

         //crea una persona y la carga en la lista//
             static void cargarLista(ArrayList<Persona>list){
              
              boolean cond=false;
              char resp;
              while(cond==false){
              Persona per=new Persona();
              per.crearPersona();
              list.add(per);
              mensaje("Desea continuar con la carga? s/n");
                  Scanner in = new Scanner(System.in);
                   resp=in.next().charAt(0);
                     if(resp=='n'){
                      cond=true;
                     }
                 }
              }
         
        //busca una persona cargada en la lista y la muestra//   
             static void mostrarLista(ArrayList<Persona>lista){
                  mensaje("ingrese el nombre a buscar");
                  Scanner in= new Scanner(System.in);
                  String per;
                  per=in.nextLine();
                     for(Persona persona:lista){
                        if(persona.getNombre().contains(per)){
                              for(Persona person:lista){
                         System.out.println("------------------------------------------------------------------------------------------");           
                         System.out.println("Nombre:"+person.getNombre()+"\n"+"Apellido:"+person.getApellido()+"\n"+"Edad:"+person.getEdad()+"\n"+"Direccion:"+person.getDireccion());
                         System.out.println("------------------------------------------------------------------------------------------");
                               }  
                               break;                     
                             } 
                           }  
                            
                        }   
          
       
          //muestra mensaje en pantalla//
          static void mensaje(String mensaje){
           System.out.println(mensaje);
          }
         
          //modifica datos de una persona creada//
          static void modificar(ArrayList<Persona> lista){
                 
          }  


  //modulos cierre static//
 
}//cierre de clase//
