public class SortBubble {
    public SortBubble(){
        System.out.println("Se creó mi clase BubbleSort\n");
    }

    public void sortAscendente(int[] numeros){
        int len = numeros.length;
        int aux;
        for (int i=0; i<len-1; i++)
        {
            boolean hayCambio = false; //swapped
            for (int j=0; j<len-(i+1); j++)
            {
                if(numeros[j]>numeros[j+1])
                {
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                    hayCambio=true;
                }
            }
            if (!hayCambio){
                break;
            }
        }
    }

    public void sortDescendente(int[] numeros){
        int len = numeros.length;
        int aux;
        for (int i=0; i<len-1; i++)
        {
            boolean hayCambio = false; //swapped
            for (int j=0; j<len-(i+1); j++)
            {
                if(numeros[j]<numeros[j+1])
                {
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                    hayCambio=true;
                }
            }
            if (!hayCambio){
                break;
            }
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

}
