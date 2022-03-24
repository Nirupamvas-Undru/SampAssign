public class PasswordServiceEncryption
{
    private PasswordHasher passwordHasher;

    public PasswordServiceEncryption(PasswordHasher passwordHasher)
    {
        this.passwordHasher = passwordHasher;
    }

    void hashPassword(String password)
    {
        System.out.println(this.passwordHasher.hashPassword(password));
    }

}