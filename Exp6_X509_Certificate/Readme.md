Aim: 

Create a self-signed X.509 digital certificate and analyze its attributes, validity, and security features. 

Tools: OpenSSL

Procedure

Step 1: Generate a private key 

Step 2: Create a self-signed certificate 

Step 3: Inspect the certificate 

Observe: 

Subject
Issuer 
Serial Number
Validity Period 
Public Key 
Signature Algorithm 

Step 4: Check Subject and Issuer openssl x509 -in certificate.crt -noout -subject -issuer For a self-signed certificate, the Subject and Issuer will be the same.  

Result

A self-signed X.509 digital certificate was successfully created and its important attributes were inspected using OpenSSL.  
