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
	//탑에는 테이블넘버, 주문서이름	
	//센터에는 메뉴, 수량, 가격의 네임패널과 메뉴리스트패널	  
	//메뉴 1,2,3은 일단은 고정자료로 메뉴 모양을 잡기 위해 만듬
	//바텀에는 총가격, 뒤로가기, 주문하기  
	JPanel top_panel, center_panel, bottom_panel;
	JPanel name_panel, list_panel, menu1_panel, menu2_panel, menu3_panel;
	JPanel price_panel, btn_panel;
	//메뉴, 수량, 가격, 주문서이름 
	JButton menu, count, price, name;
	//테이블번호, 총 가격
	JTextArea table_num, sum_price;
	JTextField menu1_name, menu1_price, count1_num;
	JTextField menu2_name, menu2_price, count2_num;
	JTextField menu3_name, menu3_price, count3_num;
	//메뉴 수량 증감
	JButton plus1, minus1, plus2, minus2, plus3, minus3;
	JLabel price_label;
	//메뉴 뒤로가기, 주문하기
	JButton back, submit;
	
	public Bill() {
		bill_design();
		//창 종료
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
		});

	}
	public void bill_design() {
		Container con = this.getContentPane();

		//테이블 넘버, 주문서이름 포함
		top_panel = new JPanel();
		top_panel.setLayout(new BorderLayout());
		con.add(top_panel, BorderLayout.NORTH);		
		table_num = new JTextArea("Table 1");
		table_num.setEditable(false);
		name = new JButton("주문서");
		top_panel.add(table_num, BorderLayout.WEST);
		top_panel.add(name);
		
		center_panel = new JPanel();
		con.add(center_panel, BorderLayout.CENTER);
		//메뉴, 수량, 가격 포함
		name_panel = new JPanel();
		center_panel.add(name_panel);
		menu = new JButton("메뉴");
		count = new JButton("수량");
		price = new JButton("가격");
		name_panel.add(menu);
		name_panel.add(count);
		name_panel.add(price);
		//메뉴 리스트 포함
		list_panel = new JPanel();
		center_panel.add(list_panel);
		list_panel.setLayout(new GridLayout(3,1));
		//메뉴 1번째
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
		
		//메뉴 2번째
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
		
		//메뉴 3번째
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
		
		//총가격, 뒤로가기, 주문하기
		bottom_panel = new JPanel();
//		con.add(bottom_panel);
		con.add(bottom_panel, BorderLayout.SOUTH);
		bottom_panel.setLayout(new GridLayout(2,1));
		//총가격 출력
		price_panel = new JPanel();
		bottom_panel.add(price_panel);
		price_label = new JLabel("총 가격 : ");
		sum_price = new JTextArea("12000");	//지금 입력된 값은 임의로 준값
		sum_price.setEditable(false);		
		price_panel.add(price_label);
		price_panel.add(sum_price);
		//버튼 구간
		btn_panel = new JPanel();
		bottom_panel.add(btn_panel);
		back = new JButton("뒤로가기");
		submit = new JButton("주문하기");
		btn_panel.add(back);
		btn_panel.add(submit);		
		
	}
}
