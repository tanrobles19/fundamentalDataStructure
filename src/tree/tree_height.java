
import java.util.*;
import java.io.*;

public class tree_height {
    class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}
    
	public static class Nodex {
		
	    int index;
	    ArrayList<Nodex> node = new ArrayList<tree_height.Nodex>();
	    
	    Nodex(int position, Nodex node) {
	        this.index = position;
	        this.node.add(node);
	    }
	    
	}// end Node

	public class TreeHeight {
		int n;
		Nodex parent[];
		Nodex nodes[];
		
		Nodex root;
		
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			parent = new Nodex[n];
			nodes = new Nodex[n];
			for (int i = 0; i < n; i++) {							
				parent[i] = new Nodex(in.nextInt(), null);
				nodes[i] = new Nodex(i, null);
				
			}
		}				
						
		int computeHeight() {
			
			for(int child_index = 0; child_index < n; child_index++) {
				int parent_index = parent[child_index].index;
				
				if(parent_index == -1) {
					root = nodes[child_index]; 
				}else {
					nodes[parent_index].node.add( nodes[child_index] );
				}
				
			}// end for								
			
			return height(root);
		}
		
		private int height(Nodex tree) {
			
			if(tree == null || tree.node == null) {
				return 0;
			}else {
				
				int height = 0;
				
				for(Nodex child : tree.node) {
					height = Math.max(height, height(child));
				}
				
				return  height + 1;
			}
			
		}// end height()
		
	}

	static public void main(String[] args) throws IOException {
            new Thread(null, new Runnable() {
                    public void run() {
                        try {
                            new tree_height().run();
                        } catch (IOException e) {
                        }
                    }
                }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		TreeHeight tree = new TreeHeight();
		tree.read();
		System.out.println(tree.computeHeight());
	}
}
