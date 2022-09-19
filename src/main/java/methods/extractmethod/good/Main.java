package main.java.methods.extractmethod.good;

public class Main {

    void printHTML(){
        
        printHead();
        printBody();
        printfooter();

        
    }

    private void printBody() {
    }

    private void printHead() {
    }
    private void printfooter() {//
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    }
}
