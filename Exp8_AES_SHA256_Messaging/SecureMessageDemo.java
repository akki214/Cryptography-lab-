import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;
public class SecureMessageDemo {
private static final int GCM_TAG_BITS = 128;
public static byte[] encrypt(String message, SecretKey key, byte[] iv)throws Exception {
Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
GCMParameterSpec spec =new GCMParameterSpec(GCM_TAG_BITS, iv);
cipher.init(Cipher.ENCRYPT_MODE, key, spec);
return cipher.doFinal(message.getBytes(StandardCharsets.UTF_8));
}
public static String decrypt(byte[] encrypted, SecretKey key, byte[] iv)throws Exception {
Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
GCMParameterSpec spec =new GCMParameterSpec(GCM_TAG_BITS, iv);
cipher.init(Cipher.DECRYPT_MODE, key, spec);
 byte[] decrypted = cipher.doFinal(encrypted);
 return new String(decrypted, StandardCharsets.UTF_8);
 }
 public static String sha256(String message)
 throws Exception {
 MessageDigest digest =MessageDigest.getInstance("SHA-256");
 byte[] hash = digest.digest(
 message.getBytes(StandardCharsets.UTF_8));
 StringBuilder hex = new StringBuilder();
 for (byte b : hash) {
 hex.append(String.format("%02x", b & 0xFF));
 }
 return hex.toString();
 }
 public static void main(String[] args) throws Exception {
 String originalMessage = "BTech Cyber Security Lab";
 String modifiedMessage = "BTech Cyber Security Labs";
 // Generate a 256-bit AES key
 KeyGenerator keyGenerator =KeyGenerator.getInstance("AES");
 keyGenerator.init(256);
 SecretKey secretKey = keyGenerator.generateKey();
 // Generate a random 12-byte IV
 byte[] iv = new byte[12];
 new SecureRandom().nextBytes(iv);
// Encrypt the original message
 byte[] encryptedData =encrypt(originalMessage, secretKey, iv);
 String ciphertext =Base64.getEncoder().encodeToString(encryptedData);
 // Decrypt the ciphertext
 String decryptedMessage =
 decrypt(encryptedData, secretKey, iv);
 // Calculate SHA-256 hashes
 String originalHash = sha256(originalMessage);
 String modifiedHash = sha256(modifiedMessage);
 System.out.println("Original Message: " + originalMessage);
 System.out.println("Encrypted Message: " + ciphertext);
 System.out.println("Decrypted Message: " + decryptedMessage);
 System.out.println("\nOriginal SHA-256: " + originalHash);
 System.out.println("Modified Message: " + modifiedMessage);
 System.out.println("Modified SHA-256: " + modifiedHash);
 System.out.println("\nMessage Integrity: "+ (originalHash.equals(modifiedHash)? "Verified" : "Modification Detected"));
 }
}
