package HomeWork;

public class Doc {
    private String name;
    private String breed;
    private int age;

    void setName(String name) {
        if (name.length() > 9) {
            System.out.println("���  9 �������� ������ �����!");
        } else
            this.name = name;
    }

    void setBreed(String breed) {
        if (breed.length() > 8) {
            System.out.println("��������  8 �������� ������ �����!");
        } else {
            this.breed = breed;
        }
    }

    void setAge(int age) {
        if (age > 13) {
            System.out.println("����� ���� 13 ��� �������!");
        } else if (age <= 3) {
            System.out.println("����� ���� 3 ��� ������ ������");
        } else {

            this.age = age;
        }
    }


    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    int getAge() {
        return age;
    }
}
