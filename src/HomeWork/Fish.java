package HomeWork;

public class Fish {
   private String name;
   private String breed;
   private int weight;
   private double length;

    void setName(String name) {
        if (name.length() > 9) {
            System.out.println(" 9 ��������� ����� �����!");
        } else {
            this.name = name;
        }

    }

    void setBreed(String breed) {
        if (breed == "������") {
            System.out.println("�������� �������� ������");
        } else if (breed == "�������") {
            System.out.println("�������� �������� �������");
        } else if (breed == "������") {
            System.out.println("�������� �������� ������");

        } else if (breed == "�����") {
            System.out.println("�������� �������� �����");
        } else {
            this.breed = breed;
        }
    }

    void setWeight(int weight) {
        if (weight > 5) {
            System.out.println("����� 5 �� ����� ������ �����!");

        } else {
            this.weight = weight;

        }

    }

    void setLength(double length) {

        if (length > 200) {
            System.out.println("����� 200 �� �� ��������� ������ �����");
        } else {
            this.length = length;
        }
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    int getWeight() {
        return weight;

    }

    double getLength() {
        return length;
    }
}

