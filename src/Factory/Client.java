package Factory;

public class Client {

    public static void main(String[] args) {
        Encryptor encryptor = new Encryptor();
        String encryptorName = "Sha512";
        EncryptionAlgorithmn encryptionAlgorithmn = encryptor.getEncryptionAlgorithmn(encryptorName);
        encryptionAlgorithmn.encrypt();

    }
}


/*
 *
 * Here in the Factory design pattern,the factory is concrete. That means there is only one factory and it creates the relevant concrete products by itself.
 *
 * But in the Factory method design pattern, the factory is made abstract and concrete factories are implemented for each product.The client specifies the factory to be used.
 *
 *
 */
