package uk.ac.hw.macs.search;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AStarSearchOrder implements SearchOrder {

	@Override
	public void addToFringe(List<FringeNode> frontier, FringeNode parent, Set<ChildWithCost> children) 
	{
		//add them based on cost
		for(ChildWithCost child: children)
		{
			frontier.add(new FringeNode(child.node, parent, child.cost));			
		}
		
		//reorder based on heuristic + cost
		//frontier = reOrderFringe(frontier);
		Collections.sort(frontier, new Comparator<FringeNode>() 
		{
			@Override
			public int compare(FringeNode node1, FringeNode node2)
			{
				if(node1.getFValue() <= node2.getFValue())
					return -1;
				else
					return 1;

			}
		});
	}


}
