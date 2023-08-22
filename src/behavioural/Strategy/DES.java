package behavioural.Strategy;

public class DES implements EncryptionAlgorithm{
    @Override
    public String encrypt(String massage) {
        System.out.println("Encrypting message using DES");
        return "encryptedText";
    }
}
