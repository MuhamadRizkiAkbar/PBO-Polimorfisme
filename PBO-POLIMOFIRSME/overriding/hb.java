package overriding;

class Hewan {
    void bersuara() {
        System.out.println("Suara hewan");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk! Guk!");
    }
}

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meow!");
    }
}

public class hb {
    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        Anjing anjing = new Anjing();
        Kucing kucing = new Kucing();

        hewan.bersuara();
        anjing.bersuara();
        kucing.bersuara();
    }
}
