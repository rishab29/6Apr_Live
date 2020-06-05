package Lecture29and30;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Graphs {
	class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;

		Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
		}

		public void display() {
			String str = this.name + "=>";
			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				str = str + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
			}

			str = str + "END";
			System.out.println(str);
		}
	}

	HashMap<String, Vertex> vtces;

	Graphs() {
		this.vtces = new HashMap<>();
	}

	public int numVtces() {
		return this.vtces.size();
	}

	public void addVertex(String name) {
		if (this.vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);
	}

	public void removeVertex(String name) {
		if (!this.vtces.containsKey(name)) {
			return;
		}

		Vertex vtx = this.vtces.get(name);
		Set<Vertex> nbrs = vtx.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			nbr.nbrs.remove(vtx);
		}

		this.vtces.remove(name);
	}

	public int numEdges() {
		int ans = 0;
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			ans = ans + vtx.nbrs.size();
		}

		ans = ans / 2;
		return ans;
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);
	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);
		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);
	}

	public void display() {
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			vtx.display();
		}
	}

	public boolean hasPath(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null) {
			return false;
		}

		HashMap<Vertex, Boolean> visited = new HashMap<>();
		return hasPathDFSIterative(vtx1, vtx2, visited);
	}

	private boolean hasPathRecursive(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> visited) {
		if (!visited.containsKey(vtx1)) {
			visited.put(vtx1, true);
		} else {
			return false;
		}

		if (vtx1.nbrs.containsKey(vtx2)) {
			return true;
		}

		Set<Vertex> nbrs = vtx1.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			if (this.hasPathRecursive(nbr, vtx2, visited)) {
				return true;
			}
		}

		return false;
	}

	private boolean hasPathIterative(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> visited) {
		Queue<Vertex> q = new LinkedList<>();
		q.add(vtx1);
		while (!q.isEmpty()) {
			Vertex rv = q.remove();
			if (!visited.containsKey(rv)) {
				visited.put(rv, true);
				if (rv.nbrs.containsKey(vtx2)) {
					return true;
				}

				Set<Vertex> nbrs = rv.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					if (!visited.containsKey(nbr)) {
						q.add(nbr);
					}
				}
			}
		}

		return false;
	}

	
	private boolean hasPathDFSIterative(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> visited) {
		LinkedList<Vertex> stack= new LinkedList<>();
		stack.addFirst(vtx1);
		while (!stack.isEmpty()) {
			Vertex rv = stack.removeFirst();
			if (!visited.containsKey(rv)) {
				visited.put(rv, true);
				if (rv.nbrs.containsKey(vtx2)) {
					return true;
				}

				Set<Vertex> nbrs = rv.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					if (!visited.containsKey(nbr)) {
						stack.addFirst(nbr);
					}
				}
			}
		}

		return false;
	}

}
