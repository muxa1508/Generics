import java.util.Random;

public class MagicBox<T> {


    protected T[] boxSlots;

    protected MagicBox(int maxItems) {
        this.boxSlots = (T[]) new Object[maxItems];
    }

    protected boolean add(T item) {
        for (int i = 0; i < boxSlots.length; i++) {
            if (boxSlots[i] == null) {
                boxSlots[i] = item;
                return true;
            }
        }
        return false;
    }

    protected void pick() throws RuntimeException {
        int a = 0;
        for (int i = 0; i < boxSlots.length; i++) {
            if (boxSlots[i] == null) {
                a++;
            }
        }

        if (a != 0) {
            throw new RuntimeException("Коробка не полна. Осталось заполнить ячеек: " + a);
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(boxSlots.length);
            System.out.println(boxSlots[randomInt]);
        }
    }
}
