package solid.s.bad;

public class Book {

    private String id;
    private String name;

/* burda pozulub bir classın içərisində başqa domain-ə bağlı heç nə saxlamalı deyilik.
Bu class-ın içərisində get\set method konstruktor toString bunlar ola bilər
 */
    public void printBook(){
        System.out.println("The book was published.");
    }

    public void sellBook(){
        System.out.println("The book was sold.");
    }
}
