public class Numbers0to99 {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            if (i != 99) {
                System.out.printf(i + ", ");
            }
            else {
                System.out.printf(i + "" + '\n');
            }
        }
    }
}
