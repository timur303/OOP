package HomeWork;


public class Main {

    public static void main(String[] args) {
        // class doc
        Doc doc = new Doc();// class doc
        doc.setName("Tuzik");
        doc.setBreed("Evro");
        doc.setAge(7);
        System.out.println(doc.getName());
        System.out.println(doc.getBreed());
        System.out.println(doc.getAge());

        System.out.println("_______________________________");
        //class cat
        Cat cat = new  Cat();
        cat.setName("Том");
        cat.setColor("Сары");
        cat.setWeight(11);
        cat.setAge(1);

        System.out.println("Мышыгыныздын жашы: " +cat.getAge());
        System.out.println("Мышыгыныздын салмагы: "+cat.getWeight());
        System.out.println(cat.getColor());
        System.out.println(" Мышыгыныздын аты: "+cat.getName());
        System.out.println("_______________________________");

        //class Fish
        Fish fish = new Fish();
        fish.setName("Алтын балык");
        fish.setBreed("Микижа");
        fish.setWeight(4);
        fish.setLength(5.5);

        System.out.println(fish.getName());
        System.out.println(fish.getBreed());
        System.out.println("Балыктын салмагы "+fish.getWeight());
        System.out.println("Балыктын узундугу "+fish.getLength());

        System.out.println("______________________________");

        //class Parrot

        Parrot parrot = new Parrot();
        parrot.setName("Ломар");
        parrot.setBreed("Амазон");
        parrot.setColor("Кызыл");
        parrot.setAge(6);

        System.out.println("Попугайдын аты: "+parrot.getName());
        System.out.println(parrot.getBreed());
        System.out.println(parrot.getColor());
        System.out.println("Попугайдын жашы: "+parrot.getAge());

    }

}
