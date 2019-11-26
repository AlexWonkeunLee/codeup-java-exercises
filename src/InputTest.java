import util.Input;

public class InputTest {
    public static void main(String[] args) {
        System.out.println(Input.getString());
        System.out.println(Input.yesNo());
        System.out.println(Input.getInt(1,10));
        System.out.println(Input.getInt());
        System.out.println(Input.getDouble(.5, 9.5));
        System.out.println(Input.getDouble());

        System.out.println(Input.getString("blue"));
        System.out.println(Input.yesNo("no"));
        System.out.println(Input.getInt(1,10, "0"));
        System.out.println(Input.getInt("44"));
        System.out.println(Input.getDouble(.5, 9.5, "2.6"));
        System.out.println(Input.getDouble("4.4"));
    }
}
