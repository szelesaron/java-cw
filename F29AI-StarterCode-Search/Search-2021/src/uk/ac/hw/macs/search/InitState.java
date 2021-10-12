package uk.ac.hw.macs.search;

public class InitState implements State{
	
	private int heuristic;
	private boolean goal;

	
	//two constructors
	public InitState(int heuristic)
	{
		this.heuristic = heuristic;
		this.goal = false;
	}
	
	public InitState (int heuristic, boolean goal) {
		this.heuristic = heuristic;
		this.goal = goal;
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
		return "InintState [value=" + heuristic + ", goal=" + goal + "]";
	}

}
