public class Food {
    private int quantity;

    public Food(int quantity) {
        this.quantity = (quantity < 0) ? 0 : quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Добавлено " + amount + " ед. еды. Всего еды: " + quantity);
        }
    }

    public void decreaseQuantity(int amount) {
        if (amount > 0 && quantity >= amount) {
            quantity -= amount;
            System.out.println("Уменьшено на " + amount + " ед. еды. Осталось еды: " + quantity);
        } else {
            System.out.println("Недостаточно еды для уменьшения на " + amount + " ед.");
        }
    }
}

