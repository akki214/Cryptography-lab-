Aim:

Capture HTTPS network traffic using Wireshark and analyze the TLS handshake and cipher suites. 

Tools: Wireshark 

Theory: 

HTTPS (HyperText Transfer Protocol Secure) uses TLS (Transport Layer Security) to provide secure communication between a web browser and a web server. TLS ensures data confidentiality, integrity, and authentication by encrypting the information exchanged over the network. 

Before secure communication begins, the client and server perform a TLS Handshake. During this process, they negotiate the TLS version, exchange cryptographic information, and select a cipher suite for encryption. 

The handshake starts with a Client Hello message, which contains: 
1. Supported TLS versions
2. Random value
3. Supported cipher suites
4. Extensions
5. Server Name Indication (SNI)

The server responds with a Server Hello message containing: 
1. Selected TLS version
2. Server random value
3. Chosen cipher suite

A cipher suite is a set of cryptographic algorithms used for encryption and authentication during the TLS session. 

Wireshark is a network protocol analyzer that captures and displays network packets. By filtering TLS traffic, users can inspect Client Hello and Server Hello messages to analyze TLS versions, cipher suites, and other security parameters used in HTTPS communication. 

Thus, Wireshark helps in understanding how secure connections are established and how encryption is negotiated between a client and a server. 

Procedure 

Step 1: Start Wireshark
1. Open Wireshark.
2. Select the active network interface such as Wi-Fi or Ethernet.
3. Click Start Capturing Packets.

Step 2: Generate HTTPS Traffic Open a web browser and visit: https://www.google.com Browse the website for a few seconds. Return to Wireshark and stop the capture. 

Step 3: Display TLS Traffic Enter the following filter: tls Press Enter. You should now see TLS-related packets 

Step 4: Identify Client Hello Use: tls.handshake.type == 1 Click a packet and expand: Transport Layer Security Handshake Protocol: Client Hello 

Observe:  TLS Version  Random  Cipher Suites  Extensions  Server Name 

Step 5: Identify Server Hello Use: tls.handshake.type == 2 Select the Server Hello packet. Expand: Transport Layer Security Handshake Protocol: Server Hello Find: Cipher Suite Record the selected cipher suite. 

Input and Artifact Details 
1. Website: www.google.com
2. Port: TCP 443
3. TLS Version: TLS 1.3
4. Selected Cipher Suite: TLS_AES_128_GCM_SHA256
5. Cipher Suite Code: 0x1301
6. Key Share Group: X25519MLKEM768
7. Certificate Version: X.509 v3
8. Certificate Subject: CN=www.google.com
9. Certificate Issuer: Google Trust Services (WE2)
10. Public Key Algorithm: id-ecPublicKey
11. Named Curve: secp256r1
12. Signature Algorithm: ecdsa-with-SHA256

Result 

The HTTPS traffic was successfully captured using Wireshark. The TLS handshake and selected cipher suite were identified successfully 
