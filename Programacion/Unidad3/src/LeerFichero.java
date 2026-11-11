import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerFichero {

    public static void main(String[] args) {
        
        File archivo = null;
        FileReader reader =null;
        BufferedReader buffer =null;
        try {
            BufferedReader leer= new BufferedReader(new FileReader("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Programacion/Unidad3/FicheroEjemplo.txt"));

            String linea;
            while((linea=leer.readLine()) != null){  //mientras que la variable linea sea diferente a vacia entonces... imprimela 
                System.out.println(linea);
            }

            leer.close();

            
        } catch (Exception e) {
        System.out.println(e.getMessage());   
    }    
    
    }

}
