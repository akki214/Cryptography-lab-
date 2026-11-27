Aim:

Generate RSA public and private key pairs and perform secure file encryption and decryption using OpenSSL. 

Tools: OpenSSL 

THEORY 
RSA is an asymmetric cryptographic algorithm that uses two mathematically related keys: 

1. Public Key – Used for encryption.
2. Private Key – Used for decryption.

Anyone can encrypt data using the public key, but only the owner of the private key can decrypt it. 

Note: RSA is generally used to encrypt small a 

Procedure 

Step 1: Verify OpenSSL Installation 

Step 2: Generate RSA Private Key (2048-bit) 

Step 3: Generate Public Key 

Step 4: Create a Sample Text File 

Step 5: Encrypt the File Using the Public Key 

Step 6: Decrypt the File Using the Private Key 

Step 7: Verify the Decrypted File 

Files Generated 
1. private_key.pem RSA Private Key
3. public_key.pem RSA Public Key
4. message.txt Original Plaintext
5. encrypted.bin Encrypted File
6. decrypted.txt Decrypted Plaintext

Result

RSA public and private key pairs were successfully generated using OpenSSL. The plaintext file was encrypted using the RSA public key and successfully decrypted using the corresponding RSA private key, demonstrating the principles of asymmetric encryption 
