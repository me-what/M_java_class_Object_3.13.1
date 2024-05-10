public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        System.out.println(tom.toString());
        System.out.println();

        Person bob = new Person("Bob");
        System.out.println(bob.hashCode());

        System.out.println(tom.getClass());
        System.out.println();

        Person jacky = new Person("Jacky");
        Person piter = new Person("Piter");
        System.out.println(jacky.equals(piter));

        Person jacky_2 = new Person("Jacky");
        System.out.println(jacky.equals(jacky_2));
    }
}