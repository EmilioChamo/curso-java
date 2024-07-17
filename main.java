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
                   case 1:
                        while(carga==false){
                          Persona per=new Persona();
                          per.setNombre();
                          per.setApellido();
                          lista.add(per);
                          System.out.println("Desea continuar con la carga s/n");
                                   resp= tec.next().charAt(0);
                                   if(resp=='n'){
                                    carga=true;
                                   }
                         }
                         break;
                    case 2:
                             mensaje("ingerse la opcion de busqueda n=Nombre, a=Apellido");
                             char opcion;
                             opcion = tec.next().charAt(0);
                             if(opcion=='n'){
                               mensaje("Ingrese el nombre a buscar");
                               String nomb;
                               nomb=tec.nextLine();
                               tec.nextLine();
                               boolean esta=false;
                              for(Persona persona:lista){
                                if(nomb.equals(persona.getNombre())){
                                  esta=true;
                                  
                                  if(esta==true){
                                System.out.println(persona.getNombre()+persona.getApellido()+persona.getEdad()+persona.getDireccion());
                                    }
                                    break;
                                   }
                                   

                                 }

                               }else if(opcion=='a'){
                                String apeb;
                                 mensaje("ingrese el apellido a buscar");
                                  apeb=tec.nextLine();
                                 for(Persona persona:lista){
                                   if(apeb.equals(persona.getApellido())){
                                    mensaje("-----------------------------------------------------------------------------------");
                                     System.out.println(persona.getNombre()+persona.getApellido()+persona.getEdad()+persona.getDireccion());
                                     mensaje("-----------------------------------------------------------------------------------");
                                     }else{
                                       mensaje("no existe coincidencia");
                                     }
                              }
                               }   
                              break;                             
                            case 5:
                                   menu=true;
      }
    }

  }  
     for(Persona per:lista){
           System.out.println(per.getNombre());
     }                     
}                           
    

               

             
            
                     
      
       
  
  static void mensaje(String mensaje){
           System.out.println(mensaje);
  }
}