package solid.o;

public class Main {
    public static void main(String[] args) {
        TaxPayer taxPayer=new TaxPayer();
        taxPayer.setAccount("12344565");
        System.out.println(taxPayer.getAccount());
    }
}
