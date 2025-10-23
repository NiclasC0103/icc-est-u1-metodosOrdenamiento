#from sortSelection import SortSelection
from sortInsertion import SortInsertion

def main():
    numero = [5, 2, 9, 1, 5, 6]
    print("Estudiante: Nicolás Cornejo")
    print("Original: ", numero)

    #selection = SortSelection()
    insertion = SortInsertion()

    #selection.sort_ascendente(numero)
    insertion.sort_ascendente(numero)

    print("Ordenado Ascendente: ", numero)

    #selection.sort_descendente(numero)
    insertion.sort_descendente(numero)

    print("Ordenado Descendente: ", numero)

if __name__ == "__main__":
    main()