package FactoryMethod;

public class Sha512Encryptor extends Encryptor {
    @Override
    protected EncryptionAlgorithmn getEncryptionAlgorithmn() {
        return new Sha512EncryptionAlgorithmn();
    }
}
