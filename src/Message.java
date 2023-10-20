import java.util.Scanner;

public class Message {
    public String consoleMessage(String message){
        System.out.println(message);
        Scanner read = new Scanner(System.in);
        return read.nextLine();
    }

    public void greeting(String name){
        System.out.println("Hello:" + name + ", welcome to this program test");
    }

}
