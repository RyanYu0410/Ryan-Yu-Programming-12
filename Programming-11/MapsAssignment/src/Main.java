public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        Cipher cipher = new Cipher();
        cipher.encrypt(message.message);
    }
}
