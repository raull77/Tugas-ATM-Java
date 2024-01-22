// Kelas dasar atau superclass
class Hewan {
    String jenis;

    // Konstruktor kelas dasar
    public Hewan(String jenis) {
        this.jenis = jenis;
    }

    // Metode kelas dasar
    void bersuara() {
        System.out.println("Sebuah hewan bersuara");
    }
}

// Kelas turunan atau subclass
class Kucing extends Hewan {
    // Konstruktor kelas turunan
    public Kucing(String jenis) {
        super(jenis); // Memanggil konstruktor kelas dasar
    }

    // Metode kelas turunan yang meng-override metode kelas dasar
    @Override
    void bersuara() {
        System.out.println("Meow!");
    }

    // Metode kelas turunan tambahan
    void tidur() {
        System.out.println("Kucing tidur...");
    }
}

class ContohPewarisan {
    public static void main(String[] args) {
        // Membuat objek dari kelas turunan
        Kucing kucing = new Kucing("Persia");

        // Mengakses atribut dari kelas dasar
        System.out.println("Jenis kucing: " + kucing.jenis);

        // Memanggil metode dari kelas turunan yang meng-overide metode kelas dasar
        kucing.bersuara();

        // Memanggil metode tambahan dari kelas turunan
        kucing.tidur();
    }
}