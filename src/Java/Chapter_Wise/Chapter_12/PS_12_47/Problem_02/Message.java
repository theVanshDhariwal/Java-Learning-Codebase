package Java.Chapter_Wise.Chapter_12.PS_12_47.Problem_02;

public class Message {

    public Message() {
        System.out.println("Hello this is Message class.");
    }

    public String returnString(String str) {
        return str;
    }

    public static void main(String[] args) {
        Message message = new Message();
    }
}
