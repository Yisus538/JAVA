package Seccion_5_FlujoDeControl;

public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }

        System.out.println("\n=====================================");
       etiqueta:
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}
