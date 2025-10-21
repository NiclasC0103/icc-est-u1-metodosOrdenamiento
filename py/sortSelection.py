class SortSelection:
    def sort_ascendente(self, numero):
        n = len(numero)
        aux=0
        for i in range (n-1):
            m_pos=i

            for j in range (i+1, n):
                 if (numero[j]<numero[m_pos]):
                      m_pos=j

            if (i != m_pos):
                 aux=numero[m_pos]
                 numero[m_pos]=numero[i]
                 numero[i]=aux

        return numero
    
    def sort_descendente(self, numero):
        n = len(numero)
        aux=0
        for i in range (n-1):
            m_pos=i
            
            for j in range (i+1, n):
                 if (numero[j]>numero[m_pos]):
                      m_pos=j

            if (i != m_pos):
                 aux=numero[m_pos]
                 numero[m_pos]=numero[i]
                 numero[i]=aux

        return numero