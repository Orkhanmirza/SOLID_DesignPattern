package solid.d;

public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    public void  getCustomer(){
        service.getCustomer();
    }

    //asılılıqları abstraction üzərindən qurmaq lazımdır.
}
