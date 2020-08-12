package FactoryMethod;

public class Sha256Encryptor extends Encryptor {
    @Override
    protected EncryptionAlgorithmn getEncryptionAlgorithmn() {
        return new Sha256EncryptionAlgorithmn();
    }
}
