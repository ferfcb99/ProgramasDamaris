package EjercicioLogin;

import java.util.Scanner;

public class DatosAcceso {

    String[] usuarios = {"usuario1", "usuario2", "usuario3", "usuario4", "usuario5"};
    String[] contrasenias = {"pass1", "pass2", "pass3", "pass4","pass5"};


    public void entrar(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario");
        String usuario = scanner.nextLine();
        System.out.println("Ingresa tu clave");
        String clave = scanner.nextLine();

        boolean puedeAcceder = false;

        for (int i = 0; i < this.usuarios.length; i++) {
            if(usuario.equals(this.usuarios[i]) && clave.equals(this.contrasenias[i])){
                puedeAcceder = true;
            }
        }

        if(puedeAcceder == true){
            System.out.println("Puede acceder");
        }else{
            System.out.println("Datos incorrectos");
        }


    }

}
