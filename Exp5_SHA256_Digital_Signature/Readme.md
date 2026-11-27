Aim:

 Generate SHA-256 hash values, create digital signatures, and verify their authenticity using OpenSSL.

Tools: OpenSSL 

THEORY

SHA-256 is a cryptographic hash function that converts any input — a word, a sentence, or an entire file — into a fixed-length 256-bit (64 hex character) digest. Even changing one letter produces a completely different digest — this is what makes hashes ideal for detecting tampering. 

Procedure

1. Create a Sample File
2. Generate SHA-256 Hash
3. Generate RSA Private Key
4. Extract Public Key
5. Create Digital Signature
6. Verify Signature
7. Modify the File
8.  Verify Again

Result 

The SHA-256 hash was successfully generated. The digital signature was created using the RSA private key and verified successfully using the corresponding public key. After modifying the original file, signature verification failed — demonstrating that digital signatures ensure data integrity, authentication, and non-repudiation. 
