/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Hafnie Saufa", "Babelan, Bekasi", "0812-9273-2301", "apnisc@gmail.com");
        Student student = new Student("Kemal Maulana", "Setiabudhi", "0821-3928-9902", "kemalana@upi.edu", Student.Senior);
        Employee employee = new Employee("Farhan Firman", "Jati Bening", "0813-2342-3421", "firmanhan@yahoo.com", 
                "PT Bursa", 700000, new MyDate(2024, 10, 2));
        Faculty faculty = new Faculty("Prof. Dr. Defin", "Jl. Arjuna 1", "0812-3821-0004", "definwa@gmail.com", 
                "R-303", 200000, new MyDate(2008, 11, 11), "10am - 4pm", "Professor");
        Staff staff = new Staff("Eka Nurul", "Jl. Sukakamu", "0123-2391-3834", "nurul@email.com", "B345", 15000, new MyDate(2004, 3, 14), "Administrasi");

        System.out.println(person);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(staff);
    }
}