public class PatternStars {
    public static void main(String[] args) {
        p1(7);
        System.out.println("\n<--- Next Pattern --->\n");
        p2(5);
        System.out.println("\n<--- Next Pattern --->\n");
        p3(5);
        System.out.println("\n<--- Next Pattern --->\n");
        p4(5);
        System.out.println("\n<--- Next Pattern --->\n");
        p5(5);
    }

    static void p1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j + i == n + 1 || i == j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void p5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
