// Exception errors are runtime erorr.

public class ExceptionError {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
        }

        catch (Exception e) {
            System.out.println(e + " " + "Sorry something went wrong");
        }

        System.out.println(j);
        System.out.println("thanks for checking");
    }
}