import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 0, -5, 5, 15, 2};
        String[] nombres = {"Pedro", "Ana", "Maria", "Luis", "Juan"};
        int res;
        Boolean pasos;
        //SortBubble bubblesort = new SortBubble();
        //SortSeleccion selectionsort = new SortSeleccion();
        SortInsercion insercionsort = new SortInsercion();

        System.out.println("Estudiante: Nicolás Cornejo");

        System.out.println("El vector ingresado es");
        //bubblesort.printArray(numeros);
        //selectionsort.printArray(numeros);
        insercionsort.printArray(numeros);

        //bubblesort.sortAscendente(numeros);
        //selectionsort.sortAscendente(numeros);
        System.out.println("Desea visualizar los pasos?");
        System.out.println("1. SI");
        System.out.println("2. NO");
        System.out.print("Respuesta: ");
        res=scanner.nextInt();
        pasos = res==1;

        insercionsort.sortAscendente(numeros, pasos);

        System.out.println("El vector ordenado de forma ascendente es:");
        //bubblesort.printArray(numeros);
        //selectionsort.printArray(numeros);
        insercionsort.printArray(numeros);

        //bubblesort.sortDescendente(numeros);
        //selectionsort.sortDescendente(numeros);
        insercionsort.sortDescendente(numeros);

        System.out.println("El vector ordenado de forma descendente es:");
        //bubblesort.printArray(numeros);
        //selectionsort.printArray(numeros);
        insercionsort.printArray(numeros);

        System.out.println("El vector de nombres ingresado es");
        insercionsort.printArrayName(nombres);

        insercionsort.sortByNameAscendente(nombres);

        System.out.println("El vector de nombres ordenado de forma ascendente es:");
        insercionsort.printArrayName(nombres);

        insercionsort.sortByNameDescendente(nombres);

        System.out.println("El vector de nombres ordenado de forma descendente es:");
        insercionsort.printArrayName(nombres);

        Persona[] personas = new Persona[] {
            new Persona("Pedro", 30),
            new Persona("Ana", 25),
            new Persona("Maria", 28),
        };
        System.out.println("Array de Personas:");
        SortInsercion.printArrayPersonas(personas);
        SortInsercion.sortPersonasByAge(personas);
        System.out.println("Array de Personas Ordenado por edad:");
        SortInsercion.printArrayPersonas(personas);
    }
}
