import Listas.*;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        // Adicionando módulos
        lista.adicionarFim("Introdução");
        lista.adicionarFim("Algoritmos");
        lista.adicionarFim("Estruturas de Dados");
        lista.adicionarInicio("Pré-requisitos");

        System.out.println("Lista (do início ao fim):");
        lista.exibirInicioFim();

        System.out.println("\nLista (do fim ao início):");
        lista.exibirFimInicio();

        // Remoção de elementos
        lista.removerInicio(); // Remove "Pré-requisitos"
        lista.removerFim();    // Remove "Estruturas de Dados"

        System.out.println("\nApós remoções:");
        lista.exibirInicioFim();


        ListaCircularDuplamenteEncadeada<String> listaCircular =
                new ListaCircularDuplamenteEncadeada<>();

        listaCircular.adicionar("Introdução");
        listaCircular.adicionar("Algoritmos");
        listaCircular.adicionar("Estruturas de Dados");
        listaCircular.adicionar("POO");

        System.out.println("\nLista sem remoção:");
        listaCircular.navegarCircular(4); // Avança 5 posições (com repetição)

        listaCircular.removerInicio();
        System.out.println("\nLista após remover inicio (percorrendo 4 posições):");
        listaCircular.navegarCircular(4);

        listaCircular.removerFim();
        System.out.println("\nLista após remover o fim (percorrendo 4 posições):");
        listaCircular.navegarCircular(4);

        System.out.println("\nNavegação circular reversa:");
        listaCircular.navegarCircular(-3); // Retrocede 3 posições

    }
}
