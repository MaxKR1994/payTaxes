public class Bill {
    public double square;
    public double price;
    public double revenue;
    public TaxType taxType;
    public TaxService taxService;



    public Bill(double square, TaxType taxType, TaxService taxService){
        this.square = square;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public Bill(double square, double revenue, TaxType taxType, TaxService taxService) {
        this.square = square;
        this.revenue = revenue;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public Bill(double square, double price, double revenue, TaxType taxType, TaxService taxService) {
        this.square = square;
        this.price = price;
        this.revenue = revenue;
        this.taxType = taxType;
        this.taxService = taxService;
    }



    public void payTaxes(){
        double taxAmount = taxType.calculateTax(square,price,revenue);
        taxService.payOut(taxAmount);
    }
}
