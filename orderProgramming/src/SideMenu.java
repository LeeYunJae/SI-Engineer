import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SideMenu extends JFrame{
	
	JLabel title;
	
	JButton menu1;
	JButton menu2;
	JButton menu3;
	
	JButton home;
	JButton next;
	
	JButton choice1;
	JButton choice2;
	JButton choice3;
	
	JLabel price1;
	JLabel price2;
	JLabel price3;
	
	JPanel drink1;
	JPanel drink2;
	JPanel drink3;
	JPanel jptotal;
	JPanel footer;
	
	public SideMenu() {
		design();
		
	}
	
	
	public void design() {
		Container ct = this.getContentPane(); 
		
		title = new JLabel("*****���̵�޴� ����*****");
		title.setFont(new Font("Default", Font.PLAIN, 40));
		
		menu1 = new JButton("�� �� ��");
		price1 = new JLabel(" --2000��---------------------------------------------- ");
		choice1 = new JButton(" �޴����� ");
		
		menu2 = new JButton("��  ��");
		price2 = new JLabel(" --2000��---------------------------------------------- ");
		choice2 = new JButton(" �޴����� ");
		
		menu3 = new JButton("�� �� ��");
		price3 = new JLabel(" --7000��---------------------------------------------- ");
		choice3 = new JButton(" �޴����� ");
		
		home = new JButton("ó������");
		next = new JButton("����������");
		
		drink1 = new JPanel();
		drink2 = new JPanel();
		drink3 = new JPanel();
		jptotal = new JPanel();
		footer = new JPanel();
		
		jptotal.setLayout(new GridLayout(4, 1));
		
		drink1.add(menu1, BorderLayout.WEST);
		drink1.add(price1, BorderLayout.CENTER);
		drink1.add(choice1, BorderLayout.EAST);
		
		drink2.add(menu2, BorderLayout.WEST);
		drink2.add(price2, BorderLayout.CENTER);
		drink2.add(choice2, BorderLayout.EAST);
		
		drink3.add(menu3, BorderLayout.WEST);
		drink3.add(price3, BorderLayout.CENTER);
		drink3.add(choice3, BorderLayout.EAST);
		
		jptotal.add(drink1);
		jptotal.add(drink2);
		jptotal.add(drink3);
		
		footer.add(home, BorderLayout.WEST);
		footer.add(next, BorderLayout.EAST);
		
		ct.add(title, BorderLayout.NORTH);
		ct.add(jptotal, BorderLayout.CENTER);
		ct.add(footer, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		
		SideMenu dm = new SideMenu();
		dm.setBounds(100, 100, 500, 600);
		dm.setVisible(true);
		
	}
	
}

