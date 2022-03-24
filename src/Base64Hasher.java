public class Base64Hasher implements PasswordHasher, Decryptable, PrintByAdd10{
    @Override
    public String hashPassword(String password) {
        return "Hashed with Base64";
    }

    @Override
    public String decodePasswordFromHash(String hash) {
        return "Decoded from Base64";
    }

    @Override
    public void printAdd10ToDecode() {
        System.out.println("Printing the hashed with adding 10");
    }
}
