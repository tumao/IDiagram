/**
 * @author rchangchun@outlook.com
 * 影响图评价软件入口文件
 */
import frame.mainFrame;
import frame.sMainFrame;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

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

public class Index
{

	public static void main(String[] args)
	{
		 new sMainFrame();
//		GraphModel model = new DefaultGraphModel();
//		GraphLayoutCache view = new GraphLayoutCache(model, new DefaultCellViewFactory());
//		JGraph graph = new JGraph(model, view);
//		DefaultGraphCell[] cells = new DefaultGraphCell[3];
//		
//		cells[0] = new DefaultGraphCell("hello");					// 新生成一个节点
//		GraphConstants.setBounds(cells[0].getAttributes(), new Rectangle2D.Double(80, 120, 60, 60));
//		GraphConstants.setGradientColor(cells[0].getAttributes(), Color.orange);
//		GraphConstants.setOpaque(cells[0].getAttributes(), true);
//		DefaultPort port0 = new DefaultPort();
//		cells[0].add(port0);
//		
//		cells[1] = new DefaultGraphCell("fuck");
//		GraphConstants.setBounds(cells[1].getAttributes(), new Rectangle2D.Double(540, 140, 40, 20));
//		GraphConstants.setGradientColor(cells[1].getAttributes(), Color.red);
//		GraphConstants.setOpaque(cells[1].getAttributes(), true);
//		DefaultPort port1 = new DefaultPort();
//		cells[1].add(port1);
//		
//		DefaultEdge edge = new DefaultEdge();
//		edge.setSource(cells[0].getChildAt(0));
//		edge.setTarget(cells[1].getChildAt(0));
//		cells[2] = edge;
//		int arrow = GraphConstants.ARROW_CLASSIC;
//		GraphConstants.setLineEnd(edge.getAttributes(), arrow);
//		GraphConstants.setEndFill(edge.getAttributes(), true);
//
//		graph.getGraphLayoutCache().insert(cells);
//		JFrame frame = new JFrame();
//		frame.getContentPane().add(new JScrollPane(graph));
//		frame.pack();
//		frame.setVisible(true);
		
//		JGraph graph = new JGraph();
//		JFrame frame = new JFrame();
//		frame.getContentPane().add(new JScrollPane(graph));
//		frame.pack();
//		frame.setVisible(true);
	}

}
