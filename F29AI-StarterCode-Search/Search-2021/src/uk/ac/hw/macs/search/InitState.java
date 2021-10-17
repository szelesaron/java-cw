package uk.ac.hw.macs.search;

public class InitState implements State{
	
	private int value;
	private boolean goal;
	private int heuristic;

	
	
	public InitState (int value, boolean goal, int heuristic) 
	{
		this.value = value;
		this.goal = goal;
		this.heuristic = heuristic;
	}
	
	
	@Override
	public boolean isGoal() {
		return this.goal;
	}

	@Override
	public int getHeuristic() {
		return this.heuristic;
	}
	
	@Override
	public String toString() {
		return "InitState [value=" + value + ", goal=" + goal  + " heuristic=" + heuristic+ "]";
	}

}
