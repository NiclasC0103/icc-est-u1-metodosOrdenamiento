class SortInsertion:
    def sort_ascendente(self, numero):
        aux = 0
        j = 0
        n = len(numero)
        for i in range(1, n):
            aux=numero[i]
            j=i-1
            while(j>=0 and aux<numero[j]):
                numero[j+1]=numero[j]
                j=j-1
            
            numero[j+1]=aux
        return numero
    
    def sort_descendente(self, numero):
        aux = 0
        j = 0
        n = len(numero)
        for i in range(1, n):
            aux=numero[i]
            j=i-1
            while(j>=0 and aux>numero[j]):
                numero[j+1]=numero[j]
                j=j-1
            
            numero[j+1]=aux
        return numero