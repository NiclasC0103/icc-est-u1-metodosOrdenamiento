public class SortInsercion {
    public SortInsercion(){
        System.out.println("Se creó mi clase SortInsercion\n");
    }

    public void sortAscendente(int[] numeros, boolean pasos){
        int aux, j;
        int len = numeros.length;
        for(int i=1; i<len; i++)
        {
            aux=numeros[i];
            j=i-1;
            if (pasos){
                System.out.println("i: " + i + ", j: " + j + ", aux: "+ aux);
            }
            while(j>=0 && aux<numeros[j])
            {
                if (pasos)
                    System.out.println("Compara aux: " + aux + " con numeros["+ j +"]: " + numeros[j]);

                numeros[j+1]=numeros[j];
                if (pasos)
                    printArray(numeros);
                j--;
                if (pasos)
                    System.out.println("Mueve numeros[" + (j + 1) + "] a numeros[" + (j + 2) + "]");
            }
            numeros[j+1]=aux;
            if (pasos){
                System.out.println("Inserta aux: "+ aux + "en la posicion " + (j+1));
                System.out.println("Estado actual");
                printArray(numeros);
            }
        }
    }

    public void sortDescendente(int[] numeros){
        int aux, j;
        int len = numeros.length;
        for(int i=1; i<len; i++)
        {
            aux=numeros[i];
            j=i-1;
            while(j>=0 && aux>numeros[j])
            {
                numeros[j+1]=numeros[j];
                j--;
            }
            numeros[j+1]=aux;
        }
    }

    public void sortByNameAscendente(String[] nombres) {
        int len = nombres.length;
        for (int i = 1; i < len; i++) {
            String aux = nombres[i];
            int j = i - 1;
            while (j >= 0 && aux.compareTo(nombres[j]) < 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = aux;
        }
    }

    public void sortByNameDescendente(String[] nombres) {
        int len = nombres.length;
        for (int i = 1; i < len; i++) {
            String aux = nombres[i];
            int j = i - 1;
            while (j >= 0 && aux.compareTo(nombres[j]) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }
            nombres[j + 1] = aux;
        }
    }

    public static void sortPersonasByAge(Persona[] personas) {
        int len = personas.length;
        for (int i = 1; i < len; i++) {
            Persona aux = personas[i]; 
            int j = i - 1;
            while (j >= 0 && aux.getAge() < personas[j].getAge()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = aux; 
        }
    }

    public void printArray(int[] numeros){
        int len = numeros.length;
        for(int i=0; i<len; i++)
        {
            if (i==0) {
                System.out.print("["+numeros[i]+",");
            } else if(i==len-1) {
                System.out.println(numeros[i]+"]");
            } else {
                System.out.print(numeros[i]+",");
            }
        }
    }

    public void printArrayName(String[] nombres){
        int len = nombres.length;
        for(int i=0; i<len; i++)
        {
            if (i==0) {
                System.out.print("["+nombres[i]+",");
            } else if(i==len-1) {
                System.out.println(nombres[i]+"]");
            } else {
                System.out.print(nombres[i]+",");
            }
        }
    }

    public static void printArrayPersonas(Persona[] personas){
        int len = personas.length;
        for(int i=0; i<len; i++)
        {
            if (i==0) {
                System.out.print("["+personas[i].getName()+",");
            } else if(i==len-1) {
                System.out.println(personas[i].getName()+"]");
            } else {
                System.out.print(personas[i].getName()+",");
            }
        }
    }
}
