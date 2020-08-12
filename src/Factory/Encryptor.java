package Factory;

public class Encryptor {

    public EncryptionAlgorithmn getEncryptionAlgorithmn(String algorithmnName){

        if(algorithmnName=="Sha256"){
            return new Sha256EncryptionAlgorithmn();
        }else if(algorithmnName=="Sha512") {
            return new Sha512EncryptionAlgorithmn();
        }else {
            return new Sha256EncryptionAlgorithmn();
        }
    }


}
