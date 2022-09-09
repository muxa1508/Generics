public class Main {
    public static void main(String[] args) {

        MagicBox box = new MagicBox(4);

        box.add(123);
        box.add(456.789);
        box.add("Test 1");
//        box.add("Test 2");

        box.pick();

    }
}