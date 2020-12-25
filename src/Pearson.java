
public class Pearson {
    private String name;
    Account account;

    public Pearson(String name,String password) {
        this.name = name;
        account = new Account(password);
    }

    public class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }



        public void displayAccount() {
            System.out.println("Pearson name: " + Pearson.this.name+password);
        }
    }
}

