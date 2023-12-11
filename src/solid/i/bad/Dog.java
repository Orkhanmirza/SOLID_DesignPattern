package solid.i.bad;

public class Dog implements Animal{
    @Override
    public void bark() {
        System.out.println("The dog was barking");
    }

    @Override
    public void run() {
        System.out.println("The dog was running");
    }

    //fly burda bizə lazım deyil və onu məcburi override etmək məcburiyyətindəyik
    //ona görə bu methodları bir interface içərisində yazmaq lazım deyil.

    @Override
    public void fly() {

    }
}
