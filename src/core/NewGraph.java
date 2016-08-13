package core;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultCellViewFactory;
import org.jgraph.graph.DefaultEdge;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.DefaultPort;
import org.jgraph.graph.GraphConstants;
import org.jgraph.graph.GraphLayoutCache;
import org.jgraph.graph.GraphModel;

public class NewGraph
{
	private GraphModel model;
	
	public void createModel()
	{
		model = new DefaultGraphModel();		// 创建一个model
		GraphLayoutCache view = new GraphLayoutCache(model, new DefaultCellViewFactory());
		JGraph graph = new JGraph(model, view);
//		DefaultGraphCell[] cells = new DefaultGraph
	}
}
