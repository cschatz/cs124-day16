import java.util.ArrayList;


public class Day16 {
	
	private static class TreeNode<E> {
		E element;
		TreeNode<E> parent;
		ArrayList< TreeNode<E> > children;
		
		// constructor
		public TreeNode(E element) {
			this.element = element;
			this.children = new ArrayList< TreeNode<E> >();
		}
		
//		public TreeNode(E element, TreeNode<E> parent) {
//			this.element = element;
//			this.children = new ArrayList< TreeNode<E> >();
//			parent.addChild(this);
//		}
		
		public void addChild(TreeNode<E> node) {
			children.add(node);
			node.parent = this; 
			// meaning of "this": the current object being acted on
			// "this" is set to the object on the left side
			//  of the dot(.) when a method call happens
		}
	}
	
	public static <E> int depthOfNode(TreeNode<E> node) {
		// count steps up to get the root
		TreeNode<E> current = node;
		int count = 0;
		while (current.parent != null) {
			count += 1;
			current = current.parent;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<String>("Univerities in CA");
		
		TreeNode<String> pub = new TreeNode<String>("public");
		TreeNode<String> priv = new TreeNode<String>("private");
		root.addChild(pub);
		root.addChild(priv);
		
		TreeNode<String> uc = new TreeNode<String>("UCs");
		pub.addChild(uc);
		TreeNode<String> irvine = new TreeNode<String>("Irvine");
		TreeNode<String> la = new TreeNode<String>("LA");
		TreeNode<String> berkeley = new TreeNode<String>("Berkeley");
		uc.addChild(irvine);
		uc.addChild(la);
		uc.addChild(berkeley);
		
		TreeNode<String> csu = new TreeNode<String>("CSUs");
		pub.addChild(csu);
		
		TreeNode<String> longbeach = new TreeNode<String>("Long Beach");
		TreeNode<String> sj = new TreeNode<String>("SJSU");
		TreeNode<String> sf = new TreeNode<String>("SF State");
		csu.addChild(longbeach);
		csu.addChild(sj);
		csu.addChild(sf);
		
		TreeNode<String> small = new TreeNode<String>("small");
		priv.addChild(small);
		TreeNode<String> mills = new TreeNode<String>("Mills");
		small.addChild(mills);
		
		System.out.println("Depth of Irvine: " + depthOfNode(irvine));
	
	}

}
