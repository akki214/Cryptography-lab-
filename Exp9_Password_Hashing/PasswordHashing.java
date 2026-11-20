import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
public class PasswordHashing {
 // Generate SHA-256 hash
 public static String hashPassword(String password,byte[] salt)throws Exception {
 MessageDigest md = MessageDigest.getInstance("SHA-256");
 if (salt != null) {
 md.update(salt);
 }
 byte[] hash = md.digest(
 password.getBytes(StandardCharsets.UTF_8));
 return toHex(hash);
 }
 // Generate a random salt
 public static byte[] generateSalt() {
 byte[] salt = new byte[16];
 SecureRandom random = new SecureRandom();
 random.nextBytes(salt);
 return salt;
 }
 // Convert byte array to hexadecimal string
 public static String toHex(byte[] data) {
 StringBuilder result = new StringBuilder();
 for (byte b : data) {
 result.append(String.format("%02x", b & 0xFF));
 }
 return result.toString();
 }
 public static void main(String[] args)throws Exception {
 String password = "Hello123";
 // Hash without salting
 String hash1 = hashPassword(password, null);
 String hash2 = hashPassword(password, null);
 System.out.println("PASSWORD HASHING DEMO");
 System.out.println("---------------------");
 System.out.println("\nWithout Salting:");
 System.out.println("Hash 1: " + hash1);
 System.out.println("Hash 2: " + hash2);
 System.out.println("Hashes are equal: "+ hash1.equals(hash2));
 // Hash with diƯerent random salts
 byte[] salt1 = generateSalt();
 byte[] salt2 = generateSalt();
 String saltedHash1 = hashPassword(password, salt1);
 String saltedHash2 = hashPassword(password, salt2);
 System.out.println("\nWith Salting:");
 System.out.println("Salt 1: " + toHex(salt1));
 System.out.println("Hash 1: " + saltedHash1);
 System.out.println("Salt 2: " + toHex(salt2));
 System.out.println("Hash 2: " + saltedHash2);
 System.out.println("Hashes are equal: "
 + saltedHash1.equals(saltedHash2));
 System.out.println("\nSECURITY COMPARISON");
 System.out.println("-------------------");
 System.out.println("Without salt: Same password produces same hash.");
 System.out.println("With salt: Same password normally produces diƯerent hashes.");
 }
}
