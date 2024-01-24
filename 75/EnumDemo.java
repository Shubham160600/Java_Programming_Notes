/* Enumeration with Constructor, instance variable and Method. */

package shubham;

enum Student {
    John(11), Bella(10), Sam(13), Viraaj(9);

    private int age; // age of students

    int getAge() {
        return age;
    }

    Student(int age) {
        this.age = age;
    }
}

class EnumDemo {
    public static void main(String args[]) {
        Student S;
        System.out.println("Age of Viraaj is " + Student.Viraaj.getAge() + " years");
    }
}

