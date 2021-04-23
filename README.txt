I created 10 classes and 2 interface page.
Which is BinaryDecryption, BinaryEncryption, Decrypter, Encrypter, General, Listener, Main,
ShiftDecription, ShiftEncryiption and Spy ; Decription and Encryiption.

The encrypt method of the Encription interface takes textand a ket to encrypt.
Listening for encrypted messages from the Encrypter class; 
takes an encrypted message and can decrypt the encrypted message, 
sent by the Encrypter object via the update method (listeners). 
Subclasses overrides this method.
List of references to encryption algorithms.And list of references to its listeners
I listed of references to its listeners,  there are two listener classes General and Spy.
'Listener' is calling this method passing the encryption algorithm, the key and referance to itself.
Sends the encrpyted message to all its listeners.
Opening the file then get the text.

General is a Listener which uses the Shift Encryption algorithm.
When a General type object registers itself with the Encryptor object, 
it transmits a reference to the ShiftEncryption Algorithm.
As like Spy decrypts the given encrypted text here

Spy is a listener which uses binary algorithms for decrypt/encrypt
Spy constructor creates new algorithm classes
Registers itself with the Encrypter object.
I defined Binary Decryption Binary Encryption.And add string; decrypts the given encrypted text.

Shifts every letter right in the plain text by the key in Shift Encryption.
The same key is using by the decryption algorithm. Decryption shift the encrypted message left.

For the binaryEncryption/Decryption; file message  is opening in binary mode.
Every byte Encrypted using key passed by applying bitwise XOR operation.
the register method called on the Encrypter object here.

The main class works all classes.Methods defined here.