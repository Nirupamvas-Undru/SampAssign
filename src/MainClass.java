public class MainClass {
    public static void main(String[] args) {
        //PasswordHasher passwordHasher = new Base64Hasher();
        //PasswordService passwordService = new PasswordService(passwordHasher);
        //passwordService.hashPassword("abcdde");


        //Hashing
        PasswordHasher passwordHasher = new MD5Hasher();
        PasswordServiceEncryption passwordService = new PasswordServiceEncryption(passwordHasher);
        passwordService.hashPassword("Nirupamvas");


        //Decryption
        Decryptable decryptable = new Base64Hasher();
        PasswordServiceDecryption passwordService1 = new PasswordServiceDecryption(decryptable);
        passwordService1.decodePasswordFromHash("Nirupamvas");

        //Save passwords
        PasswordSaver passwordSaver = new PasswordSaver();
        passwordSaver.savePassword();


/*        Hashed base64 = new Base64();
        base64.generateHash("abc");
        System.out.println(base64.hash);

        Hashed md5 = new MD5();
        md5.generateHash("Nirupamvas");
        System.out.println(md5.hash);*/
    }
}
