public class App {
    public static void main(String[] args) {
        
        MetodosBusqueda mb = new MetodosBusqueda();

        int[] arreglo = {3, 5, 7, 9, 11};
        int valorBuscado = 7;
        int resultado = mb.busquedaLineal(arreglo, valorBuscado);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en la posición: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}