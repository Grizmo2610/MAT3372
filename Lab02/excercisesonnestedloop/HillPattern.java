package excercisesonnestedloop;

public class HillPattern {
    public static void hillPatternA(int size) {
        int maxColumn = 2 * size - 1;
        for (int row = 1; row <= size; row++) {
            int start = (maxColumn - 2 * row + 1) / 2 + 1;
            int end = start + (2 * row - 1) - 1;
            for (int column = 1; column <= maxColumn; column++)
                if (column >= start && column <= end)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void hillPatternB(int size) {
        int maxColumn = 2 * size - 1;
        for (int row = 1; row <= size; row++) {
            int start = (maxColumn - 2 * (size + 1 - row) + 1) / 2 + 1;
            int end = start + (2 * (size + 1 - row) - 1) - 1;
            for (int column = 1; column <= maxColumn; column++)
                if (column >= start && column <= end)
                    System.out.print("# ");
                 else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void hillPatternC(int size) {
        int maxColumn = 2 * size - 1;
        for (int row = 1; row <= size; row++) {
            int start = (maxColumn - 2 * row + 1) / 2 + 1;
            int end = start + (2 * row - 1) - 1;
            for (int column = 1; column <= maxColumn; column++) {
                if (column >= start && column <= end) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++) {
            int start = (maxColumn - 2 * (size + 1 - row) + 1) / 2 + 1;
            int end = start + (2 * (size + 1 - row) - 1) - 1;
            for (int column = 1; column <= maxColumn; column++) {
                if (column >= start && column <= end) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hillPatternD(int size) {
        int maxColumn = 2 * size - 1;

        for (int row = 1; row <= size; row++) {
            int start = (maxColumn - 2 * (row - 1) + 1) / 2 + 1;
            int end = start + 2 * (row - 1) - 1 - 1;
            for (int column = 1; column <= maxColumn; column++) {
                if (column >= start && column <= end) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = 2; row <= size; row++) {
            int start = (maxColumn - 2 * (size + 1 - row - 1) + 1) / 2 + 1;
            int end = start + 2 * (size + 1 - row - 1) - 1 - 1;
            for (int column = 1; column <= maxColumn; column++) {
                if (column >= start && column <= end) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println("Hill Pattern A: ");
        hillPatternA(numRows);
        System.out.println();

        System.out.println("Hill Pattern B: ");
        hillPatternB(numRows);
        System.out.println();

        System.out.println("Hill Pattern C: ");
        hillPatternC(numRows);
        System.out.println();

        System.out.println("Hill Pattern D: ");
        hillPatternD(numRows);
        System.out.println();
    }

}
