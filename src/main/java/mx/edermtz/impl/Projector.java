package mx.edermtz.impl;

import mx.edermtz.interfaces.DisplayModule;

public class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("Display through projector");
    }
}
