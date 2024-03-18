package Seccion_7_ValorReferencia;

class Persona{
    private String nombre;

    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Jesus");

        System.out.println("iniciamos el metodo main con i = ");
        System.out.println("persona = " + persona.getNombre());
        System.out.println("Antes de llamar al metodo test.");
        test(persona);
        System.out.println("Despues de llamar al metodo test.");
        System.out.println("persona = " + persona.getNombre());
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados!");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }

}
