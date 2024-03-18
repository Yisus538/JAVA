package Seccion_7_ValorReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,12};

        System.out.println("iniciamos el metodo main con i = ");
        for(int i : edad){
            System.out.println("edad = " + i);
        }
        System.out.println("Antes de llamar al metodo test.");
        test(edad);
        System.out.println("Despues de llamar al metodo test.");
        for(int i = 0; i < edad.length; i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados!");
    }

    public static void test(int[] edad){
        System.out.println("Iniciamos el metodo test");
        for(int i = 0; i < edad.length; i++){
           edad[i] += 20;
        }
        System.out.println("Finaliza el metodo test");
    }
}
