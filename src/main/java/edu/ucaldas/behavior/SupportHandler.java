package edu.ucaldas.behavior;

public class SupportHandler {
    public static Handler createChain() {
        Handler basico = new BasicSupportHandler();
        Handler supervisor = new SupervisorHandler();
        Handler manager = new ManagerHandler();

        basico.setSiguiente(supervisor).setSiguiente(manager);

        return basico;
    }
}