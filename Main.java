public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Джон Сноу", "Лорд",
                "wool@gmail.com", "89111234567",15000, 25);
        employee1.printInfo();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Дайнерис Таргариен", "Главная", "targ@gmail.com", "89517654321", 30000, 22);
        empArray[1] = new Employee("Дракарис Таргариен", "Дракон", "dra@gmail.com", "89117863421", 550000, 50);
        empArray[2] = new Employee("Грей Червь", "Воин", "gray@gmail.com", "89216785432", 400, 28);
        empArray[3] = new Employee("Король Ночи", "Пожарный", "kingn@gmail.com", "89114567831", 600000, 30);
        empArray[4] = new Employee("Арья Старк", "Ученик мастера", "nogirlname@gmail.com", "89512345178", 7500, 18);

        for (Employee employee : empArray) {
            employee.printInfo();

        }
        Park park = new Park(3);
        park.addAttraction("Ракета", "10:00 - 19:00", 400);
        park.addAttraction("Колесо обозрения", "09:00 - 17:00", 300);
        park.addAttraction("Королевство кривых зеркал", "11:00 - 22:00", 500);

        park.displayAttractions();
    }


}

