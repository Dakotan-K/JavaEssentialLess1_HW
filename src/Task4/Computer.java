package Task4;

public class Computer {
    public static void main(String[] args) {

        String[] computer = new String[5];

        computer[0] = new String();
        computer[1] = new String();
        computer[2] = new String();
        computer[3] = new String();
        computer[4] = new String();

        for (int i = 0; i < 5; i++) {
            computer[i] = "IBM № " + i;
        }

        for (String list : computer) {
            System.out.println(list);
        }
    }
}
