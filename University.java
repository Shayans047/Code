import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class University implements ActionListener {
    JFrame Frame;
    String name;

    static  String university="University of Central Punjab ";
    JPanel panel;
    JLabel labelOne=new JLabel(),labelTwo=new JLabel(),labelThree=new JLabel(),labelFour=new JLabel(),labelFive=new JLabel(),labelSix=new JLabel();
    JLabel labelSeven=new JLabel(),labelEight=new JLabel(),labelNine=new JLabel(),labelTen=new JLabel();
    JButton buttonOne,buttonTwo;
    JTextField textOne=new JTextField(),textTwo=new JTextField(),textThree=new JTextField(),textFour=new JTextField(),textFive=new JTextField();
    University(){
        Frame=new JFrame("GUI ");

        buttonOne=new JButton("Enter for Student data ");
        buttonTwo=new JButton("Enter for Teacher data ");
        labelThree.setText(" University management System By Shayan  ");
        Frame.add(labelThree);
        labelThree.setBounds(600,30, 1000,20);
        labelTen.setText("University Name : ");
        Frame.add(labelTen);
        labelTen.setBounds(1,60,200,20);
        textFive.setText(university);
        textFive.setEditable(false);
        textFive.setBounds(105,60,200,20);
        Frame.add(textFive);
        labelFour.setText("Enter Name :");
        Frame.add(labelFour);
        labelFour.setBounds(1,100,200,30);
        Frame.add(textOne);
        textOne.setBounds(80,100, 200,30);
        labelFive.setText("Enter age :");
        labelFive.setBounds(1,150,150,20);
        Frame.add(labelFive);
        Frame.add(textTwo);
        textTwo.setBounds(80,150,200,30);
        labelSeven.setText("Enter roll number : ");
        labelSeven.setBounds(1,200,150,30);
        Frame.add(labelSeven);
        Frame.add(textThree);
        textThree.setBounds(120,200,200,30);
        Frame.add(buttonOne);
        buttonOne.setBounds(600,250, 300,40);
        Frame.add(buttonTwo);
        buttonTwo.setBounds(600,300,300,50);
        Frame.add(labelEight);
        labelEight.setBounds(1,400,1000,20);
        Frame.add(labelOne);
        labelOne.setBounds(1,430,300,20);
        Frame.add(labelTwo);
        labelTwo.setBounds(2,460,300,30);
        Frame.add(labelSix);
        labelSix.setBounds(2,500,400,40);
        buttonOne.addActionListener( this);
        buttonTwo.addActionListener(this);
        Frame.setSize(400,400);
        Frame.setLayout(new BorderLayout());
        Frame.setVisible(true);
    }
    public static  void main(String [] args){
        new University();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttonOne) {
                name = textOne.getText();
                String temp;
                temp = textTwo.getText();
                int age;
                age = Integer.parseInt(temp);
                String rollNumber=textThree.getText();
                labelEight.setText("University name is : "+university);
                labelOne.setText("The name of student is :" + name);
                labelTwo.setText("The age of student :" + age);
                labelSix.setText("The Roll Number Of Student is : "+rollNumber);

        } else if (e.getSource()==buttonTwo)
        {
                name = textOne.getText();
            String temp = textTwo.getText();
               int age = Integer.parseInt(temp);
            String tempOne=textThree.getText();
            int id=Integer.parseInt(tempOne);
            labelSeven.setText("Enter ID :");
             labelEight.setText("University name is : "+university);
                labelOne.setText("The name of Teacher  is :" + name);
                labelTwo.setText("The age of Teacher  :" + age);
                labelSix.setText("The id of Teacher is :"+id);
            }
        }
    }


