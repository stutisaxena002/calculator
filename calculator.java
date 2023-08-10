import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.Math;

class calculator implements ActionListener,WindowListener {
	int k=0;
	int r=0;
    Frame f;
    JTextField txt;
    Font font;
    Color frameColor, txtColor;
    MenuBar mb;
    MenuItem m11, m12, m13, m14, m15, m16, m17, m18, m19, m110, ml1, ml2, ml3, m1a, m1b;
    Menu m1, m2, m3;
    Button MC, MR, MS, MPLUS, MMINUS, ARROW, CE, C, PLUSMINUS, ROOT, SEVEN, EIGHT, NINE, DIVIDE, PERCENT, FOUR, FIVE,
            SIX, MULTIPLY, MINUSPOWER, ONE, TWO, THREE, MINUS, PLUS, ZERO, EQUAL, POINT;
    String total;
    char sign;
    float num1, num2;
    boolean flag = false;

    calculator() {
        f = new Frame("Calculator");
        txt = new JTextField("0");
        font = new Font("Arial", 0, 20);
        Font font2 = new Font("Arial", 0, 25);
        frameColor = new Color(217, 228, 241);
        txtColor = new Color(239, 244, 252);
        mb = new MenuBar();
        total = new String();

        m1 = new Menu("View");
        m2 = new Menu("Edit");
        m3 = new Menu("Help");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        m11 = new MenuItem("Standard");
        m12 = new MenuItem("Scientific");
        m13 = new MenuItem("Programmer");
        m14 = new MenuItem("Statistics");
        m1a = new MenuItem("-");
        m15 = new MenuItem("History");
        m16 = new MenuItem("Digit grouping");
        m1b = new MenuItem("-");
        m17 = new MenuItem("Basic");
        m18 = new MenuItem("Unit conversion");
        m19 = new MenuItem("Date calcuation");
        m110 = new MenuItem("Worksheet");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m1a);
        m1.add(m15);
        m1.add(m16);
        m1.add(m1b);
        m1.add(m17);
        m1.add(m18);
        m1.add(m19);
        m1.add(m110);

        MC = new Button("MC");
        MR = new Button("MR");
        MS = new Button("MS");
        MPLUS = new Button("M+");
        MMINUS = new Button("M-");
        ARROW = new Button("\u2190");
        CE = new Button("CE");
        C = new Button("C");
        PLUSMINUS = new Button("\u00B1");
        ROOT = new Button("\u221A");
        SEVEN = new Button("7");
        EIGHT = new Button("8");
        NINE = new Button("9");
        DIVIDE = new Button("/");
        PERCENT = new Button("%");
        FOUR = new Button("4");
        FIVE = new Button("5");
        SIX = new Button("6");
        MULTIPLY = new Button("*");
        MINUSPOWER = new Button("1/x");
        ONE = new Button("1");
        TWO = new Button("2");
        THREE = new Button("3");
        MINUS = new Button("-");
        ZERO = new Button("0");
        POINT = new Button(".");
        PLUS = new Button("+");
        EQUAL = new Button("=");

        f.setLayout(null);

        txt.setBounds(25, 65, 350, 75);
        txt.setHorizontalAlignment(SwingConstants.RIGHT);
        txt.setFont(font2);

        MC.setBounds(25, 145, 66, 50);
        MR.setBounds(96, 145, 66, 50);
        MS.setBounds(167, 145, 66, 50);
        MPLUS.setBounds(238, 145, 66, 50);
        MMINUS.setBounds(309, 145, 66, 50);

        ARROW.setBounds(25, 200, 66, 50);
        CE.setBounds(96, 200, 66, 50);
        C.setBounds(167, 200, 66, 50);
        PLUSMINUS.setBounds(238, 200, 66, 50);
        ROOT.setBounds(309, 200, 66, 50);

        SEVEN.setBounds(25, 255, 66, 50);
        EIGHT.setBounds(96, 255, 66, 50);
        NINE.setBounds(167, 255, 66, 50);
        DIVIDE.setBounds(238, 255, 66, 50);
        PERCENT.setBounds(309, 255, 66, 50);

        FOUR.setBounds(25, 310, 66, 50);
        FIVE.setBounds(96, 310, 66, 50);
        SIX.setBounds(167, 310, 66, 50);
        MULTIPLY.setBounds(238, 310, 66, 50);
        MINUSPOWER.setBounds(309, 310, 66, 50);

        ONE.setBounds(25, 365, 66, 50);
        TWO.setBounds(96, 365, 66, 50);
        THREE.setBounds(167, 365, 66, 50);
        MINUS.setBounds(238, 365, 66, 50);

        ZERO.setBounds(25, 420, 137, 50);
        POINT.setBounds(167, 420, 66, 50);
        PLUS.setBounds(238, 420, 66, 50);

        EQUAL.setBounds(309, 365, 66, 105);

        f.add(txt);
        f.add(MC);
        f.add(MR);
        f.add(MS);
        f.add(MPLUS);
        f.add(MMINUS);

        MC.setFont(font);
        MR.setFont(font);
        MS.setFont(font);
        MPLUS.setFont(font);
        MMINUS.setFont(font);

        f.add(ARROW);
        f.add(CE);
        f.add(C);
        f.add(PLUSMINUS);
        f.add(ROOT);

        ARROW.setFont(font);
        CE.setFont(font);
        C.setFont(font);
        PLUSMINUS.setFont(font);
        ROOT.setFont(font);

