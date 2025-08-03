public class PatternNumbers {
    public static void main(String[] args) {
        pattern1();
        System.out.println();
        pattern2();
        System.out.println();
        pattern3();
        System.out.println();
        pattern4();
        System.out.println();
        pattern5();
        System.out.println();
        pattern6();
    }
    static void pattern1()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern3()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j%2==0)
                System.out.print(0+" ");
                else
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
    static void pattern4()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j%2==0)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    static void pattern5()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
    static void pattern6()
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }
}
