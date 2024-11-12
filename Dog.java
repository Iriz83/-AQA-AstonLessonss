public class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " метров.");
    }

    public static int getDogCount() {
        return dogCount;
    }
}