        f.add(SEVEN);
        f.add(EIGHT);
        f.add(NINE);
        f.add(DIVIDE);
        f.add(PERCENT);

        SEVEN.setFont(font);
        EIGHT.setFont(font);
        NINE.setFont(font);
        DIVIDE.setFont(font);
        PERCENT.setFont(font);

        f.add(FOUR);
        f.add(FIVE);
        f.add(SIX);
        f.add(MULTIPLY);
        f.add(MINUSPOWER);

        FOUR.setFont(font);
        FIVE.setFont(font);
        SIX.setFont(font);
        MULTIPLY.setFont(font);
        MINUSPOWER.setFont(font);

        f.add(ONE);
        f.add(TWO);
        f.add(THREE);
        f.add(MINUS);

        ONE.setFont(font);
        TWO.setFont(font);
        THREE.setFont(font);
        MINUS.setFont(font);

        f.add(ZERO);
        f.add(POINT);
        f.add(PLUS);

        ZERO.setFont(font);
        POINT.setFont(font);
        PLUS.setFont(font);

        f.add(EQUAL);
        EQUAL.setFont(font);

        f.setBackground(frameColor);

        txt.setBackground(txtColor);

        ONE.addActionListener(this);
        TWO.addActionListener(this);
        THREE.addActionListener(this);
        FOUR.addActionListener(this);
        FIVE.addActionListener(this);
        SIX.addActionListener(this);
        SEVEN.addActionListener(this);
        EIGHT.addActionListener(this);
        NINE.addActionListener(this);
        PLUS.addActionListener(this);
        MINUS.addActionListener(this);
        MULTIPLY.addActionListener(this);
        DIVIDE.addActionListener(this);
        PLUSMINUS.addActionListener(this);
        ROOT.addActionListener(this);
        PERCENT.addActionListener(this);
        MINUSPOWER.addActionListener(this);
        POINT.addActionListener(this);
        C.addActionListener(this);
        EQUAL.addActionListener(this);
        f.addWindowListener(this);
        ZERO.addActionListener(this);
        CE.addActionListener(this);

        f.setMenuBar(mb);
        f.setSize(400, 490);
        f.setVisible(true);
        f.setResizable(false);
    }


    
    public void actionPerformed(ActionEvent e) {

        float content;
        Button b = (Button) e.getSource();
        content = Float.parseFloat(txt.getText());
        if (e.getSource() == PLUS) {
            num1 = content;
            sign = '+';
            k=1;

        }

        else if (e.getSource() == MINUS) {
            num1 = content;
            sign = '-';
            k=1;

        }

        else if (e.getSource() == MULTIPLY) {
            num1 = content;
            sign = '*';
            k=1;

        }

        else if (e.getSource() == DIVIDE) {
            num1 = content;
            sign = '/';
            k=1;

        }
        else if (e.getSource() == C) {
            txt.setText("0");
            k=0;
            r=0;

        }
        else if(e.getSource() == ROOT)
        {
        
            total = txt.getText();
            double d = Double.parseDouble(total);
            double result = Math.sqrt(d);
            total= "" + result;
            txt.setText(total);
        
            
        }
        else if(e.getSource() == POINT)
        {
            total = txt.getText();
            String point = ".";
            if(!total.contains(point))
            {
                total = txt.getText() + point;
                txt.setText(total);
            }
        }
        else if (e.getSource() == PERCENT) {
            num1 = content;
            sign = '%';
            k=1;

        }
        else if(e.getSource() == CE)
        {
            total = txt.getText();
            int len = total.length();
            if(len == 1)
            {
                total = "0";
                txt.setText(total);
            }
            else
                total = total.substring(0, len-1);
                txt.setText(total);
        }
        
        
        

        else if (b == EQUAL) {
            if (sign == '+') {
                num2 = num1 + content;
                total = "" + num2;
                txt.setText(total);
            } else if (sign == '-') {
                num2 = num1 - content;
                total = "" + num2;
                txt.setText(total);
            } else if (sign == '*') {
                num2 = num1 * content;
                total = "" + num2;
                txt.setText(total);
            } else if (sign == '/') {
                num2 = num1 / content;
                total = "" + num2;
                txt.setText(total);
            }else if (sign == '%') {
                num2 = (num1/100)*content;
                total = "" + num2;
                txt.setText(total);
            }
            
        }
    
        else{
        	if(k==1) {
        		if(r==0) {
        		total=b.getLabel();
        		txt.setText(total);
        		r=1;
        		}
        		else {
        			total = txt.getText()+b.getLabel();
                    txt.setText(total);
        		}
        	}
        	else {
        	
            if (txt.getText().equals("0")) {
                total = b.getLabel();
                txt.setText(total);
                

            }

            else {
            	
                total = txt.getText()+b.getLabel();
                txt.setText(total);
            }
        	}}
          
        }

    

    public void windowClosing(WindowEvent e) {

    	f.dispose();
    }

    public void windowClosed(WindowEvent e) {

    }

    public void windowOpened(WindowEvent e) {

    }

    public void windowIconified(WindowEvent e) {

    }

    public void windowDeiconified(WindowEvent e) {

    }

    public void windowActivated(WindowEvent e) {

    }

    public void windowDeactivated(WindowEvent e) {

    }

    public static void main(String args[]) {
        calculator a = new calculator();
    }

}