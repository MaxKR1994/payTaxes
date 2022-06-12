public class ResidentialProperty extends TaxType{
    @Override
    public double calculateTax(double square, double price, double revenue){
        double coefficient = price  >= 20000 ? 0.2 : 0.1;
        return price * coefficient;
    }
}
