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
        System.out.println();
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
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    static void pattern4()
    {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    static void pattern5()
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern6()
    {
        int n=5,j=1;
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(j=j;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
