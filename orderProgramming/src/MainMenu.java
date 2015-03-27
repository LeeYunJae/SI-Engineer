

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MainMenu extends JFrame implements ActionListener{
	
	Login lg ;
	
	//JTextField, JPasswordField 공유 
	private JTextField phoneNum ;
	private JPasswordField password ;
	
	//버튼 생성
	JLabel title ; 
	
	private JButton menuChicken ;
	private JButton selectChicken ;
	private JLabel priceChicken ;
	
	private JButton menuPizza ;
	private JButton selectPizza ;
	private JLabel pricePizza ;
	
	private JButton menuPasta ;
	private JButton selectPasta ;
	private JLabel pricePasta ; 
	
	private JButton goNext ;
	
	JPanel jpChicken ;
	JPanel jpPizza ;
	JPanel jpPasta ;
	JPanel jpFooter ;
	JPanel jpTotal ;
	
	private Container ca;

	
	//public MainMenu(Login lg, String phoneNum, String password) {
	public MainMenu(Login lg, JTextField phoneNum, JPasswordField password) {
		this.phoneNum = phoneNum ;
		this.password = password ;	
		this.lg = lg ;
		
		this.design() ;	
		
		//창 닫기
		addWindowListener(new WindowAdapter() {	
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});
	}
		
	public void design() {		
	
		title = new JLabel() ;
		title.setFont(title.getFont().deriveFont(21.0f));	//title 사이즈조절
		
		title.setText("    ************* 메인 메뉴 ************");
		
		//값 넣어주기					
		menuChicken= new JButton(" 치  킨 ");
		priceChicken = new JLabel("18000원     =====> ");
		selectChicken= new JButton("선택");		
		
		menuPizza= new JButton(" 피  자 ");
		pricePizza = new JLabel("23000원     =====> ");
		selectPizza= new JButton("선택");		
		
		menuPasta= new JButton("파스타");
		pricePasta = new JLabel("20000원     =====> ");
		selectPasta= new JButton("선택");

	    goNext = new JButton("다음페이지");
		
		jpChicken = new JPanel();
		jpPizza = new JPanel();
		jpPasta = new JPanel();
		jpTotal = new JPanel();
		jpFooter = new JPanel() ;
		
		jpChicken.add(menuChicken);
		jpChicken.add(priceChicken);
		jpChicken.add(selectChicken);
		
		jpPizza.add(menuPizza);
		jpPizza.add(pricePizza);
		jpPizza.add(selectPizza);
		
		jpPasta.add(menuPasta);
		jpPasta.add(pricePasta);
		jpPasta.add(selectPasta);
		
	    jpFooter.add(goNext, BorderLayout.EAST);
		
		jpTotal.setLayout(new GridLayout(5,1));
		jpTotal.add(jpChicken) ;
		jpTotal.add(jpPizza) ;
		jpTotal.add(jpPasta) ;	
		
		ca = this.getContentPane();	
	
		//container에 넣어주기
		ca.add(title, BorderLayout.NORTH) ;
		ca.add(jpTotal, BorderLayout.CENTER);
		ca.add(jpFooter, BorderLayout.SOUTH);
		
		goNext.addActionListener(new DrinkMenu(this)) ;
		//goHome.addActionListener(new Member(this)) ;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		e.getSource() ;
	
		this.setBounds(100, 100, 400, 300);			
		this.setVisible(true);
		lg.setVisible(false);
		
		System.out.println("핸드폰번호 : " + phoneNum.getText());
		System.out.println("비밀번호 : " + password.getText());	
		
	}

}
