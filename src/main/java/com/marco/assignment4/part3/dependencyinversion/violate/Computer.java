package com.marco.assignment4.part3.dependencyinversion.violate;

public class Computer {
    public Mouse mouse; //Computer is dependant on mouse

    public Computer(Mouse mouse) {
        this.mouse = mouse;
    }

    public void click(String click){
        if(click.equals("left")){
            mouse.leftClick();
        }else if(click.equals("right")){
            mouse.rightClick();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Computer computer = new Computer(mouse);

        computer.click("right");
    }
}
