package BinaryTree;

public class MyBinaryTree {
	
	StudentInfo root;
	int numItems = 0;
	
	public StudentInfo getRoot() {
		return root;
	}
	
	public void addToTree( StudentInfo itemToAdd, StudentInfo targetRoot ) {
		if (targetRoot == null) {
			targetRoot = itemToAdd;
		} else if (targetRoot != null) {
			if ( targetRoot.getStudentNumber() < itemToAdd.getStudentNumber() ) {
				addToTree( itemToAdd, targetRoot.getRight() );
			} else if ( targetRoot.getStudentNumber() > itemToAdd.getStudentNumber() ) {
				addToTree( itemToAdd, targetRoot.getLeft() );
			}
		}
	}
	
	public void traverseInorder( StudentInfo targetRoot ) {
		
	}
	
	public void traversePreorder( StudentInfo targetRoot ) {
		
	}

	public void traversePostorder( StudentInfo targetRoot ) {
	
	}

}
