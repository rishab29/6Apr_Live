package Lecture26;

public class TrieClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Tries trie=new Tries();
       
       trie.addword("art");
       trie.addword("arts");
       trie.addword("bug");
       trie.addword("boy");
       trie.addword("sea");
       trie.addword("see");
       trie.addword("seen");
       
       trie.display();
       
       
//       System.out.println(trie.searchword("art"));
//       System.out.println(trie.searchword("arts"));
//       System.out.println(trie.searchword("hat"));
       
       System.out.println("************");
      // trie.removeWord("arts");
       trie.removeWord("art");
       trie.display();
       
	}

}
