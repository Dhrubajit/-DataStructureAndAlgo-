package disjointset;

import disjointset.disjointsetusingarray.withoutseparaterankarray.DisjointSet;

public class Test {

	public static void main(String[] args) {
		DisjointSet dj = new DisjointSet(5);
		dj.unionSet(1, 2);
		dj.unionSet(3, 4);
		System.out.println(dj.getStatusOfDisJointSet());
		System.out.println("dj.findSet(2) = "+dj.findSet(2));
		System.out.println("dj.findSet(4) = "+dj.findSet(4));
		dj.unionSet(2, 3);
		System.out.println("dj.findSet(3) = "+dj.findSet(3));
		System.out.println(dj.getStatusOfDisJointSet());
		dj.unionSet(0, 1);
		System.out.println(dj.getStatusOfDisJointSet());
	}

}
