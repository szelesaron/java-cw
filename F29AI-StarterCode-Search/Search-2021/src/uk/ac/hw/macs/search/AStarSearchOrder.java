package uk.ac.hw.macs.search;

import java.util.List;
import java.util.Set;

public class AStarSearchOrder implements SearchOrder {

	@Override
	public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) {
		//add them based on cost
		for(ChildWithCost child: children)
		{
			if(frontier.isEmpty())
			{
				frontier.add(new FringeNode(child.node, parent, child.node.getValue().getHeuristic() + child.cost));
				System.out.println("Total cost: " + child.node.getValue().getHeuristic() + child.cost);
			}
			else
			{
				for (int i = 0; i < frontier.size(); i++) 
				{
					if(child.node.getValue().getHeuristic() + child.cost <= frontier.get(i).getFValue())
					{
						frontier.add(i, new FringeNode(child.node, parent, child.node.getValue().getHeuristic() + child.cost));
					}
				}
			}
			
		}
		
	}

}
