package HomeWork;

import java.util.Locale;

public class Cat {
    private String name;
    private String color;
    private int weight;
    private int age;

    void setName(String name) {
        if (name.length() > 10) {
            System.out.println("10 ������ ����� �����!");
        } else {
            this.name = name;
        }
    }

    void setColor(String color) {

        switch (color) {
            case "��":
                System.out.println("������ ��������� �� ������");
                break;
            case "����":
                System.out.println("������ ��������� ���� ������");
                break;
            case "���":
                System.out.println("������ ��������� ��� ������");
                break;
            case "�����":
                System.out.println("������ ��������� ����� ������");
                break;
            case "����":
                System.out.println("������ ��������� ���� ������");
                break;
            case "�����":
                System.out.println("������ ��������� ����� ������");
                break;
            case "������":
                System.out.println("������ ��������� ������ ������");
            default:
                this.color = color;
                System.out.println("��� ���� ������ ����� ��� ��������");

                break;
        }

    }

    void setWeight(int weight){
        if (weight>15) {
            System.out.println("����� 15 �� ����� ������� ����");
        }
            else if (weight<-0){
                System.out.println("����� ��� �������");
            } else {
        this.weight=weight;
    }}

    void setAge(int age){
        if (age>10){
            System.out.println("����� 10 ����� ��������� ������");
        }
        else if (age<-0){
            System.out.println("����� ��� �������");
        } else {
        this.age=age;
    }}
    int getAge(){
        return age;
    }

int getWeight(){
        return weight;
}
    String getColor() {
        return color;
    }

    String getName() {
        return name;
    }
}
