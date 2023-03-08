package controlFlowStatements;

public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        if ((numberOne >= 10 && numberOne <= 99)
                && (numberTwo >= 10 && numberTwo <= 99)) {

            int numberOneLastDigit = numberOne % 10;
            int numberTwoLastDigit = numberTwo % 10;
            int numberOneFirstDigit = numberOne / 10;
            int numberTwoFirstDigit = numberTwo / 10;

            return ((numberOneFirstDigit == numberTwoFirstDigit) ||
                    (numberOneFirstDigit == numberTwoLastDigit)  ||
                    (numberOneLastDigit == numberTwoFirstDigit)  ||
                    (numberOneLastDigit == numberTwoLastDigit));
        }
        return false;
    }
}
