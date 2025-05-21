package Assignment;

interface Washingmachine {
    void wash();
}

class Mode {
    public void quickmode() {
        System.out.println("The machine washes the clothes for 45 mins.");
    }
}

class Fuzzymode extends Mode implements Washingmachine {
    public void fuzzy() {
        System.out.println("This mode is suitable for jackets and denims.");
    }

    public void wash() {
        System.out.println("The washing machine is now washing the clothes");
    }
}

class Drain {
    public void drain() {
        System.out.println("The machine drains out the excess water.");
    }
}

class Spinmode extends Drain {
    public void spin() {
        System.out.println("The clothes are dried using the spin mode.");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Fuzzymode f1 = new Fuzzymode();
        Mode m1 = new Mode();
        Drain d1 = new Drain();
        Spinmode s1 = new Spinmode();

        System.out.println("=== Washing Machine Simulation ===");
        f1.wash();        // added for interface method
        m1.quickmode();
        f1.fuzzy();
        s1.spin();
        d1.drain();
    }
}
