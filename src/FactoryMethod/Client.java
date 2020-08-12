package FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Encryptor encryptor256 = new Sha256Encryptor();
        Encryptor encryptor512 = new Sha512Encryptor();
        EncryptionAlgorithmn encryptionAlgorithmn;
        encryptionAlgorithmn= encryptor256.getEncryptionAlgorithmn();
        encryptionAlgorithmn.encrypt();
        encryptionAlgorithmn=encryptor512.getEncryptionAlgorithmn();
        encryptionAlgorithmn.encrypt();

    }
}
