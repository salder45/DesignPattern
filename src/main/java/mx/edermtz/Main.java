package mx.edermtz;

import mx.edermtz.core.Computer;
import mx.edermtz.impl.Monitor;
import mx.edermtz.impl.Projector;
import mx.edermtz.interfaces.DisplayModule;

public class Main {
    public static void main(String[] args) {
        Computer cm = new Computer();

        DisplayModule monitor = new Monitor();
        DisplayModule projector = new Projector();

        cm.setDisplayModule(monitor);
        cm.displayModule();
        cm.setDisplayModule(projector);
        cm.displayModule();

    }
}