public class Pattern2_3 {
    public static void main(String[] args) {

        Pattern2_3 MyPattern2 = new Pattern2_3();

        MyPattern2.pattern2();
        MyPattern2.pattern3();

    }
    public void pattern2()
    {
        int i,j;
        for(i=5;i>0;){

            for (j =i; j > 0; j--)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
            i--;}
    }

    public void pattern3()
    {
        int i,j;
        for(i=0;i<5;){

            for (j =0; j<=i; j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
            i++;}
    }

    public void pattern4()
    {
        int i,j;
        for(i=0;i>0;i++){
            System.out.printf("\b\b\b\b*");}
        System.out.println();

    }
}
