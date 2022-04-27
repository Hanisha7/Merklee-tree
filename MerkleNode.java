public class Node {

    private Node left;
    private Node right;
    private String hash;

    public Node(Node left, Node right, String hash) {
        this.left = left;
        this.right = right;
        this.hash = hash;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}

HashAlgorithm.java

import org.bouncycastle.jcajce.provider.digest.Keccak;

import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;

public class HashAlgorithm {

 public static String generateHash(String originalString) {


       Keccak.Digest256 digest256 = new Keccak.Digest256();


       byte[] hashedByteArray = digest256.digest(


               originalString.getBytes(StandardCharsets.UTF_8));


       return new String(Hex.encode(hashedByteArray));


   }



}

