package uk.ac.hw.macs.search;

public class AStarMain {
	
	//get the heuristic based on the manhattan distance
	private static int setHeuristic(int from, int to)
	{
		String from_string = String.valueOf(from);
		String to_string = String.valueOf(to);
		
		return Math.abs(Character.getNumericValue(from_string.charAt(0)) - Character.getNumericValue(to_string.charAt(0))) + 
				Math.abs(Character.getNumericValue(from_string.charAt(1)) - Character.getNumericValue(to_string.charAt(1)));			

	}
	
	public static void main(String[] args) {
	

		//tree one lower left part
		int goal_id = 44;
		Node goal = new Node(new InitState(goal_id, true, 0));
		
		Node start = new Node(new InitState(11, false, setHeuristic(11, goal_id)));
		Node two_one = new Node(new InitState(21, false, setHeuristic(21, goal_id)));
		Node three_one = new Node(new InitState(31, false, setHeuristic(31, goal_id)));
		Node four_one = new Node(new InitState(41, false, setHeuristic(41, goal_id)));
		Node four_two = new Node(new InitState(42, false, setHeuristic(42, goal_id)));
		Node four_three = new Node(new InitState(43, false, setHeuristic(43, goal_id)));
		Node three_three = new Node(new InitState(33, false, setHeuristic(33, goal_id)));
		Node three_four = new Node(new InitState(34, false, setHeuristic(34, goal_id)));
		
		
		//right part
		Node one_two = new Node(new InitState(12, false, setHeuristic(12, goal_id)));
		Node one_three = new Node(new InitState(13, false, setHeuristic(13, goal_id)));
		Node one_four = new Node(new InitState(14, false, setHeuristic(14, goal_id)));
		Node one_five = new Node(new InitState(15, false, setHeuristic(15, goal_id)));
		Node one_six = new Node(new InitState(16, false, setHeuristic(16, goal_id)));
		Node two_five = new Node(new InitState(25, false, setHeuristic(25, goal_id)));
		Node two_six = new Node(new InitState(26, false, setHeuristic(26, goal_id)));
		Node three_five = new Node(new InitState(35, false, setHeuristic(35, goal_id)));
		Node three_six = new Node(new InitState(36, false, setHeuristic(36, goal_id)));
		Node four_five = new Node(new InitState(45, false, setHeuristic(45, goal_id)));
		Node four_six = new Node(new InitState(46, false, setHeuristic(46, goal_id)));	
		
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
