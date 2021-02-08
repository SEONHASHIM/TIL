package client;

import java.awt.*;
import java.awt.event.*;

public class ClientUi {

	public static void main(String[] args) {
		Frame f=new Frame("나의 채팅");
		Panel p=new Panel();
		Button b1=new Button("전송1");
		TextField tf=new TextField(20);
		TextArea ta=new TextArea();	
		
		WindowListener fHandler=new MyFrameHandler();
		f.addWindowListener(fHandler);		
		
		MyButtonHandler b1Handler=new MyButtonHandler();
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		
		tf.addActionListener(b1Handler);
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		p.setBackground(Color.gray);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
	}

}
