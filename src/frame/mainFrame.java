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

import javax.swing.JDialog;

public class mainFrame
{
	private Frame frame;			// 定义窗体
	private MenuBar menuBar; 		// 定义菜单栏
	private Menu file, edit, network, help;			// 定义文件和菜单
	private MenuItem f_closeItem, f_new, f_open, f_save,
		ed_find, ed_edit,
		nw_update,
		hp_doc,hp_checkNew, hp_about; 		// 
	
	public mainFrame ()
	{
		init ();
	}
	
	/**
	 * 初始化Frame
	 * 
	 */
	private void init ()
	{
		frame = new Frame ("影响图");
		frame.setBounds(300, 100, 500, 600);
		frame.setLayout(new FlowLayout());
		
		menuBar = new MenuBar ();		// 菜单栏
		
		file = new Menu("文件");			// 主菜单
		edit = new Menu("编辑");
		network = new Menu("网络");
		help = new Menu("帮助");
		
		f_new = new MenuItem("新建");
		f_open = new MenuItem("打开");
		f_save = new MenuItem("保存");
		f_closeItem = new MenuItem("关闭");	// 以下为菜单项
		
		ed_find = new MenuItem("查找");
		ed_edit = new MenuItem("修改");
		
		nw_update = new MenuItem("更新网络");
		
		hp_doc = new MenuItem("文档");
		hp_checkNew = new MenuItem("检查更新");
		hp_about = new MenuItem("关于");
		

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
		
		frame.setMenuBar(menuBar);
		
		myEvent();							// 添加菜单响应事件
		frame.setVisible(true);
		
	}
	
	private void myEvent()
	{
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) 
			{
				    System.exit(0);
	        }
		});
		
		f_closeItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		hp_about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
//				JDialog dialog = new JDialog ();
				System.out.println("这是一个测试!");
			}
		});
	}

}
