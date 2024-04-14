package herencia1;

public class Cliente extends Persona{

    private int id;
    private String membresia;

    public Cliente(){

    }

    public Cliente(int id, String membresia){
        this.id = id;
        this.membresia = membresia;
    }

    public Cliente(int id, String membresia, String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        this.id = id;
        this.membresia = membresia;
    }




    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMembresia(){
        return this.membresia;
    }

    public void setMembresia(String membresia){
        this.membresia = membresia;
    }

}
