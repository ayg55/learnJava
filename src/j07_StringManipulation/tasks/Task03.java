package j07_StringManipulation.tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini print eden code create ediniz


        String str = "Alamanya";
        int firstIndex = str.indexOf("a");
        int secondIndex = str.indexOf("a" , firstIndex +1);
        if (secondIndex != -1) {
            System.out.println(secondIndex);
        } else System.out.println("Ikinci bir a karakteri yoktur");


    }
}
