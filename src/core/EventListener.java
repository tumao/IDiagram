package core;

import java.awt.Component;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultCellViewFactory;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.DefaultGraphModel;
import org.jgraph.graph.GraphLayoutCache;
import org.jgraph.graph.GraphModel;

import frame.sMainFrame;

public class EventListener implements ActionListener, MouseListener
{
	Component component;
	String toolClap;
	
	public EventListener()
	{
		
	}
	
	/**
	 * ���췽���������齨�Ĺ��췽��
	 */
	public EventListener(Component component)
	{
		this.component = component;
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
	 * ����
	 */
	private void toolDecision()
	{
		sMainFrame.setClipboard("decision");
		GraphModel model = new DefaultGraphModel();
		GraphLayoutCache view = new GraphLayoutCache(model, new DefaultCellViewFactory());
		JGraph graph = new JGraph(model, view);
		DefaultGraphCell[] cells = new DefaultGraphCell[3];
	}
	
	/**
	 * ��Ȼ���
	 */
	private void toolChance()
	{
//		System.out.println("chance");
		sMainFrame.setClipboard("chance");	// ����Ϊѡ��
	}
	
	/**
	 * Ч�ý��
	 */
	private void toolUtility()
	{
//		System.out.println("utility");
		sMainFrame.setClipboard("utility");
	}
	
	/**
	 * ��굥��frameʱ�����Ӧ�¼�
	 */
	@Override
	public void mouseClicked(MouseEvent e)
	{
		double x = e.getX();	// ������ĺ�����
		double y = e.getY(); 	// �������������
		
		String clipboard = sMainFrame.getClipboard();
	}
	

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
