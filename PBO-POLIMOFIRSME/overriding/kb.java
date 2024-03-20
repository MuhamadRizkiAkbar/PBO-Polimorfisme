package overriding;

class Kendaraan {
    void berjalan() {
        System.out.println("Kendaraan berjalan");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil melaju dengan kecepatan 60 km/jam");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda dikayuh dengan kecepatan 15 km/jam");
    }
}

public class kb {
    public static void main(String[] args) {
      Kendaraan kendaraan = new Kendaraan();
      Mobil mobil = new Mobil(); 
      Sepeda sepeda = new Sepeda(); 
      kendaraan.berjalan(); 
      mobil.berjalan(); 
      sepeda.berjalan(); 

    }
  }
