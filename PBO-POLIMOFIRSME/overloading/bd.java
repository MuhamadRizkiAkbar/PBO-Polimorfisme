package overloading;
class BangunDatar {
    double luas() {
        return 0;
    }

    double luas(int sisi) {
        return sisi * sisi; // Luas persegi
    }

    double luas(int panjang, int lebar) {
        return panjang * lebar; // Luas persegi panjang
    }
}

public class bd {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        System.out.println("Luas persegi dengan sisi 5: " + bangunDatar.luas(5));
        System.out.println("Luas persegi panjang dengan panjang 6 dan lebar 4: " + bangunDatar.luas(6, 4));
    }
}
