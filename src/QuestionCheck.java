public class QuestionCheck {
    public static void main(String[] args) {
        double a, b, c, d, sum, sumBC, comAB;
        a = -3.0 / 0;
        System.out.println("a = " + a);
        b =  3.0 / 0;
        System.out.println("b = " + b);
        c = 0 / 4.0;
        System.out.println("c = " + c);
        d = 0 / 0.0;
        System.out.println("d = " + d);
        sum = a + b + c + d;
        System.out.println("sum = " + sum);
        sumBC = b + c;
        System.out.println("sumBC = " + sumBC);
        comAB = a * b;
        System.out.println("comAB = " + comAB);
        System.out.print("Итого: " + sum + " " + sumBC + " " + comAB);

        // 2я задача
        System.out.println("\n");
        System.out.println("2я задача");
        double x = 0, y = 2, z;
        z = y / x;
        System.out.println ("z = " + z);

    }
}
