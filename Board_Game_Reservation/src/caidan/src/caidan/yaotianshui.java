package caidan;
import java.awt.*;
import java.awt.event.*;


public class yaotianshui {

		 static Frame frm=new Frame("My frist awt program ");
		 static Button btn1 = new Button("�����");
		 
		 static Button btn2 = new Button("����");
		
		 static Dialog dialog = new Dialog(frm,"My dialog");
		 static Label lab = new Label("�����ϼ���");
		 static Checkbox cb1 = new Checkbox("����������");
		 static Checkbox cb2 = new Checkbox("�Ƹ޸�ī��");
		 static Checkbox cb3 = new Checkbox("��ġ ");
		 static Checkbox cb4 = new Checkbox("ī���");
		 static Checkbox cb5 = new Checkbox("īǪġ��");
		 static Checkbox cb6 = new Checkbox("ī���ī");
		 static Checkbox cb7 = new Checkbox("ļ���ī���ī");
		 static Checkbox cb8 = new Checkbox("ī��񿣳�");
		 static Button btn3 = new Button("Ȯ��");
		 
		 static Dialog dialog2 = new Dialog(frm,"My dialog2");
		 static Label lab2 = new Label("�����ϼ���");
		 static Checkbox cb12 = new Checkbox("����Ÿ��Ʈ");
		 static Checkbox cb22 = new Checkbox("��Ű��");
		 static Checkbox cb32 = new Checkbox("��ƽ����");
		 static Checkbox cb42 = new Checkbox("ġ��Ÿ��Ʈ");
		 static Checkbox cb52 = new Checkbox("ġ�� ����ũ");
		 static Checkbox cb62 = new Checkbox("���� ����ũ");
		 static Checkbox cb72 = new Checkbox("�� ����Ʈ");
		 static Checkbox cb82 = new Checkbox("�ٹٷ��");
		 static Button btn4 = new Button("Ȯ��");
		 
		 
        static class MyListener implements ActionListener{
       	  public void actionPerformed(ActionEvent e) {
       		  Button btn = (Button) e.getSource();
       		  if(btn==btn2)
      			{
      			  dialog2.setLayout(null);
      			  dialog2.setSize(700,600);
      			  lab2.setBounds(225,50,150,20);
      			  dialog2.add(lab2);
      			  
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
     			  lab.setBounds(225,50,150,20);
     			  dialog.add(lab);
     			  
     			  btn3.setBounds(550,550,70,30);
     			  dialog.add(btn3);
     			 
     			  cb1.setBounds(200,100,100,50);
     			  dialog.add(cb1);
       		  cb2.setBounds(400,100,100,50);
       		  dialog.add(cb2);
       		  cb3.setBounds(200,200,100,50);
     			  dialog.add(cb3);
     			  cb4.setBounds(400,200,100,50);
    			  dialog.add(cb4);
    			  cb5.setBounds(200,300,100,50);
    			  dialog.add(cb5);
    			  cb6.setBounds(400,300,100,50);
    			  dialog.add(cb6);
    			  cb7.setBounds(200,400,100,50);
    			  dialog.add(cb7);
    			  cb8.setBounds(400,400,100,50);
    			  dialog.add(cb8);
       		  dialog.setVisible(true);
     			}
     			else if(btn==btn3)
     			{
     				dialog.setVisible(false);
     			}
        
       		 
       	  }
			 
		 }

		 public static void main(String[] args) {
		 frm.setLayout(null);
		 frm.setSize(500,200);
		 frm.setBackground(Color.yellow);
		 btn1.addActionListener(new MyListener());
		 btn3.addActionListener(new MyListener());
		 btn4.addActionListener(new MyListener());
		 btn2.addActionListener(new MyListener());
		 btn1.setBounds(100,80,100,50);
		 frm.add(btn1);
		 frm.add(btn2);
	     btn2.setBounds(300,80,100,50);
		 frm.setVisible(true);
	    
	 }
		 
	       
}

  


