public class PracticeProblem {

    public static int towerOfHanoi(int num) {
        if (num < 3) {
            return -1;
        }
        return calculateMoves(num);
    }

    private static int calculateMoves(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * calculateMoves(n - 1) + 1;
    }

    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3));
        System.out.println(towerOfHanoi(4));
        
    }
}
