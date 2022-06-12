package LAB6;

public class ReplaceAll {
    public static void main(String[] args) {
        String str = "You are baD, Bad, bAD, dog, dog";
        String newStr = str.replaceAll("baD|Bad|bAD|dog","b*");
        String newStr2 = str.replaceAll("dog$","end");
        String newStr3 = str.replaceAll("\s","|");
        System.out.println(newStr);
        System.out.println(newStr2);
        System.out.println(newStr3);

    }
}
