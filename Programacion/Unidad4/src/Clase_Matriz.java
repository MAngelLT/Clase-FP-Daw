public class Clase_Matriz {

    public static void main(String[] args) {

        // **MATRICES**

        //Una matriz en java es un vector de vectores
        
        String[][] comidas = {
            {"Avena", "Cereal", "Huevo", "Yogur", "Fruta", "Pan tostado con aguacate", "Hotcakes"},
            {"Pollo", "Sándwich", "Verduras", "Atún", "Bistec", "Champiñones", "Espagueti"},
            {"Frijoles", "Quesadillas", "Estofado", "Picadillo", "Lasaña", "Ensalada", "Pizza"}
            };
        String[] b = comidas[1];  //guardamos dentro de una variable vector la fila 1
        System.out.println(comidas[1][2]); //imprimmimos la fila 1 y la posicion 2 de la matriz
        System.out.println(b[2]); //imprimimos la posicion 2 de el vector


        //Recorrer Matriz

        //recorrer filas
        for(int i=0;i<comidas.length;i++){
            //Recorrer columnas
            for(int j=0;j<comidas[i].length;j++){// para que cuente la longitud y limite a la longitud
                System.out.print(comidas[i][j]+"-");
            }
            System.out.println();
        }
    }
    
}
