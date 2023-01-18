package problem33_merkle_tree;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		MerkleTree tree = new MerkleTree();
		List<String> dataBlocks = new ArrayList<>();
		for(int i = 0; i < 100000; i++) {
			dataBlocks.add("String" + i);
		}
		String hash1 = tree.createMerkleTree(dataBlocks);
		System.out.println(hash1);
		
		dataBlocks.clear();
		for(int i = 0; i < 100000; i++) {
			dataBlocks.add("String" + i);
		}
		String hash2 = tree.createMerkleTree(dataBlocks);
		System.out.println(hash2);
		System.out.println(hash1.equals(hash2));
		
		dataBlocks.clear();
		for(int i = 0; i < 100000; i++) {
			if(i == 0)dataBlocks.add("String");
			dataBlocks.add("String" + i);
		}
		String hash3 = tree.createMerkleTree(dataBlocks);
		System.out.println(hash3);
		System.out.println(hash3.equals(hash2));

	}

}
