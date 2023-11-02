public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Marsel");
        person.setAge(30);
        System.out.println(person+"\n\n");
        Employ employ = new Employ(180000.0,"Programer");
        System.out.println(employ);


    }
}