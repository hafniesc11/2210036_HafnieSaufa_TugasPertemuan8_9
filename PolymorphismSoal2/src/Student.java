/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

public class Student extends Person {
    public static final String TahunPertama= "Tahun Pertama";
    public static final String TahunKedua = "Tahun Kedua";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";

    private String status;
    public Student(String nama, String alamat, String noTelepon, String email, String status) {
        super(nama, alamat, noTelepon, email);
        this.status = status;
    }
    @Override
    public String toString() {
        return "Student" + "\n" + super.toString() + "\n" +
        "Status: " + status;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}

