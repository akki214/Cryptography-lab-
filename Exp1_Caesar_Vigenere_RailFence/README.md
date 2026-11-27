Aim:

Implement Caesar, Vigenère, and Rail Fence ciphers to encrypt and decrypt plaintext, and compare their working and effectiveness. The given plain text is “HELLO WORLD”. 

Tools: CrypTool 

Theory: 

Caesar Cipher 

The Caesar Cipher is one of the oldest and simplest substitution ciphers. It works by shifting each letter of the plaintext by a fixed number of positions in the alphabet. For example, with a shift value of 3, A becomes D, B becomes E, and so on. During decryption, the letters are shifted back by the same number of positions to recover the original message. 

Vigenère Cipher 

The Vigenère Cipher is a polyalphabetic substitution cipher that uses a keyword to encrypt the plaintext. Unlike the Caesar Cipher, which uses a single shift value, the Vigenère Cipher uses different shift values determined by the letters of the keyword. This makes it more secure and resistant to simple frequency analysis attacks. In this cipher, each character of the plaintext is shifted according to the corresponding character in the repeating keyword. 

Procedure: 

Caesar 

1. Open CrypTool 2.
2. Create a New Workspace.
3. Search for Caesar in the Component Toolbox.
4. Drag the Caesar Cipher component.
5. Drag a Text Input component.
6. Connect Text Input to Caesar Cipher.
7. Set Shift Value = 3.
8. Add a Text Output component.
9. Connect Caesar Cipher output to Text Output.
10. Execute the workspace.

Decryption
12. Change mode to Decrypt.
13. Enter ciphertext.
14. Execute.

Vigenère 

1. Open new workspace.
2. Search Vigenère.
3. Drag Vigenère component.
4. Add Text Input.
5. Connect components.
6. Enter keyword. Keyword KEY
7. Add Text Output.
8. Execute.

Decryption 
1. Enter ciphertext.
2. Keyword
3. KEY

