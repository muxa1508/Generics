public class Main {
    public static void main(String[] args) {

        MagicBox box = new MagicBox(3);

        box.add("123");
//        box.add("456");
//        box.add("789");

        box.pick();


        System.out.println("Hello world!");
    }
}