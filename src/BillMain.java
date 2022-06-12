public class BillMain {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        TaxType taxType = new TaxType();
        Bill[] payments = new Bill[]{
            new Bill(200,20000,20,new ResidentialProperty(),taxService),
            new Bill(1000,new IndustrialProperty(),taxService),
            new Bill(100,110, new CommercialProperty(), taxService)
        };

        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
