public class Pattern2_3 {
    public static void main(String[] args) {

        Pattern2_3 MyPattern2 = new Pattern2_3();

        //MyPattern2.pattern2();
        //MyPattern2.pattern3();
        MyPattern2.pattern4();

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
        int i,j=1;
        for(i=1;i>5-j;i++){
            System.out.println();}
        for(i=5,j=1;(j<5)&&(i>0);i--,j++){
        System.out.println("*");}

    }
}
