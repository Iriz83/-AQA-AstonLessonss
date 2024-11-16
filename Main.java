public class Main {
    public static void main(String[] args) {
        // Пример массива (в массиве будет ошибка в последней строке)
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "X"} // тут ошибка
        };

        try {

            int result = ArrayProcessor.processArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {

            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {

            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }
}


