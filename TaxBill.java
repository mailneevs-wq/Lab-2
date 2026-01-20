package labs.lab2;

public class TaxBill {
    private boolean married;
    private double income;

    public TaxBill(boolean married, double income) {
        this.married = married;
        this.income = income;
    }

    public double getAmountDue() {
        if (!married) {
            if (income <= 8000) return income * 0.10;
            if (income <= 32000) return 800 + (income - 8000) * 0.15;
            return 4400 + (income - 32000) * 0.25;
        } else {
            if (income <= 16000) return income * 0.10;
            if (income <= 64000) return 1600 + (income - 16000) * 0.15;
            return 8800 + (income - 64000) * 0.25;
        }
    }
}
