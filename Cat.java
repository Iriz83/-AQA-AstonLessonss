public class Cat extends Animal {
    private boolean isFull;
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        this.isFull = false;
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Food food, int foodAmount) {
        if (food.getQuantity() >= foodAmount) {
            food.decreaseQuantity(foodAmount);
            isFull = (foodAmount >= 10);
            System.out.println(name + " съел " + foodAmount + " ед. еды и теперь " + (isFull ? "сыт." : "еще голоден."));
        } else {
            System.out.println(name + " не смог поесть, так как в миске недостаточно еды.");
        }
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCatCount() {
        return catCount;
    }
}
