package solid.d;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomer() {
       return new Customer(1L,"aaa","aaa");
    }
}
