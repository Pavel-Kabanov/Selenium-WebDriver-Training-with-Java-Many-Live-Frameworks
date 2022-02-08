public class Misc {

    public static void main(String[] args) {
        System.out.println("Beggining");
        try {
            System.out.println("Start try block");
            int divide = 10/0;
            System.out.println("End try block");
        } catch (Throwable t) {
            System.out.println("Error: " + t.getLocalizedMessage());
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Ending");
    }
}
