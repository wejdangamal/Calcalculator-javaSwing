package calculator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Cal extends JFrame implements ActionListener{
    JPanel p;
    JFrame frame;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b13,b12,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32;
    JTextField f1;
     double result=0,a=0,b=0;
    int op=0;   
    public Cal(){  
      this.setTitle("Calcolator");
        this.setVisible(true);
        this.setSize(440,440);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(550,200);
        this.setResizable(false);
        JPanel p=new JPanel();
        this.setLayout(null);
        f1=new JTextField("0");
        f1.setBounds(5,5,getWidth()-30,70); this.add(f1);
        f1.setFont(new Font("bold",Font.BOLD,20));
        f1.setForeground(Color.BLACK);
         getContentPane().setBackground(Color.ORANGE);
        add(p);
        
        ////////////////////////
            b1=new JButton("1"); b2=new JButton("2"); b3=new JButton("3");
            b4=new JButton("4");  b5=new JButton("5");  b6=new JButton("6");
            b7=new JButton("7");  b8=new JButton("8");  b9=new JButton("9");
            b10=new JButton("0");  b11=new JButton("=");  b12=new JButton("+");  b13=new JButton("-");  b14=new JButton("*");  b15=new JButton("/");  b16=new JButton("off");
            b17=new JButton("del");  b18=new JButton(".");  b19=new JButton("+ / -");  b20=new JButton("C");
       ///////////////////////////////
        b1.setBounds(10,200,70,30); this.add(b1); b1.setBackground(Color.BLACK); b1.setForeground(Color.white); b1.setFont(new Font("bold",Font.BOLD,16));
        b2.setBounds(90,200,70,30); this.add(b2); b2.setBackground(Color.BLACK); b2.setForeground(Color.white); b2.setFont(new Font("bold",Font.BOLD,16));
        b3.setBounds(170,200,70,30); this.add(b3); b3.setBackground(Color.BLACK); b3.setForeground(Color.white); b3.setFont(new Font("bold",Font.BOLD,16));
        b12.setBounds(245,200,180,30); this.add(b12); b12.setBackground(Color.BLACK); b12.setForeground(Color.white); b12.setFont(new Font("bold",Font.BOLD,20));
       ////////////////////////
        b4.setBounds(10,235,70,30); this.add(b4); b4.setBackground(Color.BLACK); b4.setForeground(Color.white); b4.setFont(new Font("bold",Font.BOLD,16));
        b5.setBounds(90,235,70,30); this.add(b5); b5.setBackground(Color.BLACK); b5.setForeground(Color.white); b5.setFont(new Font("bold",Font.BOLD,16));
        b6.setBounds(170,235,70,30); this.add(b6); b6.setBackground(Color.BLACK); b6.setForeground(Color.white); b6.setFont(new Font("bold",Font.BOLD,16));
         b13.setBounds(245,235,180,30); this.add(b13); b13.setBackground(Color.BLACK); b13.setForeground(Color.white); b13.setFont(new Font("bold",Font.BOLD,20));
         /////
        b7.setBounds(10,270,70,30); this.add(b7); b7.setBackground(Color.BLACK); b7.setForeground(Color.white); b7.setFont(new Font("bold",Font.BOLD,16));
        b8.setBounds(90,270,70,30); this.add(b8); b8.setBackground(Color.BLACK); b8.setForeground(Color.white); b8.setFont(new Font("bold",Font.BOLD,16));
        b9.setBounds(170,270,70,30); this.add(b9); b9.setBackground(Color.BLACK); b9.setForeground(Color.white); b9.setFont(new Font("bold",Font.BOLD,16));
         b14.setBounds(245,270,180,30); this.add(b14); b14.setBackground(Color.BLACK); b14.setForeground(Color.white); b14.setFont(new Font("bold",Font.BOLD,20));
         //////////
        b19.setBounds(10,305,70,30); this.add(b19); b19.setBackground(Color.BLACK); b19.setForeground(Color.white); b19.setFont(new Font("bold",Font.BOLD,16));
        b10.setBounds(90,305,70,30); this.add(b10); b10.setBackground(Color.BLACK); b10.setForeground(Color.white); b10.setFont(new Font("bold",Font.BOLD,16));
        b11.setBounds(170,305,70,30); this.add(b11); b11.setBackground(Color.BLACK); b11.setForeground(Color.white); b11.setFont(new Font("bold",Font.BOLD,16));
        b15.setBounds(245,305,180,30); this.add(b15); b15.setBackground(Color.BLACK); b15.setForeground(Color.white); b15.setFont(new Font("bold",Font.BOLD,20));
        b16.setBounds(325,80,100,115); this.add(b16); b16.setBackground(Color.lightGray); b16.setForeground(Color.black); b16.setFont(new Font("bold",Font.BOLD,16));
        b17.setBounds(245,340,180,50); this.add(b17); b17.setBackground(Color.BLACK); b17.setForeground(Color.white); b17.setFont(new Font("bold",Font.BOLD,16));
        b18.setBounds(127,340,115,50); this.add(b18); b18.setBackground(Color.BLACK); b18.setForeground(Color.white); b18.setFont(new Font("bold",Font.BOLD,16));
        b20.setBounds(10,340,115,50); this.add(b20); b20.setBackground(Color.BLACK); b20.setForeground(Color.white); b20.setFont(new Font("bold",Font.BOLD,16));
        /////////////////////////////////////////////
        
        b21=new JButton("Sin(");  b22=new JButton("Cos(");  b23=new JButton("Tan(");  b24=new JButton("%");
        b25=new JButton("x^y");  b26=new JButton("x^2");  b27=new JButton("n!");  b28=new JButton("log");
        b29=new JButton("e");  b30=new JButton("1/x");  b31=new JButton("π");  b32=new JButton("√");
        ////////////////////////////
            b21.setBounds(10,80,70,30); this.add(b21); b21.setBackground(Color.darkGray); b21.setForeground(Color.white); b21.setFont(new Font("bold",Font.BOLD,16));
            b22.setBounds(10,115,70,30); this.add(b22); b22.setBackground(Color.darkGray); b22.setForeground(Color.white); b22.setFont(new Font("bold",Font.BOLD,16));
            b23.setBounds(90,80,70,30); this.add(b23); b23.setBackground(Color.darkGray); b23.setForeground(Color.white); b23.setFont(new Font("bold",Font.BOLD,16));
            b24.setBounds(90,115,70,30); this.add(b24); b24.setBackground(Color.darkGray); b24.setForeground(Color.white); b24.setFont(new Font("bold",Font.BOLD,16));
            b25.setBounds(170,80,70,30); this.add(b25); b25.setBackground(Color.darkGray); b25.setForeground(Color.white); b25.setFont(new Font("bold",Font.BOLD,16));
            b26.setBounds(170,115,70,30); this.add(b26); b26.setBackground(Color.darkGray); b26.setForeground(Color.white); b26.setFont(new Font("bold",Font.BOLD,16));
            b27.setBounds(250,80,70,30); this.add(b27); b27.setBackground(Color.darkGray); b27.setForeground(Color.white); b27.setFont(new Font("bold",Font.BOLD,16));
            b32.setBounds(250,115,70,30); this.add(b32); b32.setBackground(Color.darkGray); b32.setForeground(Color.white); b32.setFont(new Font("bold",Font.BOLD,16));
            b28.setBounds(10,153,70,40); this.add(b28); b28.setBackground(Color.darkGray); b28.setForeground(Color.white); b28.setFont(new Font("bold",Font.BOLD,16));
            b29.setBounds(90,153,70,40); this.add(b29); b29.setBackground(Color.darkGray); b29.setForeground(Color.white); b29.setFont(new Font("bold",Font.BOLD,16));
            b30.setBounds(170,153,70,40); this.add(b30); b30.setBackground(Color.darkGray); b30.setForeground(Color.white); b30.setFont(new Font("bold",Font.BOLD,16));
            b31.setBounds(250,153,70,40); this.add(b31); b31.setBackground(Color.darkGray); b31.setForeground(Color.white); b31.setFont(new Font("bold",Font.BOLD,16));
      ///////////////////////////////////////////////
               b1.addActionListener(this); 
               b2.addActionListener(this); 
               b3.addActionListener(this); 
               b4.addActionListener(this); 
               b5.addActionListener(this); 
               b6.addActionListener(this); 
               b7.addActionListener(this); 
               b8.addActionListener(this); 
               b9.addActionListener(this); 
               b10.addActionListener(this); 
               b11.addActionListener(this);
               b12.addActionListener(this);
               b13.addActionListener(this);
               b14.addActionListener(this);
               b15.addActionListener(this);
               b16.addActionListener(this);
               b17.addActionListener(this);
               b18.addActionListener(this);
               b19.addActionListener(this);
               b20.addActionListener(this);
               b21.addActionListener(this);
               b22.addActionListener(this);
               b23.addActionListener(this);
               b24.addActionListener(this);
               b25.addActionListener(this);
               b26.addActionListener(this);
               b27.addActionListener(this);
               b28.addActionListener(this);
               b29.addActionListener(this);
               b30.addActionListener(this);
               b31.addActionListener(this);
               b32.addActionListener(this);
               f1.addActionListener(this);
              
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       
       if(e.getSource()==b1){
           f1.setText(f1.getText().concat("1"));
           
       }
       if(e.getSource()==b2){
           f1.setText(f1.getText().concat("2"));
           
       }
         if(e.getSource()==b3){
           f1.setText(f1.getText().concat("3"));
           
       }
       if(e.getSource()==b4){
           f1.setText(f1.getText().concat("4"));
           
       }
        if(e.getSource()==b5){
           f1.setText(f1.getText().concat("5"));
           
       }
        if(e.getSource()==b6){
           f1.setText(f1.getText().concat("6"));
           
       }
         if(e.getSource()==b7){
           f1.setText(f1.getText().concat("7"));
           
       }
        if(e.getSource()==b8){
           f1.setText(f1.getText().concat("8"));
           
       }
         if(e.getSource()==b9){
           f1.setText(f1.getText().concat("9"));
           
       }
         if(e.getSource()==b10){
           f1.setText(f1.getText().concat("0"));
           
       }
         if(e.getSource()==b12){
            a=Double.parseDouble(f1.getText());
            op=1;
           f1.setText("");
       }
       if(e.getSource()==b13){
            a=Double.parseDouble(f1.getText());
            op=2;
            f1.setText("");
       }
       if(e.getSource()==b14){
            a=Double.parseDouble(f1.getText());
            op=3;
            f1.setText("");
       }
       if(e.getSource()==b15){
            a=Double.parseDouble(f1.getText());
            op=4;
            f1.setText("");
       }
       if(e.getSource()==b16){
           System.exit(0);
       }
         if(e.getSource()==b17){
             String s5=f1.getText();
             f1.setText("");
             for(int i=0;i<s5.length()-1;i++){
                 f1.setText(f1.getText()+s5.charAt(i));
             }
         }
         if(e.getSource()==b18){
           f1.setText(f1.getText().concat("."));
       }
         if(e.getSource()==b19){
              double a=Double.parseDouble(f1.getText());
              int num1=(int) a;
                     num1=num1*(-1);
                      f1.setText(""+num1);
         }
         if(e.getSource()==b20){
                      f1.setText("");
         }
       if(e.getSource()==b21){
           op=6;
       }
        if(e.getSource()==b22){
           op=7;
       }
         if(e.getSource()==b23){
            
           op=8;
           f1.setText("");
       }
          if(e.getSource()==b24){
            a=Double.parseDouble(f1.getText());
             
                   op=12;
                   f1.setText("");
                  
       }
          if(e.getSource()==b25){
             a=Double.parseDouble(f1.getText());
            
             op=13;
            f1.setText("");
           
         }
        if(e.getSource()==b26){
             a=Double.parseDouble(f1.getText());
              if (f1.getText().equals("")) {
				f1.setText("");
			} else {
				result = Math.pow(Double.parseDouble(f1.getText()), 2);
				f1.setText("");
				f1.setText(f1.getText()+a+"^2 =" + result);
			}
              
            
         }
         if(e.getSource()==b27){
             double a=Double.parseDouble(f1.getText());
             int r=(int) a;
             if(a>0){
             int iresult=1;
             for(int i=2;i<=a;i++){
                
                  iresult*=i;
             }
             
             f1.setText(""+r+"! ="+iresult);
             }
             else{
                 f1.setText("error");
             }
         }
         if(e.getSource()==b28){
           double a=Double.parseDouble(f1.getText());
           result=Math.log(a);
                    f1.setText(""+ result);
       }
         if(e.getSource()==b29){           
              double a=Double.parseDouble(f1.getText());           
             result=Math.E*a;           
                      f1.setText(""+result);
       }
          if(e.getSource()==b30){
           double num1=Double.parseDouble(f1.getText());
                    num1=1/num1;
                     f1.setText(""+num1);
       }
         if(e.getSource()==b31){
           double num1=Double.parseDouble(f1.getText());
                    num1=Math.PI*num1;
                     f1.setText(""+num1);
       }
         if(e.getSource()==b32){
            op=5;
            
       }
         
       if(e.getSource()==b11){
            b=Double.parseDouble(f1.getText());
            
            switch(op){
                case 1: result=a+b;
                      f1.setText(""+a+"+"+b+"="+result);
                break;

                case 2: result=a-b;
                     f1.setText(""+a+"-"+b+"="+result);
                break;

                case 3: result=a*b;
                      f1.setText(""+a+"*"+b+"="+result);
                break;

                case 4:
                    if(b!=0){
                        
                                result=a/b;
                                
                    f1.setText(""+a+"/"+b+"="+result);
                    
                    }
                    
                    else{
                         f1.setText("error");
                    }
                break;
                case 5:
                  if(b>0){
                      result=Math.sqrt(b);
                    f1.setText(""+"√"+b+"="+result);
                  }
                  else{
                       f1.setText("error");
                  }
                    break;
                case 6:
                    result=Math.sin(b);
                     f1.setText(""+"sin("+b+")"+"="+result);
                    break;
                case 7:
                    result=Math.cos(b);
                      f1.setText(""+"cos("+b+")"+"="+result);
                      break;
                case 8:
                    
                    result= Math.tan(b);
                      f1.setText(""+"tan("+b+")"+"="+result);
                      break;
                case 12:
                      b=Double.parseDouble(f1.getText());
                  int ans=0;
                       ans=(int) (a%b);                  
                    f1.setText(""+ans);
                   break;  
                case 13:
                    result=Math.pow(a, b);
                     f1.setText(""+a+"^"+b+"="+result);
                    break;
                default: result=0;
                        break;
            } } }
}
