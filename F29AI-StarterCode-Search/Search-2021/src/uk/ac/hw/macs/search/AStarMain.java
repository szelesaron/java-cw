package uk.ac.hw.macs.search;

import uk.ac.hw.macs.search.example.BreadthFirstSearchOrder;
import uk.ac.hw.macs.search.example.DepthFirstSearchOrder;

public class AStarMain {
	
	public static void main(String[] args) {
	

		//default tree
		Node start = new Node(new InitState(0,false,0));
		Node one = new Node(new InitState(1, false, 2));
		Node goal = new Node(new InitState(5, true, 5));
		start.addChild(one, 1);
		one.addChild(goal, 1);
		
		
		
		// Run the search
		SearchOrder order = new AStarSearchOrder();
		SearchProblem problem = new SearchProblem(order);
		problem.doSearch(start);
	

	}

}
