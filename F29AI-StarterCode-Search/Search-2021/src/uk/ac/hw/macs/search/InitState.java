package uk.ac.hw.macs.search;

public class InitState implements State{
	
	private int value;
	private boolean goal;

	
	//two constructors
	public InitState(int value)
	{
		this.value = value;
		this.goal = false;
	}
	
	public InitState (int value, boolean goal) {
		this.value = value;
		this.goal = goal;
	}
	
	
	@Override
	public boolean isGoal() {
		return this.goal;
	}

	@Override
	/*
	 * Calculate Manhattan distance TODO
	 */
	public int getHeuristic() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "InintState [value=" + value + ", goal=" + goal + "]";
	}

}
