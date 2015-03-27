import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sql.rowset.WebRowSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Bill extends JFrame{
	//ž���� ���̺�ѹ�, �ֹ����̸�	
	//���Ϳ��� �޴�, ����, ������ �����гΰ� �޴�����Ʈ�г�	  
	//�޴� 1,2,3�� �ϴ��� �����ڷ�� �޴� ����� ��� ���� ����
	//���ҿ��� �Ѱ���, �ڷΰ���, �ֹ��ϱ�  
	JPanel top_panel, center_panel, bottom_panel;
	JPanel name_panel, list_panel, menu1_panel, menu2_panel, menu3_panel;
	JPanel price_panel, btn_panel;
	//�޴�, ����, ����, �ֹ����̸� 
	JButton menu, count, price, name;
	//���̺��ȣ, �� ����
	JTextArea table_num, sum_price;
	JTextField menu1_name, menu1_price, count1_num;
	JTextField menu2_name, menu2_price, count2_num;
	JTextField menu3_name, menu3_price, count3_num;
	//�޴� ���� ����
	JButton plus1, minus1, plus2, minus2, plus3, minus3;
	JLabel price_label;
	//�޴� �ڷΰ���, �ֹ��ϱ�
	JButton back, submit;
	
	public Bill() {
		bill_design();
		//â ����
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});

	}
	public void bill_design() {
		Container con = this.getContentPane();

		//���̺� �ѹ�, �ֹ����̸� ����
		top_panel = new JPanel();
		top_panel.setLayout(new BorderLayout());
		con.add(top_panel, BorderLayout.NORTH);		
		table_num = new JTextArea("Table 1");
		table_num.setEditable(false);
		name = new JButton("�ֹ���");
		top_panel.add(table_num, BorderLayout.WEST);
		top_panel.add(name);
		
		center_panel = new JPanel();
		con.add(center_panel, BorderLayout.CENTER);
		//�޴�, ����, ���� ����
		name_panel = new JPanel();
		center_panel.add(name_panel);
		menu = new JButton("�޴�");
		count = new JButton("����");
		price = new JButton("����");
		name_panel.add(menu);
		name_panel.add(count);
		name_panel.add(price);
		//�޴� ����Ʈ ����
		list_panel = new JPanel();
		center_panel.add(list_panel);
		list_panel.setLayout(new GridLayout(3,1));
		//�޴� 1��°
		menu1_panel = new JPanel();
		list_panel.add(menu1_panel);
		menu1_name = new JTextField(10);
		count1_num = new JTextField(2);
		menu1_price = new JTextField(10);
		plus1= new JButton("+");
		minus1 = new JButton("-");
				
		menu1_panel.add(menu1_name);
		menu1_panel.add(minus1);
		menu1_panel.add(count1_num);
		menu1_panel.add(plus1);
		menu1_panel.add(menu1_price);
		
		//�޴� 2��°
		menu2_panel = new JPanel();
		list_panel.add(menu2_panel);
		menu2_name = new JTextField(10);
		count2_num = new JTextField(2);
		menu2_price = new JTextField(10);		
		plus2= new JButton("+");
		minus2 = new JButton("-");

		menu2_panel.add(menu2_name);
		menu2_panel.add(minus2);
		menu2_panel.add(count2_num);
		menu2_panel.add(plus2);
		menu2_panel.add(menu2_price);
		
		//�޴� 3��°
		menu3_panel = new JPanel();
		list_panel.add(menu3_panel);
		menu3_name = new JTextField(10);
		count3_num = new JTextField(2);
		menu3_price = new JTextField(10);
		plus3= new JButton("+");
		minus3 = new JButton("-");
		
		menu3_panel.add(menu3_name);
		menu3_panel.add(minus3);
		menu3_panel.add(count3_num);
		menu3_panel.add(plus3);
		menu3_panel.add(menu3_price);
		
		//�Ѱ���, �ڷΰ���, �ֹ��ϱ�
		bottom_panel = new JPanel();
//		con.add(bottom_panel);
		con.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new GridLayout(2,1));
		//�Ѱ��� ���
		price_panel = new JPanel();
		bottom_panel.add(price_panel);
		price_label = new JLabel("�� ���� : ");
		sum_price = new JTextArea("12000");	//���� �Էµ� ���� ���Ƿ� �ذ�
		sum_price.setEditable(false);		
		price_panel.add(price_label);
		price_panel.add(sum_price);
		//��ư ����
		btn_panel = new JPanel();
		bottom_panel.add(btn_panel);
		back = new JButton("�ڷΰ���");
		submit = new JButton("�ֹ��ϱ�");
		btn_panel.add(back);
		btn_panel.add(submit);		
		
	}
}
