import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ProcesarJSON {

    public static void main() {
        try {
             // Lectura del contenido del fichero JSON
        Object ob = new JSONParser().parse(new FileReader("./Unidad3/JSONFile.json"));

        // Convertir objeto a JSON y procesarlo
        JSONObject js = (JSONObject) ob;
        String firstName = (String) js.get("firstName");
        String lastName = (String) js.get("lastName");
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        JSONArray arr = (JSONArray) js.get("phoneNumbers");
            for (Object item:arr) {
                JSONObject data = (JSONObject) item;
                String tipo= (String) data.get("type");
                String post_id = (String) data.get("phone-number");
                System.out.println("TIPO:"+tipo+" Número:"+ post_id);
            }
            
        } catch (IOException e) {
            System.out.println("Error en la lectura JSON");
        }catch (org.json.simple.parser.ParseException e){
            e.printStackTrace();
        }
    }
    
}
