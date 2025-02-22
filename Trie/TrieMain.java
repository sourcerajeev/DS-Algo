package Trie;

public class TrieMain {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("trie");
        trie.insert("tried");
        System.out.println(trie.search("app"));
        System.out.println(trie.search("orange"));
        System.out.println(trie.startsWith("trie"));
        System.out.println(trie.startsWith("fry"));
    }
}
