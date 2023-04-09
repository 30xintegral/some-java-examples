public class Main {
    public static void main(String[] args) {
        Customer me = new Customer("Elvin", "zirtpirt@hotmail.com",5000);
        System.out.println(me.getName());
        System.out.println(me.getEmail());
        System.out.println(me.getCrLimit());

        System.out.println(" ");

        Customer he = new Customer();
        System.out.println(he.getName());
        System.out.println(he.getEmail());
        System.out.println(he.getCrLimit());

        System.out.println(" ");

        Customer she = new Customer("Joe", "joe43@gmail.com");
        System.out.println(she.getName());
        System.out.println(she.getEmail());
        System.out.println(she.getCrLimit());

    }

}
