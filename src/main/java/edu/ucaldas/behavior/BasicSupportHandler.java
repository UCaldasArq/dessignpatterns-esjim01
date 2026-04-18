package edu.ucaldas.behavior;

public class BasicSupportHandler extends Handler {
    @Override
    public String handleRequest(String solicitud) {
        if (solicitud.equals("básica")) {
            return "Atendido por Soporte Básico";
        } else if (siguiente != null) {
            return siguiente.handleRequest(solicitud);
        }
        return "No se puede atender la solicitud.";
    }
}