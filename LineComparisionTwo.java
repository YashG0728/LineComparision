public class LineComparisionTwo {
    public static void main(String[] args) {
        int x1=3,x2=5,y1=2,y2=6;
        Double LengthOfFirstLine = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

        int x3=3,x4=5,y3=2,y4=6;
        Double LengthOfSecondLine = Math.sqrt((y4 - y3) * (y4 - y3) + (x4 - x3) * (x4 - x3));

        System.out.println(String.valueOf(LengthOfFirstLine));

        System.out.println(String.valueOf(LengthOfSecondLine));

        if (LengthOfFirstLine.equals(LengthOfSecondLine) ) {
            System.out.println("Lines Are Equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
    }
}
