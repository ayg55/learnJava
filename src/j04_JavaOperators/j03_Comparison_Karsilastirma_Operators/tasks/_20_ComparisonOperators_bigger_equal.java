package j04_JavaOperators.j03_Comparison_Karsilastirma_Operators.tasks;

public class _20_ComparisonOperators_bigger_equal {

    public static void main(String[] args) {

        /*  İki tane float oluşturun. Birinci float 14, ikinci float 17'dir.
            Birinci float'un, ikinci float'dan büyük eşit olduğunu veya  büyük olduğunu yada olmadığını doğrulayın.
            Sonucu yazdırınız. */

        //Kodu aşağıya yazınız.

        float n1=14;
        float n2=17;

        boolean d1=(n1>=n2);
        boolean d2=(n1>n2);
        boolean d3=(n1<n2);

        System.out.println("n1>=n2 : "+d1+"\nn1>n2 : "+d2+"\nn1<n2 : "+d3);



    }
}
