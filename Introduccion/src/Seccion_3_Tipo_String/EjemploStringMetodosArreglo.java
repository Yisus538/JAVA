package Seccion_3_Tipo_String;

public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {
        
        String trabaLengua = "trabalenguas";
        System.out.println("trabaLengua.toCharArray() = " + trabaLengua.toCharArray()); //Convierte string en arreglo

        char[] arreglo = trabaLengua.toCharArray();

        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i]);
        }

        System.out.println("\ntrabaLengua = " + trabaLengua.split("a"));//Separa los elementos en un arreglo String con el argumento que le pases
        String[] arreglo2 = trabaLengua.split("a");
        int l = arreglo2.length;

        for (int i = 0; i < l; i++){
            System.out.println("arreglo2 = " + arreglo2[i]);
        }


    }
}
