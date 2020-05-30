package Lecture26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {

	private class Node {

		Character data;
		boolean isTerminal;
		HashMap<Character, Node> children;

		Node(char data, boolean isTerminal) {
			this.data = data;
			this.isTerminal = isTerminal;
			this.children = new HashMap<>();
		}
	}

	private Node root;
	int numwords;

	Tries() {
		this.root = new Node('\0', false);
		this.numwords = 0;
	}

	public void addword(String word) {
		this.addword(this.root, word);
	}

	private void addword(Node node, String word) {
		if (word.length() == 0) {
			if (node.isTerminal) {

			} else {
				this.numwords++;
				node.isTerminal = true;
			}

			return;
		}

		char cc = word.charAt(0);
		String ros = word.substring(1);

		Node child = node.children.get(cc);
		if (child == null) {
			child = new Node(cc, false);
			node.children.put(cc, child);
		}

		this.addword(child, ros);
	}

	public void display() {
		this.display(this.root, "");
	}

	private void display(Node node, String osf) {
		if (node.isTerminal) {
			System.out.println(osf);
		}

		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf + entry.getKey());
		}
	}

	public boolean searchword(String word) {
		return this.searchword(this.root,word);
	}

	private boolean searchword(Node node, String word) {
		if (word.length() == 0) {
			if (node.isTerminal) {
				return true;
			} else {
				return false;
			}

		}

		char cc = word.charAt(0);
		String ros = word.substring(1);

		Node child = node.children.get(cc);
		if (child == null) {
			return false;
		}

		return this.searchword(child, ros);

	}
	
	public void removeWord(String word) {
		this.removeWord(this.root, word);
	}
	
	private void removeWord(Node node,String word) {
		if(word.length()==0) {
			if(node.isTerminal) {
				this.numwords--;
				node.isTerminal=false;
			}else {
				
			}
			
			return;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		
		Node child=node.children.get(cc);
		if(child==null) {
			return;
		}
		
		this.removeWord(child, ros);
		
		if(!child.isTerminal&&child.children.size()==0) {
			node.children.remove(cc);
		}
		
	}

}
