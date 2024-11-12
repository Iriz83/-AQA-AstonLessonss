public class Main {
    public static void main(String[] args) {
        Food bowl = new Food(15);
        Cat[] cats = {
                new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Снежок"),
                new Cat("Васька")
        };

        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Бим");

        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Каждый кот пробует съесть 10 единиц еды
        }

        System.out.println("Пополняем миску...");
        bowl.addQuantity(20);

        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        for (Cat cat : cats) {
            System.out.println(cat.getName() + (cat.isFull() ? " сыт." : " голоден."));
        }

        System.out.println("\nДемонстрация бега и плавания:");
        for (Cat cat : cats) {
            cat.run(100);
            cat.swim(20);
        }

        dog1.run(150);
        dog1.swim(50);

        dog2.run(200);
        dog2.swim(30);

        System.out.println("\nСтатистика:");
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего животных: " + Animal.getAnimalCount() + "\n");
        System.out.println("Задание 2:");

        Circle circle = new Circle(5);
        circle.setFillColor("Красный");
        circle.setBorderColor("Черный");
        circle.setType("Круг");

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.setFillColor("Синий");
        rectangle.setBorderColor("Зеленый");
        rectangle.setType("Прямоугольник");

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Желтый");
        triangle.setBorderColor("Фиолетовый");
        triangle.setType("Треугольник");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);

    }
    public static void printShapeInfo(Shape shape) {
        System.out.println("Фигура: " + shape.getType());
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println();
    }
}

