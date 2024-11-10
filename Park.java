public class Park {
    private Attraction[] attractions;
    private int count = 0;  // Счетчик добавленных аттракционов

    public Park(int size) {
        attractions = new Attraction[size];
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (count < attractions.length) {
            attractions[count] = new Attraction(name, workingHours, price);
            count++;
        } else {
            System.out.println("Невозможно добавить больше аттракционов.");
        }
    }

    public void displayAttractions() {
        System.out.println("Информация об аттракционах парка:");
        for (int i = 0; i < count; i++) {
            attractions[i].displayInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }
        public void displayInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println();
        }
    }
}
