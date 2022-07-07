package HomeWork;

public class Doc {
    private String name;
    private String breed;
    private int age;

    void setName(String name) {
        if (name.length() > 9) {
            System.out.println("Аты  9 тамгадан ашпашы керек!");
        } else
            this.name = name;
    }

    void setBreed(String breed) {
        if (breed.length() > 8) {
            System.out.println("Пародасы  8 тамгадан ашпашы керек!");
        } else {
            this.breed = breed;
        }
    }

    void setAge(int age) {
        if (age > 13) {
            System.out.println("Иттин жашы 13 тон ашпасын!");
        } else if (age <= 3) {
            System.out.println("Иттин жашы 3 тон жогору болсун");
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
