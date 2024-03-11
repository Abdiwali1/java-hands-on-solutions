package testbase;

public class Data {

    public static boolean validString(String str){
        return !(str == null || str.isEmpty());
    }

    public static int setInt(String str, int other){
        return validString(str) ? Integer.parseInt(str) : other;
    }

}
