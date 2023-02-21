public class FirstClass {
    public static int quarterOf(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException ("Invalid month value" + month);
        }
        return (month - 1)/3 + 1;
    }
}
