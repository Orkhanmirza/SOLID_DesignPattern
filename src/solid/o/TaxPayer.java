package solid.o;

public class TaxPayer extends TaxPayerAccount {

    private String name;
    private String surname;
    private String age;

    public TaxPayer(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public TaxPayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TaxPayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
