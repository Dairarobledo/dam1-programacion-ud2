
import java.util.Scanner;

import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario{
    public static void main(String[]args){

    Scanner sc = new Scanner (System.in);
    System.out.println("¿cual es tu nombre?");
    String nombre = sc.nextLine();

    System.out.println("introduce tu edad");
    int edad = sc.nextInt();
    
    System.out.println("introduce tu correo electtronico: ");
    String email = sc.nextLine();

    boolean emailValido = ProcesadorTexto.esEmailValido(email);
    if (emailValido) {
      Usuario usuario = new Usuario(nombre, edad , email);
      usuario.mostrarInformacion();  

    } else {
        System.out.println("el usuario no puede ser creado porque el email no es valido");
    }
}


  }

