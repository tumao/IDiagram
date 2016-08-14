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
	private JFrame frame;			// 定义窗体
	private JMenuBar menuBar; 		// 定义菜单栏
	private JMenu file, edit, network, help;			// 定义文件和菜单
	private JMenuItem f_closeItem, f_new, f_open, f_save,
		ed_find, ed_edit,
		nw_update,
		hp_doc,hp_checkNew, hp_about; 		//
	private JToolBar toolBar;
	JButton utility,chance,decision;
	
	public sMainFrame ()
	{
		init();
	}
	
	private void init ()
	{
		frame = new JFrame ("影响图");
		frame.setBounds(300, 100, 500, 600);
		menuBar = new JMenuBar();		// 菜单栏
		toolBar = new JToolBar();		// 工具栏
		
		initMenuBar();		// 初始化菜单栏，包括菜单栏中的所有的菜单项
		
		initToolBar();		// 初始化菜单栏中的工具栏
		
		frame.setJMenuBar(menuBar);
		Container contentPane = frame.getContentPane();
		contentPane.add(toolBar,BorderLayout.NORTH);
		
		menuEvent();							// 添加菜单响应事件（在菜单栏初始化的基础之上，为菜单栏中的菜单项添加监听事件）
		frame.setVisible(true);
		
	}
	
	/**
	 * 初始化菜单栏(包括初始化菜单栏中的所有项目)
	 */
	private void initMenuBar()
	{
		toolBar.setRollover(true);
		file = new JMenu("文件");			// 主菜单
		edit = new JMenu("编辑");
		network = new JMenu("网络");
		help = new JMenu("帮助");
		
		f_new = new JMenuItem("新建");
		f_open = new JMenuItem("打开");
		f_save = new JMenuItem("保存");
		f_closeItem = new JMenuItem("关闭");	// 以下为菜单项
		
		ed_find = new JMenuItem("查找");
		ed_edit = new JMenuItem("修改");
		
		nw_update = new JMenuItem("更新网络");
		
		hp_doc = new JMenuItem("文档");
		hp_checkNew = new JMenuItem("检查更新");
		hp_about = new JMenuItem("关于");
		

		file.add(f_new);
		file.add(f_open);
		file.addSeparator();
		file.add(f_save);
		file.addSeparator();
		file.add(f_closeItem);				// 为主菜单添加菜单项
		
		edit.add(ed_find);
		edit.add(ed_edit);
		
		network.add(nw_update);
		
		help.add(hp_doc);
		help.add(hp_checkNew);
		help.addSeparator();
		help.add(hp_about);

		
		menuBar.add(file);			//菜单栏
		menuBar.add(edit);
		menuBar.add(network);
		menuBar.add(help);
	}
	
	/**
	 * 初始化工具栏,并且为工具栏中的图标添加事件
	 * 
	 */
	private void initToolBar()
	{
//		toolBar = new JToolBar();		// 工具栏
		toolBar.setFloatable(false);
		utility = new JButton("Utility");
		toolBar.add(utility,FlowLayout.LEFT);
		utility.addActionListener(new EventListener());		// 为工具栏中的图标添加core中的EventListener,同以下
		
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
		frame.addWindowListener(new WindowAdapter(){			// 为frame添加监听事件
			public void windowClosing(WindowEvent e) 
			{
				    System.exit(0);
	        }
		});
		
		f_closeItem.addActionListener(new ActionListener(){		// 为菜单关闭添加监听事件 
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		hp_about.addActionListener(new ActionListener(){		// 为菜单关于添加监听事件
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		f_new.addActionListener(new ActionListener(){			// 新建文件
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("this  is file of new");
			}
		});
		
		decision.addActionListener(new ActionListener(){			// 新建文件
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
		
		// 为frame 添加鼠标事件
		frame.addMouseListener(new MouseListener(){
			
			@Override
			public void mouseClicked(MouseEvent e)
			{
				// TODO Auto-generated method stub
				Point point = MouseInfo.getPointerInfo().getLocation();	// 鼠标当前相对于屏幕的坐标
				SwingUtilities.convertPointFromScreen(point, frame);	// 鼠标相对于frame的坐标
				
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
			
		});
	}
	
}
