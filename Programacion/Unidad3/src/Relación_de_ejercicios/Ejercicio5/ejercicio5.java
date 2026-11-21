package Relación_de_ejercicios.Ejercicio5;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ejercicio5 {


    public static void Buscar_con_inicial(String letraInicial,String rutaArchivo){

        JSONParser parser = new JSONParser(); //Se crea el traductor


        try {
            // Se lee el archivo

            Object obj = parser.parse(new FileReader(rutaArchivo));

            // Convertir el contenido en un array JSON
            JSONArray heroes = (JSONArray) obj;
            System.out.printf("%-20s %-30s%n","SUPERHEROE", "ALTER EGO"); //tabla de 
            System.out.println("-----------------------------------------------");

            // Recorrer los héroes del fichero (ahora es un array)
            for (Object elemento : heroes) {
                JSONObject heroe = (JSONObject) elemento;
                //Vamos a leer datos del héroe
                String superhero = (String) heroe.get("superhero");
                String publisher = (String) heroe.get("publisher");
                String alterEgo = (String) heroe.get("alter_ego");

                if (publisher.contentEquals("DC Comics")&& superhero.startsWith(letraInicial)){//Si el publisher es Dc Comics  y empieza por (letra ingresada)

                    System.out.printf("%-20s %-30s%n",superhero,alterEgo);

                }

            }

            System.out.println("---------------------------------------------------------------------------");

            


        } catch (IOException e) {
            System.out.println("Error en lectura JSON "+e.getMessage());
            
        }catch(org.json.simple.parser.ParseException e){
            e.printStackTrace();

        }



    }

    public static void main(String[] args) {

        Buscar_con_inicial("G", "./heroes.json");//


        
    }
    
}
