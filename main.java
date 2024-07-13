import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main (String[]args){
       boolean flag=false;
       Scanner tec = new Scanner(System.in);
       char resp;
       ArrayList<Persona>lista= new ArrayList<>(); 
       int cp=0;
       
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
            for(Persona Lista:lista){
                System.out.println("Nombre: "+Lista.getNombre() + "\n"+"Edad: "+Lista.getEdad()+"\n"+"Apellido :"+Lista.getApellido()+"\n"+"Direccion: "+Lista.getDireccion());
                System.out.println("----------------------------------");
                cp+=1;
            }
              System.out.println("La cantidad de personas es de: "+cp);
    }
}