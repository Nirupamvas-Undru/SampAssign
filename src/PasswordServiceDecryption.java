public class PasswordServiceDecryption{

    private Decryptable decryptable;

    public PasswordServiceDecryption(Decryptable decryptable) {
        this.decryptable = decryptable;
    }

    void decodePasswordFromHash(String hash) {
        System.out.println(this.decryptable.decodePasswordFromHash(hash));
    }
}
