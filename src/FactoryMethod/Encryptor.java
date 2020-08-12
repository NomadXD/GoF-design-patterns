package FactoryMethod;

public abstract class Encryptor {

    public void testMethod(){
        System.out.println("test");
    }

    protected abstract EncryptionAlgorithmn getEncryptionAlgorithmn();
}
