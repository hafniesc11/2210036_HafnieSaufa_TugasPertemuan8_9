/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

public class Person {
    String nama;
    String alamat;
    String noTelepon;
    String email;

    public Person(String nama, String alamat, String noTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }
    
    public String toString() {
        return "Person: \n" + "Nama: " + nama + "\n" +
                "Alamat: " + alamat + "\n" +
                "Nomor Telepon: " + noTelepon + "\n" +
                "Email: " + email;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public String getNoTelepon() {
        return noTelepon;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String nama) {
        this.nama = nama;
    }
    public void setAddress(String alamat) {
        this.alamat = alamat;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}