package boss_Activity;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import rooms.Rooms;
import rooms.Shuju;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button_Actioned {

	Shuju[] shu = new Shuju [4];
	
	JButton btn1 = new JButton("�����");
	JButton btn2 = new JButton("����");
	JButton confirm = new JButton("Ȯ��");
	JButton cancel = new JButton("���");
	
	public void getFoodPanel(Main_Activity ma, Make_Room mr, int flag)
	{	
		for (int i = 0; i < 4; i++)
		{
			shu[i] = new Shuju();
		}
		
		Button btn1 = new Button("�����");
		Button btn2 = new Button("����");
		Dialog dialog = new Dialog(ma,"My dialog");
		 Label lab1 = new Label("�����ϼ���");
		 JCheckBox jcb1 = new JCheckBox();
		 jcb1.add(new JLabel("����������1500"));
		 JCheckBox jcb2 = new JCheckBox();
		 jcb2.add(new JLabel("�Ƹ޸�ī��2000"));
		  JCheckBox cb3 = new JCheckBox();
		  cb3.add(new JLabel("��ġ1500"));
		  JCheckBox cb4 = new JCheckBox("ī���2500");
		JCheckBox cb5 = new JCheckBox("īǪġ��2000");
		  JCheckBox cb6 = new JCheckBox("ī���ī3000");
		  JCheckBox cb7 = new JCheckBox("ļ���ī���ī3500");
		  JCheckBox cb8 = new JCheckBox("ī��񿣳�3000");
		  Button btn3 = new Button("Ȯ��");
		 
		  Dialog dialog2 = new Dialog(ma,"My dialog2");
		  Label lab2 = new Label("�����ϼ���");
		  Checkbox cb12 = new Checkbox("����Ÿ��Ʈ");
		  Checkbox cb22 = new Checkbox("��Ű��");
		  Checkbox cb32 = new Checkbox("��ƽ����");
		  Checkbox cb42 = new Checkbox("ġ��Ÿ��Ʈ");
		  Checkbox cb52 = new Checkbox("ġ�� ����ũ");
		  Checkbox cb62 = new Checkbox("���� ����ũ");
		  Checkbox cb72 = new Checkbox("�� ����Ʈ");
		  Checkbox cb82 = new Checkbox("�ٹٷ��");
		  Button btn4 = new Button("Ȯ��");
		  
		  Container ct = ma.getContentPane();
		  Button btn9= new Button("���");
		  Label lab3=new Label("�� ����:");
		  
		
		
		class MyListener implements ActionListener{
	       	  public void actionPerformed(ActionEvent e) {
	       		  Button btn = (Button) e.getSource();
	       		 
	       		  if(btn==btn2)
	      			{
	      			  dialog2.setLayout(null);
	      			  dialog2.setSize(700,600);
	      			  lab1.setBounds(225,50,150,20);
	      			  dialog2.add(lab1);
	      			
	      			  btn4.setBounds(550,550,70,30);
	      			  dialog2.add(btn4);
	      			 
	      			  cb12.setBounds(200,100,100,50);
	      			  dialog2.add(cb12);
	        		  cb22.setBounds(400,100,100,50);
	        		  dialog2.add(cb22);
	        		  cb32.setBounds(200,200,100,50);
	      			  dialog2.add(cb32);
	      			  cb42.setBounds(400,200,100,50);
	     			  dialog2.add(cb42);
	     			  cb52.setBounds(200,300,100,50);
	     			  dialog2.add(cb52);
	     			  cb62.setBounds(400,300,100,50);
	     			  dialog2.add(cb62);
	     			  cb72.setBounds(200,400,100,50);
	     			  dialog2.add(cb72);
	     			  cb82.setBounds(400,400,100,50);
	     			  dialog2.add(cb82);
	        		  dialog2.setVisible(true);
	        		  
	        		  
	        		  
	      			}
	      			else if(btn==btn4)
	      			{
	      				dialog2.setVisible(false);
	      			}
	        
	      			else if(btn==btn1)
	     			{
	     			  dialog.setLayout(null);
	     			  
	     			    
	     			
	     			  dialog.setSize(700,600);
	     			  lab2.setBounds(225,50,150,20);
	     			  dialog.add(lab2);
	     			  
	     			  btn3.setBounds(550,550,70,30);
	     			  dialog.add(btn3);
	     			//fff  
	     			 lab3.setBounds(300,450,150,20);
	      			  dialog.add(lab3);
		      	
	     			  jcb1.setBounds(200,100,130,50);
	     			  dialog.add(jcb1);
	       		  jcb2.setBounds(400,100,130,50);
	       		  dialog.add(jcb2);
	       		  cb3.setBounds(200,200,150,50);
	     			  dialog.add(cb3);
	     			  cb4.setBounds(400,200,150,50);
	    			  dialog.add(cb4);
	    			  cb5.setBounds(200,300,150,50);
	    			  dialog.add(cb5);
	    			  cb6.setBounds(400,300,150,50);
	    			  dialog.add(cb6);
	    			  cb7.setBounds(200,400,150,50);
	    			  dialog.add(cb7);
	    			  cb8.setBounds(400,400,150,50);
	    			  dialog.add(cb8);
	    			  
	    			  
	    				 btn9.setBounds(500,450,100,20);
		      			  dialog.add(btn9);
		      	 		  dialog.setVisible(true);
		      			  //kkkk  
		      	 		  
		      	 
	    			 
	     			}
	      			
	       		
	     			else if(btn==btn3)
	     			{
	     				dialog.setVisible(false);
	     			}
	       		  
	     			
	       		 
	     			else if(btn==btn9)
	     			{
	     				 dialog.setLayout(null);
	     				 
	     				 
		      			  
	     				 int amount=0;
	     				 
	   	       		 if( jcb1.isSelected())
	   	       			  shu[flag].amount += 1500;
	   	       		 if( jcb2.isSelected())
	   	       			  shu[flag].amount += 2000;
	   	       	    if( cb3.isSelected())
  	       			      shu[flag].amount += 1500;
	   	            if( cb4.isSelected())
	       			      shu[flag].amount += 2500;
	   	           if( cb5.isSelected())
       			          amount += 2000;
	   	           if( cb6.isSelected())
    			          amount += 3000;
	   	            if( cb7.isSelected())
    			          amount += 3500;
	   	            if( cb8.isSelected())
    			          amount += 3000;
	   	       		 lab3.setText("�� ����:" +Integer.toString(shu[flag].amount));
	   	       		 shu[flag].setTotalPrice(shu[flag].getTotalPrice() +shu[flag]. amount);
	   	       		 // �����. Ȯ�ο�...
	   	       		 System.out.println(shu[flag].getTotalPrice());
	   	       	     dialog.setVisible(true);
	   	       		 
	     			}
  			  
   	 		
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       		  
	       	  }
				 
			 }

	
			 ma.setLayout(null);
			 ma.setSize(500,200);
			 ma.setBackground(Color.yellow);
			 btn1.addActionListener(new MyListener());
			 btn9.addActionListener(new MyListener());
			 btn3.addActionListener(new MyListener());
			 btn4.addActionListener(new MyListener());
			 btn2.addActionListener(new MyListener());
			 btn1.setBounds(100,80,100,50);
			 ma.add(btn1);
			 ma.add(btn2);
		     btn2.setBounds(300,80,100,50);
			 ma.setVisible(true);
			 btn1.setBounds(150, 60, 100, 50);
				btn2.setBounds(530, 60, 100, 50);
				ma.foodPanels[flag].add(btn1);
				ma.foodPanels[flag].add(btn2);
				ma.frame.add(ma.foodPanels[flag]);
				
		    
		
		btn1.setBounds(150, 60, 100, 50);
		btn2.setBounds(530, 60, 100, 50);
		confirm.setBounds(300, 150, 80, 40);
		cancel.setBounds(400, 150, 80, 40);
		ma.foodPanels[flag].add(btn1);
		ma.foodPanels[flag].add(btn2);
		ma.foodPanels[flag].add(confirm);
		ma.foodPanels[flag].add(cancel);
		ma.frame.add(ma.foodPanels[flag]);
	}

	public void finalFrame(int finalPrice, int flag) 
	{
		JFrame confirmfrm = new JFrame();
		confirmfrm.setSize(400,300);
		confirmfrm.setBackground(Color.white);
		
		JPanel confirmPanel = new JPanel();
		confirmPanel.setSize(400, 300);
		confirmPanel.setBackground(Color.white);
		//confirmPanel.setLayout(null);
		confirmPanel.setLayout(new BoxLayout(confirmPanel, BoxLayout.Y_AXIS));
		
		JPanel announce = new JPanel();
		//announce.setLayout(null);
		announce.setSize(400, 200);
		finalPrice = finalPrice + shu[flag].getTotalPrice();
		JLabel finalPriceOutput = new JLabel("����� ��� : " + finalPrice);
		finalPriceOutput.setBackground(Color.white);
		finalPriceOutput.setFont(new Font("���� ���", Font.PLAIN, 30));
		announce.add(finalPriceOutput);
		
		JPanel bottomAnnounce = new JPanel();
		bottomAnnounce.setSize(400, 100);
		
		// calFinish ��ư
		JButton calFinish = new JButton();
		calFinish.setBounds(300, 300, 200, 100);
		calFinish.add(new JLabel("Ȯ��(�� �����ּ���!)"));
		bottomAnnounce.add(calFinish);
		
		confirmPanel.add(announce);
		confirmPanel.add(bottomAnnounce);
		//confirmPanel.add(calFinish);
		
		confirmfrm.add(confirmPanel);
		confirmfrm.setVisible(true);
		//System.out.println(finalPrice);
		
		calFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shu[flag].setTotalPrice(0);
				shu[flag].amount = 0;
				confirmfrm.setVisible(false);
				//System.out.println("Calculation Completed!!");
			}
		});
	}

}
	