RSA and Diffie–Hellman Cryptography in Java
Aim

To implement RSA and Diffie–Hellman (DH) algorithms in Java using Visual Studio Code (VS Code) to demonstrate secure key exchange and public-key cryptography concepts.

 Overview
RSA (Rivest–Shamir–Adleman)

RSA is an asymmetric cryptographic algorithm that uses two different keys:

Public Key → Used for encryption
Private Key → Used for decryption

RSA security relies on the computational difficulty of factoring a large integer obtained by multiplying two prime numbers.

RSA Algorithm Steps

Select two prime numbers p and q.

Compute:

Plain Text
n = p × q

Calculate Euler's Totient Function:

Plain Text
φ(n) = (p − 1)(q − 1)

Choose a public exponent e such that:

Plain Text
gcd(e, φ(n)) = 1

Calculate the private exponent d:

Plain Text
d = e⁻¹ mod φ(n)

Generate keys:

Plain Text
Public Key = (e, n)
Private Key = (d, n)
RSA Encryption and Decryption

Encryption

Plain Text
C = M^e mod n

Decryption

Plain Text
M = C^d mod n

Where:

M = Plaintext
C = Ciphertext
Diffie–Hellman Key Exchange

Diffie–Hellman (DH) is a key exchange algorithm that enables two parties to securely establish a shared secret key over an insecure communication channel.

Unlike RSA, Diffie–Hellman does not directly encrypt messages. Instead, it allows both parties to independently generate the same secret key, which can later be used with symmetric encryption algorithms.

Diffie–Hellman Algorithm Steps
Alice and Bob agree on a public prime number p.
They agree on a public primitive root g.
Alice selects a private key a.
Bob selects a private key b.

Alice computes:

Plain Text
A = g^a mod p
 

Bob computes:

Plain Text
B = g^b mod p

Shared Secret Computation

Alice computes:

Plain Text
S = B^a mod p

Bob computes:

Plain Text
S = A^b mod p

Both obtain the same shared secret key:

Plain Text
B^a mod p = A^b mod p
 

The private keys a and b are never transmitted over the network, ensuring secure key exchange.

Technologies Used
Java
Visual Studio Code (VS Code)
Java Development Kit (JDK)
Learning Outcomes

Through this project, the following concepts were explored:

Public-key cryptography
Key generation and management
Secure encryption and decryption using RSA
Secure key exchange using Diffie–Hellman
Modular arithmetic and number theory in cryptography

Result
The RSA algorithm was successfully implemented in Java using Visual Studio Code to demonstrate public-key encryption and decryption. The Diffie–Hellman algorithm was successfully implemented to demonstrate how two parties can establish a common secret key without directly exchanging their private keys. 
