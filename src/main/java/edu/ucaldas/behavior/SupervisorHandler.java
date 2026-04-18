package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {
    @Override
    public String handleRequest(String solicitud) {
        if (solicitud.equals("intermedia")) {
            return "Atendido por Supervisor";
        } else if (siguiente != null) {
            return siguiente.handleRequest(solicitud);
        }
        return "No se puede atender la solicitud.";
    }
}