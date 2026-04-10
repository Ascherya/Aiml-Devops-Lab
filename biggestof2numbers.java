public class biggestof2numbers {
    public static void main(String[] args) {
        int a = 15;   // default value
        int b = 25;   // default value

        if (a > b) {
            System.out.println("Biggest number is: " + a);
        } else if (b > a) {
            System.out.println("Biggest number is: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
