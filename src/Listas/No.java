// Felipe Bertacco Haddad - 10437372

package Listas;

public class No<T> {
    private No<T> proximo;
    private No<T> anterior;
    private T conteudo;

    // Constructors
    public No () {
        this.proximo = null;
        this.anterior = null;
        this.conteudo = null;
    }

    public No (No<T> proximo, No<T> anterior, T conteudo) {
        this.proximo = proximo;
        this.anterior = anterior;
        this.conteudo = conteudo;
    }

    // Getters
    public No<T> getProximo () {
        return proximo;
    }

    public No<T> getAnterior () {
        return anterior;
    }

    public T getConteudo () {
        return conteudo;
    }

    // Setters
    public void setProximo (No<T> prox) {
        this.proximo = prox;
    }

    public void setAnterior (No<T> ant) {
        this.anterior = ant;
    }

    public void setConteudo (T cont) {
        this.conteudo = cont;
    }

    public static void main (String[] args) {

    }
}
