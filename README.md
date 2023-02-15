# Merklee-tree
Config files for my GitHub profile.

Introduction to Merkle Tree : 

Merkle tree is a tree data structure with leaf nodes and non-leaf nodes. It also known as Hash tree. The reason behind it is it only stores the hashes in its nodes instead of data. In its leaf nodes, it will store the hash of the data. Non leaf nodes contain the hash of its children. Ralph C. Merkle (born February 2, 1952) is a computer scientist. He is one of the inventors of public key cryptography, the inventor of hashing. He is also the inventor of MERKEL tree.
Merkle tree (Hash tree) is used to verify any kind of data stored, handled and transferred in and between computers.
Currently, the main use of Merkle tree is to make sure that data blocks received from other peers in a peer-to-peer network are received undamaged and unaltered, and even to check that the other peers do not lie and send fake blocks.
Merkle tree is used in git, Amazon's Dynamo, Cassandra as well as BitCoin.
Merkle Tree is one of the core data structures which is used in the BitCoin blockchain to verify the existence of a transaction in a way that conserves both space and time quite effectively 
Merkle trees produce an overall digital fingerprint of the entire set of transactions, providing a very efficient process to verify whether a transaction is included in a block.
The important thing is to check to contain specific transaction in a block. In order to that, use Merkle root.
Each block in the BitCoin blockchain contains a summary of all the transactions in the block, using a Merkle tree.
Mathematically, it can be expressed as


 ![image](https://user-images.githubusercontent.com/104450923/165565734-a1ba767f-cf05-4066-b75e-922ae743584c.png)
 
 

Architecture of Merkle Tree :

![image](https://user-images.githubusercontent.com/104450923/165587310-de1785c8-eda6-4c9c-8976-911b9e812767.png)

Merkle Tree Implementation in Java :
 

In this example implementation, We are going to implement a binary merkle tree. As the first step, let's define the node. Like a regular tree, it has a  data field to store the hash and left and right pointers to point to the left  child and right child of the binary tree. 
