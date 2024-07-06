public class Cliente extends Persona{

    private int clienteId;

    public Cliente(String nombre,String apellido){
        super(nombre,apellido);
    }
    public Cliente(String nombre,String apellido,String numeroFiscal,String direccion){
        super(nombre,apellido,numeroFiscal,direccion);
    }

}
