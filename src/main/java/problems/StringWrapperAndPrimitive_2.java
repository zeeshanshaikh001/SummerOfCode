package problems;

public class StringWrapperAndPrimitive_2 {
    public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = s1;
        String s4 = new String("Sachin");
        String s5 = new String("Sachin");
        Character c1 = new Character('a');
        Character c2 = new Character('a');
        System.out.println("s1==s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1==s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));
        System.out.println("s4==s3 : " + (s4 == s3));
        System.out.println("s4.equals(s3) : " + s4.equals(s3));
        System.out.println("s4==s5 : " + (s4 == s5));
        System.out.println("s5.equals(s4) : " + s5.equals(s4));
        System.out.println("c1==c2 : " + (c1 == c2));
        System.out.println("c1.equals(c2) : " + c1.equals(c2));
    }
}
