public class IndustrialProperty extends TaxType{
    @Override
    public double calculateTax(double square, double price, double revenue){
        double coefficient = 0.2;
        return square* coefficient;
    }
}
