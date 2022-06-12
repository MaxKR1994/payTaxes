public class CommercialProperty extends TaxType{
    @Override
    public double calculateTax(double square, double price, double revenue){
        double coefficient = revenue  > 100 ? 0.15 : 0;
        return revenue * coefficient;
    }
}
