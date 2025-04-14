
public class MetodosBusqueda {
    /**
     * Método para realizar búsqueda lineal en un arreglo
     * @param arreglo Arreglo donde se buscará
     * @param valorBuscado Valor que se quiere encontrar
     * @return Índice del valor encontrado, o -1 si no está presente
     */
    public int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; 
            }
        }
        return -1; 
    }
}