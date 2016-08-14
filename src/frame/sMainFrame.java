package frame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import core.EventListener;

import javax.swing.JDialog;

public class sMainFrame
{
	private JFrame frame;			// ���崰��
	private JMenuBar menuBar; 		// ����˵���
	private JMenu file, edit, network, help;			// �����ļ��Ͳ˵�
	private JMenuItem f_closeItem, f_new, f_open, f_save,
		ed_find, ed_edit,
		nw_update,
		hp_doc,hp_checkNew, hp_about; 		//
	private JToolBar toolBar;
	JButton utility,chance,decision;
	
	public static String clipboard = "utilitys";	// ��������ѡ�й���
	
	public sMainFrame ()
	{
		init();
	}
	
	private void init ()
	{
		frame = new JFrame ("Ӱ��ͼ");
		frame.setBounds(300, 100, 500, 600);
		menuBar = new JMenuBar();		// �˵���
		toolBar = new JToolBar();		// ������
		
		initMenuBar();		// ��ʼ���˵����������˵����е����еĲ˵���
		
		initToolBar();		// ��ʼ���˵����еĹ�����
		
		frame.setJMenuBar(menuBar);
		Container contentPane = frame.getContentPane();
		contentPane.add(toolBar,BorderLayout.NORTH);
		
		menuEvent();							// ��Ӳ˵���Ӧ�¼����ڲ˵�����ʼ���Ļ���֮�ϣ�Ϊ�˵����еĲ˵�����Ӽ����¼���
		frame.addMouseListener(new EventListener(frame));
		frame.setVisible(true);
		
	}
	
	/**
	 * ���ù������Ĺ���ѡ��
	 * 
	 * @param clip
	 */
	public static void setClipboard (String clip)
	{
		clipboard = clip;
	}
	
	/**
	 * ��ȡ��ǰ��������ѡ�й���
	 * 
	 * @return
	 */
	public static String getClipboard()
	{
		return clipboard;
	}
	
	/**
	 * ��ʼ���˵���(������ʼ���˵����е�������Ŀ)
	 */
	private void initMenuBar()
	{
		toolBar.setRollover(true);
		file = new JMenu("�ļ�");			// ���˵�
		edit = new JMenu("�༭");
		network = new JMenu("����");
		help = new JMenu("����");
		
		f_new = new JMenuItem("�½�");
		f_open = new JMenuItem("��");
		f_save = new JMenuItem("����");
		f_closeItem = new JMenuItem("�ر�");	// ����Ϊ�˵���
		
		ed_find = new JMenuItem("����");
		ed_edit = new JMenuItem("�޸�");
		
		nw_update = new JMenuItem("��������");
		
		hp_doc = new JMenuItem("�ĵ�");
		hp_checkNew = new JMenuItem("������");
		hp_about = new JMenuItem("����");
		

		file.add(f_new);
		file.add(f_open);
		file.addSeparator();
		file.add(f_save);
		file.addSeparator();
		file.add(f_closeItem);				// Ϊ���˵���Ӳ˵���
		
		edit.add(ed_find);
		edit.add(ed_edit);
		
		network.add(nw_update);
		
		help.add(hp_doc);
		help.add(hp_checkNew);
		help.addSeparator();
		help.add(hp_about);

		
		menuBar.add(file);			//�˵���
		menuBar.add(edit);
		menuBar.add(network);
		menuBar.add(help);
	}
	
	/**
	 * ��ʼ��������,����Ϊ�������е�ͼ������¼�
	 * 
	 */
	private void initToolBar()
	{
//		toolBar = new JToolBar();		// ������
		toolBar.setFloatable(false);
		utility = new JButton("Utility");
		toolBar.add(utility,FlowLayout.LEFT);
		utility.addActionListener(new EventListener());		// Ϊ�������е�ͼ�����core�е�EventListener,ͬ����
		
		toolBar.addSeparator();
		chance = new JButton("Chance");
		toolBar.add(chance);
		chance.addActionListener(new EventListener());
		
		toolBar.addSeparator();
		decision = new JButton("Decision");
		toolBar.add(decision);
		decision.addActionListener(new EventListener());
	}
	
	private void menuEvent()
	{
		frame.addWindowListener(new WindowAdapter(){			// Ϊframe��Ӽ����¼�
			public void windowClosing(WindowEvent e) 
			{
				    System.exit(0);
	        }
		});
		
		f_closeItem.addActionListener(new ActionListener(){		// Ϊ�˵��ر���Ӽ����¼� 
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		hp_about.addActionListener(new ActionListener(){		// Ϊ�˵�������Ӽ����¼�
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		f_new.addActionListener(new ActionListener(){			// �½��ļ�
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("this  is file of new");
			}
		});
		
		decision.addActionListener(new ActionListener(){			// �½��ļ�
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("toolbar button");
			}
		});
		
		utility.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("this is utility button");
			}
		});
		
		chance.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("this is chance button");
			}
		});
		
	}
	
}
