package edu.ucaldas.behavior;

public abstract class Handler {
    protected Handler siguiente;

    public Handler setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
        return siguiente;
    }

    public abstract String handleRequest(String solicitud);
}