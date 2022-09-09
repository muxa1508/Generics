import java.util.Random;

public class MagicBox {


    public String[] boxSlots;

    public MagicBox(int maxItems) {
        this.boxSlots = new String[maxItems];
    }

    public boolean add(String item) {
        for (int i = 0; i < boxSlots.length; i++) {
            if (boxSlots[i] == null) {
                boxSlots[i] = item;
                return true;
            }
        }
        return false;
    }

    public void pick() throws RuntimeException {
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
