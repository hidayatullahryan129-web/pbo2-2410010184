package id.ac.uniska.pbo2.p02;

/**
 * Skripsi adalah koleksi yang hanya dapat dibaca di tempat.
 */
public class Skripsi extends Koleksi {

    private final String penulis;
    private final String programStudi;

    public Skripsi(String kode, String judul, int tahunTerbit,
                   String penulis, String programStudi) {
        super(kode, judul, tahunTerbit);
        this.penulis = penulis;
        this.programStudi = programStudi;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    /**
     * Skripsi hanya dapat dibaca di tempat,
     * sehingga tidak memiliki batas waktu peminjaman.
     */
    @Override
    public int batasHariPinjam() {
        return 0;
    }

    /**
     * Skripsi tidak dapat dipinjam.
     */
    @Override
    public boolean pinjam() {
        return false;
    }

    /**
     * Denda skripsi selalu 0.
     */
    @Override
    public long hitungDenda(int hariTerlambat) {
        return 0;
    }

    @Override
    public String keterangan() {
        return "Skripsi oleh " + penulis
                + ", Program Studi " + programStudi;
    }
}