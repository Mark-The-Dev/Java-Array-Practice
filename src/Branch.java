import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String cName, double iTrx){
        // returns true if customer was added successfully

        if(findCustomer(cName) == null){
            this.customers.add(new Customer(cName, iTrx));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String cName, double trx){

        if (findCustomer(cName) != null){
            findCustomer(cName).addTransaction(trx);
            return true;
        }

        return false;
    }

    public Customer findCustomer(String cName){
        // returns Customer if exists, else return null;
        for (int i=0; i< customers.size(); i++){
            Customer targetName = this.customers.get(i);
            if (targetName.getName() == cName){
                return targetName;
            }
        }
        return null;
    }
}
