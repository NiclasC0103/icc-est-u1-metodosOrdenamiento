public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};

        SortBubble bubblesort = new SortBubble();

        System.out.println("El vector ingresado es");
        bubblesort.printArray(numeros);

        bubblesort.sortAscendente(numeros);

        System.out.println("El vector ordenado de forma ascendente es:");
        bubblesort.printArray(numeros);

        bubblesort.sortDescendente(numeros);

        System.out.println("El vector ordenado de forma descendente es:");
        bubblesort.printArray(numeros);

    }
}
