package prep.playground;

public class ExceptionsPractice {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            System.exit(0);
            return;
        }
        catch (Exception e){
            System.out.println("In Exception block");
        }
        finally {
            System.out.println("In finally block");
        }

    }
}
