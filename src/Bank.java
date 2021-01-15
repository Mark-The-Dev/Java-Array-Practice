import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String name){
        // returns true if branch added
        if (findBranch(name) == null){
            branches.add( new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String bName, String cName, double initialT){
        // returns true if customer was added correctly
        if (findBranch(bName) != null){
            if(findBranch(bName).newCustomer(cName , initialT)){
                findBranch(bName).newCustomer(cName , initialT);
                return true;
            }
        }
        return false;
    }
    public boolean addCustomerTransaction(String bName, String cName, double initialT){
        // return true if customers transaction was added successfully.
        if (findBranch(bName) != null){
            findBranch(bName).addCustomerTransaction(cName,initialT);

        }
        return false;
    }
    private Branch findBranch(String bName){
        // returns Branch or null.
        for (int i=0; i < branches.size(); i++){
            Branch branch = this.branches.get(i);
            if (branch.getName() == bName){
                return branch;
            }

        }
        return null;
    }
    
    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        Branch tempBranch = findBranch(nameOfBranch);
        if(tempBranch != null && printTransactions) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for(int i=0; i<tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
                System.out.println("Transactions");
                for(int j=0; j<tempBranch.getCustomers().get(i).getTransactions().size(); j++) {
                    System.out.println("[" + (j+1) + "]  Amount " + tempBranch.getCustomers().get(i).getTransactions().get(j));
                }
            }
            return true;
        } else if(tempBranch != null) {
            System.out.println("Customer details for branch " + tempBranch.getName());
            for(int i=0; i<tempBranch.getCustomers().size(); i++) {
                System.out.println("Customer: " + tempBranch.getCustomers().get(i).getName() + "[" + (i+1) + "]");
            }
            return true;
        } else {
            return false;
        }
    }

}
