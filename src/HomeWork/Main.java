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
        cat.setName("���");
        cat.setColor("����");
        cat.setWeight(11);
        cat.setAge(1);

        System.out.println("������������ ����: " +cat.getAge());
        System.out.println("������������ �������: "+cat.getWeight());
        System.out.println(cat.getColor());
        System.out.println(" ������������ ���: "+cat.getName());
        System.out.println("_______________________________");

        //class Fish
        Fish fish = new Fish();
        fish.setName("����� �����");
        fish.setBreed("������");
        fish.setWeight(4);
        fish.setLength(5.5);

        System.out.println(fish.getName());
        System.out.println(fish.getBreed());
        System.out.println("�������� ������� "+fish.getWeight());
        System.out.println("�������� �������� "+fish.getLength());

        System.out.println("______________________________");

        //class Parrot

        Parrot parrot = new Parrot();
        parrot.setName("�����");
        parrot.setBreed("������");
        parrot.setColor("�����");
        parrot.setAge(6);

        System.out.println("���������� ���: "+parrot.getName());
        System.out.println(parrot.getBreed());
        System.out.println(parrot.getColor());
        System.out.println("���������� ����: "+parrot.getAge());

    }

}
