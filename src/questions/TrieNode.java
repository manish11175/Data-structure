package questions;

public class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}
class Trie {
    TrieNode root = new TrieNode();
    void insert(String str) {
        TrieNode curr = root;
        for(int i=0;i<str.length();i++) {
            int c = str.charAt(i) - 97;
            if(curr.children[c] == null) {
                curr.children[c] = new TrieNode();
            }
            curr = curr.children[c];
        }
        curr.isEnd = true;
    }
    boolean search(String str) {
        TrieNode curr = root;
        for(int i=0;i<str.length();i++) {
            int c = str.charAt(i) - 97;
            if(curr.children[c] == null) {
                return false;
            }
            curr = curr.children[c];
        }
        return true;
    }
}
class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("abc");
        trie.insert("abcd");
        trie.insert("ab");
        System.out.println(trie.search("asds"));
    }
}