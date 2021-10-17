package uk.ac.hw.macs.search;

public class AStarMain {
	
	public static void main(String[] args) {
	

		//tree one lower left part
		Node start = new Node(new InitState(11, false, 1));
		Node two_one = new Node(new InitState(21, false, 1));
		Node three_one = new Node(new InitState(31, false, 1));
		Node four_one = new Node(new InitState(41, false, 1));
		Node four_two = new Node(new InitState(42, false, 1));
		Node four_three = new Node(new InitState(43, false, 1));
		Node three_three = new Node(new InitState(33, false, 1));
		Node three_four = new Node(new InitState(34, false, 1));
		Node goal = new Node(new InitState(44, true, 1));
		
		//right part
		Node one_two = new Node(new InitState(12, false, 1));
		Node one_three = new Node(new InitState(13, false, 1));
		Node one_four = new Node(new InitState(14, false, 1));
		Node one_five = new Node(new InitState(15, false, 1));
		Node one_six = new Node(new InitState(16, false, 1));
		Node two_five = new Node(new InitState(25, false, 1));
		Node two_six = new Node(new InitState(26, false, 1));
		Node three_five = new Node(new InitState(35, false, 1));
		Node three_six = new Node(new InitState(36, false, 1));
		Node four_five = new Node(new InitState(45, false, 1));
		Node four_six = new Node(new InitState(46, false, 1));	
		
		//left part
		start.addChild(two_one, 1);
		two_one.addChild(three_one, 1);
		three_one.addChild(four_one, 3);
		four_one.addChild(four_two, 3);
		four_two.addChild(four_three, 3);
		four_three.addChild(three_three, 3);
		three_three.addChild(three_four, 3);
		four_three.addChild(goal, 1);
		three_four.addChild(goal, 1);
		
		//right part
		start.addChild(one_two, 1);
		one_two.addChild(one_three, 1);
		one_three.addChild(one_four, 1);
		one_four.addChild(one_five, 1);
		one_five.addChild(two_five, 1);
		one_five.addChild(one_six, 1);
		one_six.addChild(two_six, 1);
		two_five.addChild(two_six, 1);
		two_five.addChild(three_five, 1);
		two_six.addChild(three_six, 1);
		three_five.addChild(three_four, 3);
		three_five.addChild(four_five, 3);
		three_six.addChild(four_six, 1);
		four_six.addChild(four_five, 3);
		four_five.addChild(goal, 1);
		
		// Run the search
		SearchOrder order = new AStarSearchOrder();
		SearchProblem problem = new SearchProblem(order);
		problem.doSearch(start);
	

	}

}
