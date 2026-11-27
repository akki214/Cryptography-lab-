Aim: 

Perform frequency analysis on classical cipher texts and analyze their vulnerability to cryptanalysis attacks using CrypTool. 

Tools: CrypTool 

THEORY 

Frequency analysis is one of the oldest cryptanalysis techniques. It is based on the fact that certain letters occur more frequently in English text than others. 

Typical English letter frequencies: 

Letter Frequency (%) 

E 12.7 

T 9.1 

A 8.2 

O 7.5 

I 7.0 

N 6.7 

In a Caesar Cipher, Monoalphabetic Substitution Cipher, or Affine Cipher, the frequency distribution remains almost unchanged, making them vulnerable to frequency analysis. However, ciphers such as the Vigenère Cipher distribute letter frequencies over multiple alphabets, making simple frequency analysis much less effective 

Procedure

Step 1: Launch CryptTool 2 
1. Open CryptTool 2.
2. Create a New Workspace.

Step 2: Enter Plaintext Example plaintext: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. 

Step 3: Encrypt Using Caesar Cipher 
1. Drag the Caesar Cipher component.
2. Connect the plaintext input.
3. Set Shift = 7.
4. Execute the workspace.

Example Ciphertext: AOL XBPJR IYVDU MVE QBTWZ VCLY AOL SHGF KVN. 

Step 4: Perform Frequency Analysis 
1. Drag the Frequency Analysis component.
2. Connect the ciphertext output.
3. Execute the workspace.
4. Observe: Letter histogram Letter frequency table Most frequent characters

