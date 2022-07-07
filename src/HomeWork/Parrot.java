package HomeWork;

public class Parrot {
    private String name;
    private String color;
    private String breed;
    private int age;

    void setName(String name) {
        if (name.length() > 12) {
            System.out.println("Попугайдын аты 12 тамгадан ашпашы керек!");
        } else {
            this.name = name;
        }
    }

    void setColor(String color) {
        if (color == "Кызыл") {
            System.out.println("Попугайдын тусу кызыл ");
        } else if (color == "Кок") {
            System.out.println("Попугайдын тусу кок");
        } else if (color == "Кара") {
            System.out.println("Попугайдын тусу кара");

        } else if (color == "Жашыл") {
            System.out.println("Попугайдын тусу жашыл");
        } else {
            System.out.println("Мындай тусттуу попугай бизде жок");
            this.color = color;
        }
    }

    void setBreed(String breed) {
        if (breed == "Жако") {
            System.out.println("Попугайдын породсаы Жако");
        } else if (breed == "Амазон") {
            System.out.println("Попугайдын породсаы Амазон");
        } else if (breed == "Ара") {
            System.out.println("Попугайдын породасы Ара");

        } else if (breed == "Какаду") {
            System.out.println("Попугайдын породасы Какаду");
        } else {
            System.out.println("Мындай порода бизде жок");
            this.breed = breed;
        }
    }

    void setAge(int age) {
        if (age > 13) {
            System.out.println("Попугайдын жашы 13 тон ашпасын!");
        } else if (age <= 3) {
            System.out.println("Попугайдын жашы 3 тон жогору болсун");
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
