package uk.ac.hw.macs.search;

import java.util.List;
import java.util.Set;

public class AStarSearchOrder implements SearchOrder {

	@Override
	public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) {
		//add them based on cost
		for(ChildWithCost child: children)
		{
			//frontier.add());
			System.out.println(child.cost);
			System.out.println(frontier);
		}
		
	}

}
