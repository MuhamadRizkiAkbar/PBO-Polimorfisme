package overloading;
class KonversiSuhu {
    double konversi(double suhu) {
        return 0;
    }

    double konversi(double suhu, String skalaAwal, String skalaAkhir) {
        if (skalaAwal.equals("C") && skalaAkhir.equals("F")) {
            return (suhu * 9/5) + 32;
        } else if (skalaAwal.equals("F") && skalaAkhir.equals("C")) {
            return (suhu - 32) * 5/9;
        } else {
            return suhu;
        }
    }
}

public class ks {
    public static void main(String[] args) {
        KonversiSuhu konversiSuhu = new KonversiSuhu();

        System.out.println("30°C ke Fahrenheit: " + konversiSuhu.konversi(30, "C", "F"));
        System.out.println("86°F ke Celcius: " + konversiSuhu.konversi(86, "F", "C"));
    }
}
