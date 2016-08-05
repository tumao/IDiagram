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
	private Frame frame;			// ���崰��
	private MenuBar menuBar; 		// ����˵���
	private Menu file, edit, network, help;			// �����ļ��Ͳ˵�
	private MenuItem f_closeItem, f_new, f_open, f_save,
		ed_find, ed_edit,
		nw_update,
		hp_doc,hp_checkNew, hp_about; 		// 
	
	public mainFrame ()
	{
		init ();
	}
	
	/**
	 * ��ʼ��Frame
	 * 
	 */
	private void init ()
	{
		frame = new Frame ("Ӱ��ͼ");
		frame.setBounds(300, 100, 500, 600);
		frame.setLayout(new FlowLayout());
		
		menuBar = new MenuBar ();		// �˵���
		
		file = new Menu("�ļ�");			// ���˵�
		edit = new Menu("�༭");
		network = new Menu("����");
		help = new Menu("����");
		
		f_new = new MenuItem("�½�");
		f_open = new MenuItem("��");
		f_save = new MenuItem("����");
		f_closeItem = new MenuItem("�ر�");	// ����Ϊ�˵���
		
		ed_find = new MenuItem("����");
		ed_edit = new MenuItem("�޸�");
		
		nw_update = new MenuItem("��������");
		
		hp_doc = new MenuItem("�ĵ�");
		hp_checkNew = new MenuItem("������");
		hp_about = new MenuItem("����");
		

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
		
		frame.setMenuBar(menuBar);
		
		myEvent();							// ��Ӳ˵���Ӧ�¼�
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
				System.out.println("����һ������!");
			}
		});
	}

}
