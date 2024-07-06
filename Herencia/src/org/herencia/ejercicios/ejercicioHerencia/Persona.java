public class Persona {

    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;


    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.numeroFiscal = "";
        this.direccion = "";
    }
    public Persona(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this(nombre,apellido);
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }
}
