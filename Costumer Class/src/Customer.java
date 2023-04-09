public class Customer {
    private String name;
    private double crLimit;
    private String email;


    public Customer(String name, String email, double crLimit) {
        this.name = name;
        this.email = email;
        this.crLimit = crLimit;

    }

    public Customer(String name, String email) {
        this(name, email, 1000);
    }

    public Customer() {
        this("Nobody", "nobody@hotmail.com", 0);
    }

    public String getName() {
        return name;
    }

    public double getCrLimit() {
        return crLimit;
    }

    public String getEmail() {
        return email;
    }


}