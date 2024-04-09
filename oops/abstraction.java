package oops;

public class abstraction {
    static abstract class Animal {
        void eats() {
            System.out.println("animals eats");
        }

        abstract void Walk();
    }

    static class Horse extends Animal {
        void Walk() {
            System.out.println("4 legs");
        }

    }

    class chicken extends Animal {
        void Walk() {
            System.out.println("2 legs");
        }
    }

    public static void main(String[] args) {
        Horse h = new Horse();
        h.Walk();
        h.eats();
    }
}
