package m04_unary_shorthand_operators;

public class PreVsPostQuiz {
    public static void main(String[] args) {
        //Consider this code, What value is printed, what value is v left with?
        int v = 20;
        --v;
        System.out.println(v++);
        System.out.println("v = " + v);

        //What are the values of s and t?
        int s = 20;
        int t = s++ + --s;
        System.out.println("s = " + s);
        System.out.println("t = " + t);
    }
}
