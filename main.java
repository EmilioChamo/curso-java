import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main (String[]args){
       boolean flag=false;
       boolean menu=false;
       Scanner tec = new Scanner(System.in);
       char resp;
       ArrayList<Persona>lista= new ArrayList<>(); 
       int cp=0;
       int op;
       
       while (menu==false){
       System.out.println("Binvenido al sistema"+"\n"+ "1:Carga"+"\n"+"2:Busqueda"+"\n"+"3:Modificacion"+"\n"+"4:Eliminacion"+"\n"+"5:Salir");
           op=tec.nextInt();
         
           switch(op){
            case 1:
              while(flag==false){
              Persona per= new Persona();
              per.cargarDatos();
              lista.add(per);
                
                System.out.println("desea continuar con la carga s/n");
                resp=tec.next().charAt(0);
         
                if(resp=='n'){
                   flag=true;
                }
                
              }
            
              break;
              case 2:
              char opcion;
              System.out.println("Seleccione la opcion de busqueda n=Nombre,a=Apellido");
              System.out.println("----------------------------------------------------");
                opcion= tec.next().charAt(0);
                       if(opcion=='n'){
                        System.out.print("ingrese el nombre a buscar por favor: ");
                        String nombre;
                        nombre=tec.nextLine();
                               
                           for(Persona Lista:lista){
                             if(Lista.getNombre()==nombre){
                              System.out.println("Nombre: "+Lista.getNombre() + "\n"+"Edad: "+Lista.getEdad()+"\n"+"Apellido :"+Lista.getApellido()+"\n"+"Direccion: "+Lista.getDireccion());
                                  System.out.println("----------------------------------");
                             }
                           }
                       }else if(opcion=='a'){
                        System.out.print("ingrese el apellido a buscar por favor: ");
                        String apellido;
                        apellido=tec.nextLine();
                        for(Persona Lista:lista){
                          if(Lista.getNombre()==apellido){
                           System.out.println("Nombre: "+Lista.getNombre() + "\n"+"Edad: "+Lista.getEdad()+"\n"+"Apellido :"+Lista.getApellido()+"\n"+"Direccion: "+Lista.getDireccion());
                               System.out.println("----------------------------------");
                          }
                        }
                       }
                       break;
                case 5:
                 System.out.println("Gracias por usar nuestro sistema");
                    menu=true;       
                       break;
              }
            }


       
           /* 
            for(Persona Lista:lista){
                System.out.println("Nombre: "+Lista.getNombre() + "\n"+"Edad: "+Lista.getEdad()+"\n"+"Apellido :"+Lista.getApellido()+"\n"+"Direccion: "+Lista.getDireccion());
                System.out.println("----------------------------------");
                cp+=1;
            }
              System.out.println("La cantidad de personas es de: "+cp);
            */


       
 
    
  }
}