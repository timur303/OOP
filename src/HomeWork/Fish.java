package HomeWork;

public class Fish {
   private String name;
   private String breed;
   private int weight;
   private double length;

    void setName(String name) {
        if (name.length() > 9) {
            System.out.println(" 9 тамгандан ашпоо керек!");
        } else {
            this.name = name;
        }

    }

    void setBreed(String breed) {
        if (breed == "Микижа") {
            System.out.println("Балыктын породсаы Микижа");
        } else if (breed == "Густера") {
            System.out.println("Балыктын породсаы Густера");
        } else if (breed == "Гурами") {
            System.out.println("Балыктын породасы Гурами");

        } else if (breed == "Алтын") {
            System.out.println("Балыктын породасы Алтын");
        } else {
            this.breed = breed;
        }
    }

    void setWeight(int weight) {
        if (weight > 5) {
            System.out.println("Балык 5 кг чейин болушу керек!");

        } else {
            this.weight = weight;

        }

    }

    void setLength(double length) {

        if (length > 200) {
            System.out.println("Балык 200 см ге чейингана болушу керек");
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

