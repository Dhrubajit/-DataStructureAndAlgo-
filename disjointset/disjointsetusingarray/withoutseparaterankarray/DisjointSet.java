package disjointset.disjointsetusingarray.withoutseparaterankarray;

import java.util.Arrays;

public class DisjointSet {

	private int[] parent;
	int n;
	
	public DisjointSet(int n){
		this.parent = new int[n];
		this.n = n;
		makeset();
	}

	private void makeset() {
		for(int i=0;i<n;i++){
			parent[i]=-1;
		}
	}
	
	public int findSet(int k){
		if(parent[k]<0){
			return k;
		}
		else
		{
			parent[k] = findSet(parent[k]);	//path compression
			return parent[k];
		}
	}
	
	public boolean unionSet(int i, int j){
		int parentOfi = findSet(i);
		int parentOfj = findSet(j);
		//If two element belong to same set then no union operation is performed.
		//cycle present scenario
		if(parentOfi == parentOfj){
			return false;
		}
		if(parent[parentOfi] != parent[parentOfj]){
			if(Math.abs(parentOfi) > Math.abs(parentOfj)){ //union by rank
				parent[j] = parentOfi;
			}
			else if(Math.abs(parentOfi) < Math.abs(parentOfj))
			{
				parent[i] = parentOfj;
			}
		}
		else{
			parent[j] = parentOfi;
			parent[parentOfi] = parent[parentOfi]-1;
		}
		
		return true;
		
	}
	
	public String getStatusOfDisJointSet(){
		return Arrays.toString(parent);
	}
}
