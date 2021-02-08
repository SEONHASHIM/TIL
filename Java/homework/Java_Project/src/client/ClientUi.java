package client;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ClientUi {

	public static void main(String[] args) {
		Frame f=new Frame("나의 채팅");
		Panel p=new Panel();
		Button b1=new Button("전송1");
		TextField tf=new TextField(20);
		TextArea ta=new TextArea();	
		
		Panel p1 = new Panel(); //east 버튼 붙이기 체크박스 라디오 버튼
		Button b2 = new Button("버튼1");
		Button b3 = new Button("버튼2");
		Checkbox c1 = new Checkbox("체크박스1",false);
		Checkbox c2 = new Checkbox("체크박스2",false);
		JRadioButton r1 = new JRadioButton("라디오버튼1");
		JRadioButton r2 = new JRadioButton("라디오버튼2");
		ButtonGroup bg = new ButtonGroup();
		
		WindowListener fHandler=new MyFrameHandler();
		f.addWindowListener(fHandler);		
		
		MyButtonHandler b1Handler=new MyButtonHandler();
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		
		tf.addActionListener(b1Handler);
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		f.add(p1,BorderLayout.EAST);
		p.add(tf);
		p.add(b1);
		
		//p1.setLayout(new BoxLayout(target, axis));
		p1.add(b2);
		p1.add(b3);
		p1.add(c1);
		p1.add(c2);
		
		bg.add(r1);
		bg.add(r2);
		p1.add(r1);
		p1.add(r2);
		p1.setBackground(Color.CYAN);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

}
