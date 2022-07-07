package HomeWork;

import java.util.Locale;

public class Cat {
    private String name;
    private String color;
    private int weight;
    private int age;

    void setName(String name) {
        if (name.length() > 10) {
            System.out.println("10 создон ашпоо керек!");
        } else {
            this.name = name;
        }
    }

    void setColor(String color) {

        switch (color) {
            case "Ак":
                System.out.println("Сиздин мышыгыныз ак тустуу");
                break;
            case "Кара":
                System.out.println("Сиздин мышыгыныз кара тустуу");
                break;
            case "Кок":
                System.out.println("Сиздин мышыгыныз кок тустуу");
                break;
            case "Кызыл":
                System.out.println("Сиздин мышыгыныз кызыл тустуу");
                break;
            case "Сары":
                System.out.println("Сиздин мышыгыныз сары тустуу");
                break;
            case "Жашыл":
                System.out.println("Сиздин мышыгыныз жашыл тустуу");
                break;
            case "Таргыл":
                System.out.println("Сиздин мышыгыныз таргыл тустуу");
            default:
                this.color = color;
                System.out.println("Сиз жети тустон башка тус бердиниз");

                break;
        }

    }

    void setWeight(int weight){
        if (weight>15) {
            System.out.println("Мышык 15 кг чейин болуусу шарт");
        }
            else if (weight<-0){
                System.out.println("Туура сан бериниз");
            } else {
        this.weight=weight;
    }}

    void setAge(int age){
        if (age>10){
            System.out.println("Мышык 10 жылга чейингана жашайт");
        }
        else if (age<-0){
            System.out.println("Туура сан бериниз");
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
