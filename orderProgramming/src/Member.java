import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Member extends JFrame {
	
	MainMenu mm ;

	JButton member;
	JButton nomember;
	JPanel jp;
	
	public Member() {		
		design();
		
		//창 닫기
		addWindowListener(new WindowAdapter() {	
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
	}
		
	public void design() {
		
		Container ct = this.getContentPane(); 
		
		member = new JButton("회원 주문");
		nomember = new JButton("비회원 주문");
		jp = new JPanel();
		
		jp.setLayout(new GridLayout(1, 2));
		
		jp.add(member, BorderLayout.WEST);
		jp.add(nomember, BorderLayout.EAST);		
		
		ct.add(jp, BorderLayout.CENTER);
		
		member.addActionListener(new Login(this));
	}
	
	public static void main(String[] args) {
		
		Member ordermain = new Member();
		
		ordermain.setBounds(300, 300, 300, 300);
		ordermain.setVisible(true);		
	}

}
