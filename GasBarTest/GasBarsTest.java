public class GasBarsTest {

    public static void main(String[] args) {

        System.out.println(printGasBar());
    }

    public static String printGasBar() {

        StringBuilder buffer = new StringBuilder();

        int cycle = 45 / 5;
        int bars = (int) 21 / 5;
        buffer.insert(0,"~");

        for(int i = 1; i <= cycle; i++) {
            if(bars > 0) {
                buffer.insert(buffer.length(), "[]");
                bars--;
            }
            else {
                buffer.insert(buffer.length(), "-");
            }
        }

        buffer.insert(buffer.length(), "~");

        return buffer.toString();
    }
}
