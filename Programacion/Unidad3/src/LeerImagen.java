import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
public class LeerImagen {

    public static void main(String[] args) {
    // Rutas de entrada y salida
        String rutaEntrada = "C:/Users/usuario/Desktop/Programación/Clase-FP-Daw/Lenguaje de Marcas/img/hallowen2.jpg";
        String rutaSalida = "./salida.png";
        try {
        // Leer la imagen JPEG
        BufferedImage imagen = ImageIO.read(new File(rutaEntrada));
            if (imagen == null) {
            System.out.println("No se pudo leer la imagen. Verifica el formato y la ruta.");
            return;
        }
        // Guardar como PNG
        boolean resultado = ImageIO.write(imagen, "png", new File(rutaSalida));
        if (resultado) {
            System.out.println("Conversión completada. Imagen guardada como " + rutaSalida);
        } 
        else {
            System.out.println("No fue posible escribir la imagen en formato PNG.");
        }
        } catch (IOException e) {
            System.err.println("Error al procesar la imagen: " + e.getMessage());
        }
    }




    
}
