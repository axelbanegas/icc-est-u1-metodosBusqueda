import controllers.MetodosBusqueda;
import controllers.MetodosdeBusquedaBinaria;
import models.Person;

public class App {
    public static void main(String[] args) {

        Person[] personas = new Person[7];
        personas[0] = new Person( 101, "Juan");
        personas[1] = new Person( 102, "Maria");
        personas[2] = new Person( 103, "Carlos");
        personas[3] = new Person( 104, "Ana");
        personas[4] = new Person( 105, "Luis");
        personas[5] = new Person( 106, "Sofia");
        personas[6] = new Person( 107, "Pedro");
            

        //MetodosBusqueda mb = new MetodosBusqueda(personas);
        MetodosdeBusquedaBinaria mBB = new MetodosdeBusquedaBinaria(personas);
        

        int[] arreglo = {3, 5, 7, 9, 11, 33, 18, 22, 45, 67, 89, 100};
        int valorBuscado = 7;
        //int resultado = mb.busquedaLineal(arreglo, valorBuscado);

        // if (resultado != -1) {
        //     System.out.println("Elemento encontrado en la posición: " + resultado);
        // } else {
        //     System.out.println("Elemento no encontrado.");
        // }

        mBB.showPersonByName();
    }
}