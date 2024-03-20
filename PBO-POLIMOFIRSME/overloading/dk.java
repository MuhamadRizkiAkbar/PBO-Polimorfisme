package overloading;
class Karyawan {
    void cetakData() {
        System.out.println("Data Karyawan");
    }

    void cetakData(String nama) {
        System.out.println("Nama: " + nama);
    }

    void cetakData(String nama, int gaji) {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp" + gaji);
    }
}

public class dk {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();

        karyawan.cetakData();
        karyawan.cetakData("Budi");
        karyawan.cetakData("Ani", 5000000);
    }
}

