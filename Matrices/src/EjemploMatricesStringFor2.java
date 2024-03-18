public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};


        for(String[] filas : nombres){
            for(String nombre : filas){
                System.out.println(nombre + "\t");
            }
            System.out.println();
        }


    }
}
