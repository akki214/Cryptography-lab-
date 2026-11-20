import java.math.BigInteger;
import java.util.Scanner;

public class RSA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // step 1: select two  prime numbers
        BigInteger p = BigInteger.valueOf(61);
        BigInteger q = BigInteger.valueOf(53);
        // step 2: calculate n = p * q
        BigInteger n = p.multiply(q);
        // step 3: calculate phi(n) = (p-1)(q-1)
        BigInteger phi = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
        // step 4: select public exponent e
        BigInteger e = BigInteger.valueOf(17);
        // step 5: calculate private exponent d
        BigInteger d = e.modInverse(phi);

        System.out.println("== RSA Encryption and Decryption ==");
        System.out.println("p=" + p);
        System.out.println("q=" + q);
        System.out.println("n=" + n);
        System.out.println("phi(n)=" + phi);
        System.out.println("e=" + e);
        System.out.println("\nPublic Key: (" + e + ", " + n + ")");
        System.out.println("\nPrivate Key: (" + d + ", " + n + ")");

        System.out.print("\nEnter a numerical plain text(less than " + n + "): ");
        BigInteger message = scanner.nextBigInteger();
        // step 6: encrypt the message
        BigInteger ciphertext = message.modPow(e, n);
        // step 7: decrypt the message
        BigInteger decryptedMessage = ciphertext.modPow(d, n);

        System.out.println("RSA Encryption results:");
        System.out.println("\nOriginal Message: " + message);
        System.out.println("Ciphertext: " + ciphertext);
        System.out.println("Decrypted Message: " + decryptedMessage);
        scanner.close();
    }
}