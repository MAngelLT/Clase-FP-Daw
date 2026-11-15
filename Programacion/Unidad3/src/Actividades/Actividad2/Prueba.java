package Actividades.Actividad2;

public class Prueba {
    public static void main(String[] args) {
        
        // Creamos una persona con el constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("------------------- Persona 1 - Constructor por Defecto -----------------------");
        persona1.imprimeInformacion();

        // Modificamos sus datos usando los setters
        persona1.setCedula("1002938475");
        persona1.setNombre("Jusus");
        persona1.setApellido("Apolo");
        persona1.setGenero('M');
        persona1.setFechaNacimiento(new Fecha(15, 8, 1999));
        persona1.setCiudadResidencia(new Ciudad(1, "Granada", 23));

        System.out.println("------------- Persona 1 con datos modificados -----------");
        persona1.imprimeInformacion();

        //  Creamos una persona con el constructor de parámetros
        Fecha fechaNac = new Fecha(10, 3, 2000);
        Ciudad ciudadNac = new Ciudad(2, "Jaen", 53);
        Ciudad ciudadRes = new Ciudad(3, "Málaga", 35);

        Persona persona2 = new Persona("0987654321", "Ana", "Fuentes", 'F', fechaNac, ciudadNac, ciudadRes);
        
        System.out.println("--------------- Persona 2 - Constructor con Parámetros -------------");
        persona2.imprimeInformacion();

        // Modificamos un atributo de la persona 2 (apellido y ciudad )
        persona2.setApellido("Durango");
        persona2.setCiudadResidencia(new Ciudad(3, "Sevilla", 5));

        System.out.println(" --------------Persona 2 con datos modificados------------ ");
        persona2.imprimeInformacion();
    }



}
    

    

