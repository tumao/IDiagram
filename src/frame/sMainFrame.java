package frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
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
	
	public sMainFrame ()
	{
		init();
	}
	
	private void init ()
	{
		frame = new JFrame ("影响图");
		frame.setBounds(300, 100, 500, 600);
		frame.setLayout(new FlowLayout());
		
		menuBar = new JMenuBar ();		// 菜单栏
		
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
		
		frame.setJMenuBar(menuBar);
		
		myEvent();							// 添加菜单响应事件
		frame.setVisible(true);
		
	}
	
	private void myEvent()
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
	}
}
