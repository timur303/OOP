package HomeWork;

public class Parrot {
    private String name;
    private String color;
    private String breed;
    private int age;

    void setName(String name) {
        if (name.length() > 12) {
            System.out.println("���������� ��� 12 �������� ������ �����!");
        } else {
            this.name = name;
        }
    }

    void setColor(String color) {
        if (color == "�����") {
            System.out.println("���������� ���� ����� ");
        } else if (color == "���") {
            System.out.println("���������� ���� ���");
        } else if (color == "����") {
            System.out.println("���������� ���� ����");

        } else if (color == "�����") {
            System.out.println("���������� ���� �����");
        } else {
            System.out.println("������ ������� ������� ����� ���");
            this.color = color;
        }
    }

    void setBreed(String breed) {
        if (breed == "����") {
            System.out.println("���������� �������� ����");
        } else if (breed == "������") {
            System.out.println("���������� �������� ������");
        } else if (breed == "���") {
            System.out.println("���������� �������� ���");

        } else if (breed == "������") {
            System.out.println("���������� �������� ������");
        } else {
            System.out.println("������ ������ ����� ���");
            this.breed = breed;
        }
    }

    void setAge(int age) {
        if (age > 13) {
            System.out.println("���������� ���� 13 ��� �������!");
        } else if (age <= 3) {
            System.out.println("���������� ���� 3 ��� ������ ������");
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

    String getColor() {
        return color;
    }

    int getAge() {
        return age;
    }
}
