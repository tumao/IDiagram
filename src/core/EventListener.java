package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultCellViewFactory;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.GraphLayoutCache;
import org.jgraph.graph.GraphModel;

public class EventListener implements ActionListener
{
	/**
	 * 构造方法
	 */
	public EventListener()
	{
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		if(event.getActionCommand()=="Utility")
		{
			toolDecision();
		}
		else if(event.getActionCommand()=="Chance")
		{
			toolChance();
		}
		else if(event.getActionCommand()== "Decision")
		{
			toolUtility();
		}
	}
	
	/**
	 * 决策
	 */
	private void toolDecision()
	{
		GraphModel model = new DefaultGraphModel();
		GraphLayoutCache view = new GraphLayoutCache(model, new DefaultCellViewFactory());
		JGraph graph = new JGraph(model, view);
		DefaultGraphCell[] cells = new DefaultGraphCell[3];
	}
	
	/**
	 * 自然结点
	 */
	private void toolChance()
	{
		System.out.println("chance");
	}
	
	/**
	 * 效用结点
	 */
	private void toolUtility()
	{
		System.out.println("utility");
	}
}
