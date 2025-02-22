package Trie;

public class Trie {
    Trie trieNodes[] = new Trie[26];
    boolean isEndOfWord;

    public Trie() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            trieNodes[i] = null;
        }
    }

    public boolean containsKey (char ch) {
        return trieNodes[ch - 'a'] != null;
    }

    public void insert(String word) {
        Trie node = this;
        for (int i = 0; i<word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.trieNodes[word.charAt(i) - 'a'] = new Trie();
            }
            node = node.trieNodes[word.charAt(i) - 'a'];
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for (int i = 0; i<word.length(); i++) {
            if (node.containsKey(word.charAt(i))) {
                node = node.trieNodes[word.charAt(i) - 'a'];
            } 
            else {
                return false;
            }
        }
        return node.isEndOfWord;
    }

    public boolean startsWith(String word) {
        Trie node = this;
        for (int i = 0; i<word.length(); i++) {
            if (node.trieNodes[word.charAt(i)-'a'] != null) {
                node = node.trieNodes[word.charAt(i)-'a'];
            }
            else {
                return false;
            }
        }
        return true;
    }
}
