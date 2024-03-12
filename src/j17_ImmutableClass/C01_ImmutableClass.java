package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 = "Sema";
        String str2 = "Sema";
        String str3 = new String("Sema");
        String str4 = new String("Sema");
        String str5 = str3;

        System.out.println("(str1 == str2) = " + (str1 == str2));
        System.out.println("(str3 == str5) = " + (str3 == str5));
        System.out.println("(str2 == str3) = " + (str2 == str3));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));
    }
}
