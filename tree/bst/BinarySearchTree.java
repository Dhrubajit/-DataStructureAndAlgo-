package tree.bst;

public class BinarySearchTree {
	private Node root;
	
	class Node{
		int key;
		Node left;
		Node right;
		Node(int key) {
			super();
			this.key = key;
		}
	}

	public BinarySearchTree() {
		super();
		this.root = null;
	}
	
	public void insertIterative(int key){
		if(root == null){
			root = new Node(key);
		}
		else{
			Node temp = root;
			while(temp != null && temp.key != key){
				if(key > temp.key){
					if(temp.left == null){
						temp.left = new Node(key);
						break;
					}
					else{
						temp = temp.left;
					}
				}
				else{
					if(temp.right == null){
						temp.right = new Node(key);
						break;
					}
					else{
						temp = temp.right;
					}
				}
			}
		}
		
	}
	
	public boolean searchRecursive(int key,Node temp){
		if(temp == null){
			return false;
		}
		else if(temp.key == key){
			return true;
		}
		else if(key > temp.key){
			return searchRecursive(key,temp.right);
		}
		else 
			return searchRecursive(key,temp.left);
	}
	
	public boolean searchIterative(int key){
		Node temp = root;
		while(temp != null){
			if(temp.key == key){
				return true;
			}
			else if(key > temp.key){
				temp = temp.right;
			}
			else 
			{
				temp = temp.left;
			}
		}
		
		return false;
	}
	
	public void inorderRec(Node temp){
		if(temp == null){
			return;
		}
		else{
			inorderRec(temp.left);
			System.out.print(temp.key);
			inorderRec(temp.right);
		}
	}
	
	public int minValue() throws Exception{
		if(root == null){
			throw new Exception("Root is NULL");
		}
		Node temp = root;
		while(temp.left != null){
			temp = temp.left;
		}
		return temp.key;
	}
	
	
}
