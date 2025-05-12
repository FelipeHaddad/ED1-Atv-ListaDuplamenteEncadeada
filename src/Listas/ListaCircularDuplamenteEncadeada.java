// Felipe Bertacco Haddad - 10437372

package Listas;

public class ListaCircularDuplamenteEncadeada<T> {
    private No head;
    private No tail;
    private int count;

    public ListaCircularDuplamenteEncadeada () {
        head = null;
        tail = null;
        count = 0;
    }

    public ListaCircularDuplamenteEncadeada (No begin, No end, int contador) {
        head = begin;
        tail = end;
        count = contador;
    }

    public void adicionar (T conteudo) {
        No<T> node = new No(null, null, conteudo);
        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setProximo(node);
            node.setAnterior(tail);
            node.setProximo(head);
            head.setAnterior(node);
            tail = node;
        }
        count++;
    }

    /*
    public void adicionarInicio(T conteudo) {
        No<T> node = new No(null, null, conteudo);
        if(isEmpty()) {
            head = node;
            tail = node;
        } else {
            head.setAnterior(node);
            node.setProximo(head);
            tail.setProximo(node);
            node.setAnterior(tail);
            head = node;
        }
        count++;
    }
    */

    public void navegarCircular(int contador) {
        if(isEmpty()) {
            System.out.println("Lista Vazia!");
        }
        if (contador == 0) {
            System.out.println("Insira um numero maior ou menor que 0");
        }
        No<T> aux = head;
        while (contador != 0) {
            if (contador > 0) {
                System.out.println(aux.getConteudo());
                aux = aux.getProximo();
                contador--;
            } else {
                aux = aux.getAnterior();
                System.out.println(aux.getConteudo());
                contador++;
            }
        }
    }

    public void exibirFimInicio() {
        if(isEmpty()) {
            System.out.println("Lista Vazia!");
        }
        No<T> aux = tail;
        int contadorAux = count;
        while (contadorAux != -1) {
            if (aux.getAnterior() == tail) {
                System.out.println(aux.getConteudo());
            } else {
                System.out.print(aux.getConteudo() + " <-> ");
            }
            aux = aux.getAnterior();
            contadorAux--;
        }
    }

    public void removerInicio () {
        head.getProximo().setAnterior(tail);
        tail.setProximo(head.getProximo());
        head = head.getProximo();
    }

    public void removerFim () {
        tail.getAnterior().setProximo(head);
        head.setAnterior(tail.getAnterior());
        tail = tail.getAnterior();
    }

    public boolean isEmpty () {
        return count==0;
    }


    public static void main (String[] args) {

    }
}
