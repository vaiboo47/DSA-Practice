public class PatternChars {
    public static void main(String[] args) {
        p1(5);
        System.out.println("\n<--- NEXT PATTERN --->\n");
        p2(5);
        System.out.println("\n<--- NEXT PATTERN --->\n");
        p3(5);
    }
    static void p1(int n)
    {
        char c='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    static void p2(int n)
    {
        char c='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(c+j-1)+" ");
            }
            System.out.println();
        }
    }
    static void p3(int n)
    {
        char c='a';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(c+i-1)+" ");
            }
            System.out.println();
        }
    }
}