/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

public class Faculty extends Employee {

    private String jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelepon, String email, String kantor, int gaji, MyDate tanggalDipekerjakan, String jamKerja, String pangkat) {
        super(nama, alamat, noTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat; 
    }

    @Override
    public String toString() {
        return "Faculty" + "\n" + super.toString() + "\n" + "Jam Kerja: " + jamKerja + "\n" + "Pangkat: " + pangkat;
    }

    public String getJamKerja() {
        return jamKerja;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setJamKerja(String jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }
}

