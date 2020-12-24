public class Pearson {
    private String name;

    public Pearson(String name) {
        this.name = name;
    }

    public class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.println("Pearson name: " + Pearson.this.name);
        }
    }
}