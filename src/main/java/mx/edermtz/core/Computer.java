package mx.edermtz.core;

import mx.edermtz.interfaces.DisplayModule;

public class Computer {
    DisplayModule dm;

    public void setDisplayModule(DisplayModule dm){
        this.dm = dm;
    }

    public void displayModule(){
        this.dm.display();
    }
}
