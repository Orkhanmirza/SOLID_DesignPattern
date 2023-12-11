package solid.o;

public class TaxPayerAccount {

    private String account;

    public TaxPayerAccount(String account) {
        this.account = account;
    }

    public TaxPayerAccount() {
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "TaxPayerAccount{" +
                "account='" + account + '\'' +
                '}';
    }
}
