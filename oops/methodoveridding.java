package oops;

import java.util.*;

public class methodoveridding {
    static class Animal {
        void eats() {
            System.out.println("animals eats");
        }
    }

    static class Deer extends Animal {
        void eats() {
            System.out.println("deer eats");
        }

    }

    public static void main(String[] args) {
        Deer d = new Deer();
        d.eats();
    }
}
