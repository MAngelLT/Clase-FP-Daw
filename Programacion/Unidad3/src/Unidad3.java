public class Unidad3 {



    public static void main(String[] args) throws Exception {
         //Crear un objeto persona
        Persona p=new Persona();
        Persona p2=new Persona("Domingo",41,1.70);
        //Dar un nombre a la persona
        p.setNombre("Luis");
        p.saludar();

        p2.saludar();
        p2.presentacion();


        //Crear 3 personas
        Persona pepa=new Persona("Pepa",18,1.87);
        Persona miguel=new Persona("Miguel",27,1.79);
        Persona paco=new Persona("Paco",51,1.68);

        // Persona otra=pepa; //ESTO ES UNA REFERENCIA EN MEMORIA RAM
        Persona otra=new Persona(pepa);
        pepa.presentacion();
        //otra.nombre="Antonio";//SUSPENSO AUTOMÁTICO EN EL EXAMEN
        otra.setNombre("Luis"); //Hay que utilizar los métodos que acceden a los atributos
        pepa.presentacion();
        otra.presentacion();
        Persona2.imprime();
        Persona2 nueva=new Persona2("12345", "21/10/2026");
        nueva.imprime();
    
    }














    
}
