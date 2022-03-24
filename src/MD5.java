public class MD5 extends Hashed{
    public MD5(){
        this.passwordHasher = new MD5Hasher();
    }
}
