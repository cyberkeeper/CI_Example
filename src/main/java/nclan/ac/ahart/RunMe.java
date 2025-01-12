package nclan.ac.ahart;

public class RunMe {
    public static void main(String[] args) {
        System.out.println("Two Simple Methods (TSM)");
        RunMe myApp = new RunMe();
        if (myApp.runStuff("Alan", 123))
            System.out.println("Everything ran!");
    }

    /**
     * Use this to call the other two methods.
     *
     * @param first  Test string data
     * @param second Test int data
     * @return True if everything worked, else false.
     */
    public boolean runStuff(String first, int second) {
        String name = makeName(first, "Hart");
        System.out.println(name);

        int result = calculateValue(second, 3);
        System.out.println(result);

        return true;
    }

    /**
     * Concatenate the first and surname together with a space separator.
     *
     * @param first   First name
     * @param surname Family name
     * @return Full name
     */
    public String makeName(String first, String surname) {
        return first + " " + surname;
    }

    /**
     * Add two numbers together then multiply result by 3.
     *
     * @param a first number
     * @param b second number
     * @return Result of the equation.
     */
    public int calculateValue(int a, int b) {
        return (a + b) * 3;
    }
}