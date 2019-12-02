import java.util.Arrays;

public class ServerNameGenerator {
    public static void main(String[] args){
        String[] adjectives = {"blue", "green", "red", "great", "little", "big", "stupid", "pink", "weird", "stinky"};
        String[] nouns = {"walrus", "dog", "shoe", "cup", "computer", "hand", "ant", "spider", "phone", "robot"};
        System.out.println("Here is your server name: ");
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));
    }

    public static String getRandom(String[] array){
        double random = getRandom(0,9);
        return array[(int)random];
    }

    public static double getRandom(int min, int max){
        return (Math.random() * ((max - min) + 1) + min);
    }

}
