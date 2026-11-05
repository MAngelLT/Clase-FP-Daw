import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;

public class FileIO {

    public static void main(String[] args) {

        throws FileNotFoundException, IOException{
        FileInputStream in = new FileInputStream("C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Lenguaje de Marcas/img/hallowen2.jpg");
        FileOutputStream out = new FileOutputStream("./salida.jpg");
        int n=0,c;
        System.out.print ("\nCopiando ...");
        while( (c = in.read()) != -1){
            out.write(c);
            n++;
        }

        in.close();
        out.close();
        System.out.print ("\nSe han copiado "+n+" Bytes\n");        
        

        }
    }
    
}
