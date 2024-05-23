/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String noTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, noTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
     public String toString() {
        return "Employee" + "\n" + super.toString() + "\n" + "Kantor: " + kantor + "\n" + "Gaji: " + gaji + "\n" + "Tanggal Kerja: " + tanggalDipekerjakan;
    }
    public String getKantor() {
        return kantor;
    }
    public double getGaji() {
        return gaji;
    }
    public MyDate getTanggalDipekerjakan() {
        return tanggalDipekerjakan;
    }
    public void setKantor(String kantor) {
        this.kantor = kantor;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setTanggalDipekerjakan(MyDate tanggalDipekerjakan) {
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }
}