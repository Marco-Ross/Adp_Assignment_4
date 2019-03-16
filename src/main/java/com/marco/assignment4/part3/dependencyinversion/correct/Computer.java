package com.marco.assignment4.part3.dependencyinversion.correct;
//Computer no longer has the dependency on Mouse
//It has been abstracted into clicker interface, and both Computer and Mouse depend on (Click Interface)
//Other mouse variants can be added easier now, by implementing Click and having different functionality
public class Computer {
    public Click clicker;

    public Computer(Click clicker) {
        this.clicker = clicker;
    }

    public void click(String click){
        if(click.equals("left")){
            clicker.leftClick();
        }else if(click.equals("right")){
            clicker.rightClick();
        }else if(click.equals("middle")){
            clicker.middleClick();
        }
    }

    public static void main(String[] args) {
        Click click = new Mouse();
        Computer computer = new Computer(click);

        computer.click("right");
    }
}
