
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrinkMenu extends JFrame implements ActionListener{
	
	MainMenu mm ;
	
	JLabel title;
	
	JButton menuSoju ;
	JButton selectSoju;
	JLabel priceSoju;
	
	JButton menuBeer ;
	JButton selectBeer;
	JLabel priceBeer;
	
	JButton menuBernini;
	JButton selectBernini;
	JLabel priceBernini;
	
	JButton goBack;
	JButton goNext;	
	
	JPanel jpSoju;
	JPanel jpBeer;
	JPanel jpBernini;
	JPanel jpTotal;
	JPanel jpFooter;
	
	public DrinkMenu(MainMenu mm) {
		this.mm = mm ;
		
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
		
		title = new JLabel("       ************* 주류 선택  ************");
		title.setFont(title.getFont().deriveFont(21.0f));	//title 사이즈조절
		
		menuSoju = new JButton(" 소  주 ");
		priceSoju = new JLabel("3500원     =====> ");
		selectSoju = new JButton("선택 ");
		
		menuBeer = new JButton(" 맥  주 ");
		priceBeer = new JLabel("4000원     =====> ");
		selectBeer = new JButton("선택");
		
		menuBernini = new JButton("버니니");
		priceBernini = new JLabel("7000원     =====> ");
		selectBernini = new JButton("선택");
		
		goBack = new JButton("이전페이지");
		goNext = new JButton("다음페이지");
		
		jpSoju = new JPanel();
		jpBeer = new JPanel();
		jpBernini = new JPanel();
		jpTotal = new JPanel();
		jpFooter = new JPanel();
		
		jpTotal.setLayout(new GridLayout(4, 1));
		
		jpSoju.add(menuSoju, BorderLayout.WEST);
		jpSoju.add(priceSoju, BorderLayout.CENTER);
		jpSoju.add(selectSoju, BorderLayout.EAST);
		
		jpBeer.add(menuBeer, BorderLayout.WEST);
		jpBeer.add(priceBeer, BorderLayout.CENTER);
		jpBeer.add(selectBeer, BorderLayout.EAST);
		
		jpBernini.add(menuBernini, BorderLayout.WEST);
		jpBernini.add(priceBernini, BorderLayout.CENTER);
		jpBernini.add(selectBernini, BorderLayout.EAST);
		
		jpTotal.add(jpSoju);
		jpTotal.add(jpBeer);
		jpTotal.add(jpBernini);
		
		jpFooter.add(goBack, BorderLayout.WEST);
		jpFooter.add(goNext, BorderLayout.EAST);
		
		ct.add(title, BorderLayout.NORTH);
		ct.add(jpTotal, BorderLayout.CENTER);
		ct.add(jpFooter, BorderLayout.SOUTH);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		this.setBounds(100, 100, 400, 300);	
		this.setVisible(true);	
		mm.setVisible(false);
		
	}
	
}

