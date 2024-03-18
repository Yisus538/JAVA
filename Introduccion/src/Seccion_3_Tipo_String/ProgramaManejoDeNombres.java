package Seccion_3_Tipo_String;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Debe proporcionar exactamente 3 nombres como argumentos de línea de comandos.");
            return;
        }

        String[] nuevosNombres = new String[3];

        for (int i = 0; i < 3; i++) {
            String nombre = args[i];
            if (nombre.length() < 2) {
                System.out.println("El nombre proporcionado debe tener al menos dos caracteres.");
                return;
            }

            char segundoCaracter = nombre.charAt(1);
            char segundoCaracterMayus = Character.toUpperCase(segundoCaracter);
            String ultimosDosCaracteres = nombre.substring(nombre.length() - 2);

            nuevosNombres[i] = segundoCaracterMayus + "." + ultimosDosCaracteres;
        }

        String resultado = String.join("_", nuevosNombres);
        System.out.println(resultado);
    }
}
