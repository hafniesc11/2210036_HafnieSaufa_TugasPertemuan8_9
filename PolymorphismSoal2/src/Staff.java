/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B 
*/

public class Staff extends Employee {
    private String title;

    public Staff(String nama, String alamat, String noTelepon, String email, 
            String kantor, double gaji, MyDate tanggalDipekerjakan, String title) {
        super(nama, alamat, noTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.title = title;
    }

     @Override
    public String toString() {
        return "Staff" + "\n" + super.toString() + "\n" +
               "Title: " + title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}