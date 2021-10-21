import java.util.ArrayList;

public class Day16 {
	
	private class TreeNode<E> {
		E element;
		TreeNode<E> parent;
		ArrayList< TreeNode<E> > children;
		
		// constructor
		public TreeNode(E element, TreeNode<E> parent) {
			this.element = element;
			this.parent = parent;
			this.children = new ArrayList< TreeNode<E> >();
		}
	}
	

	public static void main(String[] args) {
		
	}

}
