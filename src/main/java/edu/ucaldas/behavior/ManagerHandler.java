
package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {
    @Override
    public String handleRequest(String solicitud) {
        if (solicitud.equals("avanzada")) {
            return "Atendido por Gerente";
        } else if (siguiente != null) {
            return siguiente.handleRequest(solicitud);
        }
        return "No se puede atender la solicitud.";
    }
}