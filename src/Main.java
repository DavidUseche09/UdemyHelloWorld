public class Main {
    public static void main(String[] args) {
        Message ms1 = new Message();
        String name = ms1.consoleMessage("Write your name here: ");
        ms1.greeting(name);

    }
}