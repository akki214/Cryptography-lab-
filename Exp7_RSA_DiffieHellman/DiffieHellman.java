import java.math.BigInteger;
import java.util.Scanner;

public class DiffieHellman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger p = BigInteger.valueOf(23);
        BigInteger g = BigInteger.valueOf(5);

        System.out.println("Enter a prime number (p): " +p);
        System.out.println("Enter a primitive root (g): " +g);
        
        //Private keys for Alice and Bob
        System.out.println("Enter private key for Alice (a): ");
        BigInteger a = sc.nextBigInteger();

        System.out.println("Enter private key for Bob (b): ");
        BigInteger b = sc.nextBigInteger();

        // Calculate public keys
        BigInteger A = g.modPow(a, p);
        BigInteger B = g.modPow(b, p);

        System.out.println("\nPublic Key");
        System.out.println("Alice's public key: " + A);
        System.out.println("Bob's public key: " + B);

        // Calculate shared secret
        BigInteger SecretAlice = B.modPow(a, p);
        BigInteger SecretBob = A.modPow(b, p);

        System.out.println("\nShared Secret");
        System.out.println("Shared secret (Alice's perspective): " + SecretAlice);
        System.out.println("Shared secret (Bob's perspective): " + SecretBob);

        sc.close();
    }
}