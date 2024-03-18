package Seccion_9_ClaseSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSystem {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/setting.properties");
            Properties p = new Properties(System.getProperties());
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(p);
            System.getProperties().list(System.out);

        } catch (Exception e) {
            System.out.println("No existe el archivo " + e);
            throw new RuntimeException(e);
        }
    }
}
