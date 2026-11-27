Aim: 

Encrypt sample data using DES and AES algorithms, and compare their security features and performance. 

Tools CrypTool 

THEORY 

The Advanced Encryption Standard (AES) is a symmetric-key encryption algorithm standardized by NIST. It encrypts data in fixed-size blocks of 128 bits (16 bytes) and supports key sizes of 128, 192, and 256 bits. The same secret key is used for both encryption and decryption. 

Procedure 

AES Encryption 

Step 1: Create a New Project 

Step 2: Add the Following Components 
1. Text Input (Plaintext)
2. Text Input (Key)
3. String Decoder (2)
4. AES
5. String Encoder
6. Text Output 

Step 3: Enter the Plaintext In the first Text Input, type: 

Step 4: Enter the Secret Key In the second Text Input, type: 

Step 5: Configure the AES Component 
1. Cryptographic Algorithm AES
2. Action Encrypt
3. Key Size 128 bit
4. Chaining Mode Electronic Code Book (ECB)
5. Padding Mode Zeros 

Step 6: Configure the String Encoder Presentation Format Hex Input Data Encoding ASCII 

Step 7: Connect the Components 

Step 8: Execute 

AES Decryption 

Step 1: Create a New Project 

Step 2: Add the Following Components 
1. Text Input (Ciphertext)
2. Text Input (Key)
3. String Decoder (2)
4. AES
5. String Encoder
6. Text Output

Step 3: Enter the Ciphertext Copy the ciphertext obtained in Part A and paste it into the Text Input. 

Step 4: Configure the Ciphertext Input Set the Input Encoding of the ciphertext Text Input to Hexadecimal. 

Step 5: Enter the Secret Key 

Step 6: Configure the AES Component 
1. Cryptographic Algorithm
2. AES Action Decrypt
3. Key Size 128 bit
4. Chaining Mode Electronic Code Book (ECB)
5. Padding Mode Zeros 

Step 7: Configure the String Encoder Presentation Format Text Input Data Encoding ASCII 

Step 8: Connect the Components 

Step 9: Execute

Result

The plaintext was successfully encrypted using the AES-128 algorithm with the secret key in ECB mode. The generated ciphertext was then decrypted using the same secret key, successfully recovering the original plaintext, thereby verifying the correctness of the AES encryption and decryption process. 
