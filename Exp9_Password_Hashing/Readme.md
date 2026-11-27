Aim: 

Implement password hashing with and without salting, and evaluate resistance against common password attacks using VS Code.

Tools: VS Code 

THEORY

4.1 Password Hashing 

Password hashing converts a password into a fixed-length hash value using a one-way mathematical function. A secure authentication system stores password hashes instead of storing passwords in plain text. 

For example, a password such as Hello123 can be converted into a SHA-256 hash. During authentication, the entered password is processed again and its hash is compared with the stored value. 

Hashing is different from encryption because hashing is designed to be one-way, whereas encryption is designed to be reversible using the appropriate key. 

4.2 Password Hashing Without Salting

In this method, the password is directly processed using a hashing algorithm.

Process: 

Password → SHA-256 → Hash value 

If two users choose the same password, the resulting hashes will also be identical when the same algorithm and encoding are used. 

Limitation: Attackers can identify identical passwords from identical hashes and use precomputed hash tables to crack common passwords more efficiently. 

4.3 Password Hashing With Salting 

A salt is a randomly generated value added to a password before hashing. The salt is stored alongside the resulting hash; it is not required to be secret. 

Process: 

Password + Random Salt → SHA-256 → Hash value 

Even if two users choose the same password, different randomly generated salts normally produce different hashes. 

Advantages: 

1. Makes precomputed rainbow-table attacks much less effective. 
2. Prevents identical passwords from automatically producing identical stored hashes 
3. when different salts are used. 
4. Requires attackers to compute guesses separately for each salt. 

Important security note: Salting alone does not make a weak password strong, and SHA-256 is not recommended as a standalone password-storage algorithm in production. Production systems should use a password-hashing algorithm such as Argon2id, scrypt, or bcrypt, with suitable cost parameters. 

Result 

The experiment successfully demonstrates password hashing with and without salting using Java. The output confirms that identical passwords generate identical unsalted hashes, while different random salts normally produce different hashes. This illustrates how salting reduces the effectiveness of rainbow-table attacks and helps protect stored password records. 
