package FactoryMethod;

public class Sha512EncryptionAlgorithmn implements EncryptionAlgorithmn {
    @Override
    public void encrypt() {
        System.out.println("Encrypted by Sha512");
    }
}
