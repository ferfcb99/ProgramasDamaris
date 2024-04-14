import herencia1.Cliente;
import herencia1.Persona;
import herencia1.Trabajador;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 =new Cliente(1, "A01");
        System.out.println("idcliente: " + cliente1.getId());
        System.out.println("membresia de cliente: " + cliente1.getMembresia());
        System.out.println("nombre: " + cliente1.getNombre());
        System.out.println("apellido: " + cliente1.getApellido());
        System.out.println("edad: " + cliente1.getEdad());
        System.out.println();
        System.out.println("Objeto con herencia");
        Cliente clienteConHerencia = new Cliente(2, "A02", "Rodolfo", "El reno", 95);
        System.out.println("idcliente: " + clienteConHerencia.getId());
        System.out.println("membresia de cliente: " + clienteConHerencia.getMembresia());
        System.out.println("nombre: " + clienteConHerencia.getNombre());
        System.out.println("apellido: " + clienteConHerencia.getApellido());
        System.out.println("edad: " + clienteConHerencia.getEdad());
        System.out.println();
        System.out.println("Trabajador");
        Trabajador trabajador= new Trabajador(3,1,"Matutino","Falireo","Musulman", 87);
        System.out.println("IdTrabajador " + trabajador.getId());
        System.out.println("NoSeguro " + trabajador.getNoSeguro());
        System.out.println("Horario " + trabajador.getHorario());
        System.out.println("Nombre " + trabajador.getNombre());
        System.out.println("Apellido " + trabajador.getApellido());
        System.out.println("Edad " + trabajador.getEdad());

    }
}
