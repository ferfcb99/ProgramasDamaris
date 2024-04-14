package herencia1;

public class Trabajador extends Persona{
   private int id;
    private int noSeguro;
   private String horario;

   public Trabajador(){

   }
    public Trabajador(int id, int noSeguro, String horario){
        this.id = id;
        this.noSeguro = noSeguro;
        this.horario = horario;
    }
   public Trabajador(int id, int noSeguro, String horario, String nommbre, String apellido, int edad){
       super(nommbre,apellido,edad);
       this.id = id;
       this.noSeguro = noSeguro;
       this.horario = horario;
   }
   public int getId(){
       return this.id;
   }
   public void setId(int id){
       this.id = id;
   }

    public int getNoSeguro(){
       return this.noSeguro;
    }

    public void setNoSeguro(int noSeguro) {
        this.noSeguro = noSeguro;
    }
    public String getHorario(){
       return this.horario;
    }
    public void setHorario(String horario){
       this.horario = horario;

    }
}
