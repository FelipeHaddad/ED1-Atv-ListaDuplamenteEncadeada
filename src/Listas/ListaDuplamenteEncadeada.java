package Listas;

public class ListaDuplamenteEncadeada<T> {
    private No head;
    private No tail;
    private int count;

    public ListaDuplamenteEncadeada () {
        head = null;
        tail = null;
        count = 0;
    }

    public ListaDuplamenteEncadeada (No begin, No end, int contador) {
        head = begin;
        tail = end;
        count = contador;
    }

    public void adicionarFim (T conteudo) {
        No<T> node = new No(null, null, conteudo);
        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setProximo(node);
            node.setAnterior(tail);
            tail = node;
        }
        count++;
    }

    public void adicionarInicio(T conteudo) {
        No<T> node = new No(null, null, conteudo);
        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            head.setAnterior(node);
            node.setProximo(head);
            head = node;
        }
        count++;
    }

    public void exibirInicioFim() {
        if(isEmpty()) {
            System.out.println("Lista Vazia!");
        }
        No<T> aux = head;
        while (aux != null) {
            if (aux.getProximo() == null) {
                System.out.println(aux.getConteudo());
            } else {
                System.out.print(aux.getConteudo() + " <-> ");
            }
            aux = aux.getProximo();
        }
    }

    public void exibirFimInicio() {
        if(isEmpty()) {
            System.out.println("Lista Vazia!");
        }
        No<T> aux = tail;
        while (aux != null) {
            if (aux.getAnterior() == null) {
                System.out.println(aux.getConteudo());
            } else {
                System.out.print(aux.getConteudo() + " <-> ");
            }
            aux = aux.getAnterior();
        }
    }

    public void removerInicio () {
        head.getProximo().setAnterior(null);
        head = head.getProximo();
    }

    public void removerFim () {
        tail.getAnterior().setProximo(null);
        tail = tail.getAnterior();
    }

    public boolean isEmpty () {
        return count==0;
    }


    public static void main (String[] args) {

    }
}
