
/**
 * Write a description of class TransportGUI here.
 *
 * @author (Rose Duwal)
 * @version (5 aug)
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;


public class TransportGUI implements ActionListener
{
    ArrayList <Vehicle> array = new ArrayList<Vehicle>();
    private JFrame frame,frame1;
    private JPanel panel,panel1,p1,p2,p3,p4,p5;
    private JLabel label_topic,lbl_1,lbl_2,lbl_3,lbl_4,lbl_5,lbl_6,lbl_7,lbl_8,lbl_9,lbl_10,lbl_11,lbl_12,lbl_13,topic,l1,l2,l3,
    l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    private JTextField f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,text11
    ,text12,text13,text14;
    private JButton add_a,dis,Book,clear,box,add_ele,add_elec, sell,clearr,go, goauto;
    private JComboBox js,js2,js3;
    

    
    public void f1(){
        //JFrame
        frame=new JFrame();
        frame.setLayout(null);
        frame.setBounds(0,0,700,650);
        
        
        //JPanel
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,1000,1000);
        
        p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(10,45,670,240);
        panel.add(p1);
        p1.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        
        
        p2=new JPanel();
        p2.setLayout(null);
        p2.setBounds(10,320,335,240);
        panel.add(p2);
        p2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        
        //JLabel 
        label_topic = new JLabel();
        label_topic.setText("AUTO-RICKSHAW");
        label_topic.setBounds(180,5,500,50);
        Font topic_font = new Font("Lucida Sans",Font.BOLD,30);
        label_topic.setFont(topic_font);
        panel.add(label_topic);
        
        //JLabel
        lbl_1 = new JLabel();
        lbl_1.setText("Vehicle Id:");
        Font ff =  new Font("Times New Roman",Font.PLAIN,20);
        lbl_1.setFont(ff);
        lbl_1.setBounds(30, 50, 185, 25);
        p1.add(lbl_1);
        
        lbl_2 = new JLabel();
        lbl_2.setText("Vehicle Weight: ");
        lbl_2.setFont(ff);
        lbl_2.setBounds(30, 85,185, 25);
        p1.add(lbl_2);
        
        lbl_3 = new JLabel();
        lbl_3.setText("Vehicle Speed: ");
        lbl_3.setFont(ff);
        lbl_3.setBounds(30,130, 185, 25);
        p1.add(lbl_3);
        
        lbl_4 = new JLabel();
        lbl_4.setText("Fuel Tank Capacity: ");
        lbl_4.setFont(ff);
        lbl_4.setBounds(30,170 ,185, 25);
        p1.add(lbl_4);
        
        lbl_5 = new JLabel();
        lbl_5.setText("Engine Displacement: ");
        lbl_5.setFont(ff);
        lbl_5.setBounds(30,210,390,25);
        p1.add(lbl_5);
        
        lbl_6 = new JLabel();
        lbl_6.setText("Vehicle Name:");
        lbl_6.setFont(ff);
        lbl_6.setBounds(370,35,180,50);
        p1.add(lbl_6);
        
        lbl_7 = new JLabel();
        lbl_7.setText("Vehicle Color: ");
        lbl_7.setFont(ff);
        lbl_7.setBounds(370,70,160,50);
        p1.add(lbl_7);
        
        lbl_8 = new JLabel();
        lbl_8.setText("Torque: ");
        lbl_8.setFont(ff);
        lbl_8.setBounds(370,115,500,50);
        p1.add(lbl_8);
        
        lbl_9 = new JLabel();
        lbl_9.setText("Ground Clerance:");
        lbl_9.setFont(ff);
        lbl_9.setBounds(370,155,160,50);
        p1.add(lbl_9);
        
        
        
        lbl_10 = new JLabel();
        lbl_10.setText("Vehicle ID: ");
        lbl_10.setFont(ff);
        lbl_10.setBounds(30,10,160,80);
        p2.add(lbl_10);
        
        lbl_11 = new JLabel();
        lbl_11.setText("No. of Seats: ");
        lbl_11.setFont(ff);
        lbl_11.setBounds(30,40,160,80);
        p2.add(lbl_11);
        
        lbl_12 = new JLabel();
        lbl_12.setText("Charge Amount:");
        lbl_12.setFont(ff);
        lbl_12.setBounds(30,70,160,80);
        p2.add(lbl_12);
        
        lbl_13 = new JLabel();
        lbl_13.setText("Booked Date:");
        lbl_13.setFont(ff);
        lbl_13.setBounds(30,100,160,80);
        p2.add(lbl_13);
        
        //Set the color
      
        Color c=new Color(194, 194, 239 );
        p1.setBackground(c);
        p2.setBackground(c);
        
        Color co=new Color(230, 230, 255);
        panel.setBackground(co);
        
        //JTextField
        f1= new JTextField();
        f1.setBounds(210, 50,120, 20);
        p1.add(f1);
        
        f2 = new JTextField();
        f2.setBounds(210,90,120,20);
        p1.add(f2);
        
        f3 = new JTextField();
        f3.setBounds(210, 135,120, 20);
        p1.add(f3);
        
        f4= new JTextField();
        f4.setBounds(210,175,120,20);
        p1.add(f4);
        
        f5 = new JTextField();
        f5.setBounds(210,210,120,20);
        p1.add(f5);
        
        f6= new JTextField();
        f6.setBounds(520,50,120,20);
        p1.add(f6);
        
        f7 = new JTextField();
        f7.setBounds(520,85, 120,20);
        p1.add(f7);
        
        f8 = new JTextField();
        f8.setBounds(520,130, 120,20);
        p1.add(f8);
        
        f9 = new JTextField();
        f9.setBounds(520,173,120,20);
        p1.add(f9);
        
        f10 = new JTextField();
        f10.setBounds(170,40,120,20);
        p2.add(f10);
        
        f11= new JTextField();
        f11.setBounds(170,70,120,20);
        p2.add(f11);
        
        f12 = new JTextField();
        f12.setBounds(170,100,120,20);
        p2.add(f12);
        
        
        //JButton
        
        add_a =new JButton();
        add_a.setText ("Add an AutoRickshaw");
        add_a.setBounds(390,210,200,25);
        p1.add(add_a);
        add_a.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        add_a.addActionListener(this);
        
        dis=new JButton();
        dis.setText ("Display");
        dis.setBounds(400,380,80,35);
        dis.addActionListener(this);
        panel.add(dis);
        
         
    
        Book =new JButton();
        Book.setText ("Book an AutoRickshaw");
        Book.setBounds(60,180,180,25);
        Book.addActionListener(this);
        p2.add(Book);
        
        clear =new JButton();
        clear.setText ("Clear");
        clear.setBounds(600,380,80,35);
        clear.addActionListener(this);
        panel.add(clear);
        
        box=new JButton();
        box.setText("Go to electric scooter");
        box.setBounds(460,460,180,35);
        box.addActionListener(this);
        panel.add(box);
        
        //JComboBox
        String[] years={"2020","2021","2022","2023","2024","2025"};
        
        js=new JComboBox(years);
        js.setBounds(160,135,60,20);
        p2.add(js);
        
        String[] month={"January","February","March","April","May","June","July","August","September","October","November"
        ,"December"};
        js2=new JComboBox(month);
        js2.setBounds(220,135,60,20);
        p2.add(js2);
        
        String[] Day={"1","2","3","4","5","6","7","8","9","10"};
        js3= new JComboBox(Day);
        js3.setBounds(280,135,55,20);
        p2.add(js3);
        
        frame.add(panel);
        panel.add(p2);
        panel.add(p1);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public void f2(){
        //JFrame
        frame1=new JFrame();
        frame1.setLayout(null);
        frame1.setBounds(0,0,870,600);
        
        //JPanel
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(0,0,1500,1500);
        
        //JLabel 
        topic = new JLabel();
        topic.setText("Electric-Scooter");
        topic.setBounds(280,5,500,50);
        Font topic_font = new Font("Lucida Sans",Font.BOLD,30);
        topic.setFont(topic_font);
        panel1.add(topic);
        
        //Jpanel for p3
        p3 = new JPanel();
        p3.setBounds(10, 50, 400, 350);
        p3.setLayout(null);
        panel1.add(p3);
        p3.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        
        //JPanel for p4
        p4 = new JPanel();
        p4.setBounds(450, 50, 400, 350);
        p4.setLayout(null);
        panel1.add(p4);
        p4.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));

        //JPanel for p5
        p5 = new JPanel();
        p5.setBounds(10, 410, 400, 150);
        p5.setLayout(null);
        panel1.add(p5);
        p5.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
        
        
        
        //JLabel
        l1 = new JLabel();
        l1.setText("Vehicle Id:");
        Font ff =  new Font("Times New Roman",Font.PLAIN,20);
        l1.setFont(ff);
        l1.setBounds(30,60, 185, 25);
        p3.add(l1);
        
        l2 = new JLabel();
        l2.setText("Vehicle Name: ");
        l2.setFont(ff);
        l2.setBounds(30,90,185, 25);
        p3.add(l2);
        
        l3 = new JLabel();
        l3.setText("Vehicle Color: ");
        l3.setFont(ff);
        l3.setBounds(30,125, 185, 25);
        p3.add(l3);
        
        l4 = new JLabel();
        l4.setText("Vehicle Weight: ");
        l4.setFont(ff);
        l4.setBounds(30,160,185, 25);
        p3.add(l4);
        
        l5 = new JLabel();
        l5.setText("Vehicle Speed: ");
        l5.setFont(ff);
        l5.setBounds(30,195,185,25);
        p3.add(l5);
        
        l6 = new JLabel();
        l6.setText("Battery Capacity:");
        l6.setFont(ff);
        l6.setBounds(30,210,185,50);
        p3.add(l6);
        
        l7 = new JLabel();
        l7.setText("Vehicle ID:"); 
        l7.setFont(ff);
        l7.setBounds(30,60,185,25);
        p4.add(l7);
        
        l8 = new JLabel();
        l8.setText("Brand: ");
        l8.setFont(ff);
        l8.setBounds(30,90,185, 25);
        p4.add(l8);
        
        l9 = new JLabel();
        l9.setText("Price: ");
        l9.setFont(ff);
        l9.setBounds(30,120,185,25);
        p4.add(l9);
        
        l10 = new JLabel();
        l10.setText("Charging Time:");
        l10.setFont(ff);
        l10.setBounds(30,150,185,25);
        p4.add(l10);
        
        l11 = new JLabel();
        l11.setText("Mileage ");
        l11.setFont(ff);
        l11.setBounds(30,180,185,25);
        p4.add(l11);
        
        l12 = new JLabel();
        l12.setText("Range: ");
        l12.setFont(ff);
        l12.setBounds(30,210,185,25);
        p4.add(l12);
        
        l13 = new JLabel();
        l13.setText("Vehicle ID:");
        l13.setFont(ff);
        l13.setBounds(30,30,185,25);
        p5.add(l13);
        
        l14 = new JLabel();
        l14.setText("Price: ");
        l14.setFont(ff);
        l14.setBounds(30,60,185,25);
        p5.add(l14);
        
        
        
        
        //JTextField
        text1= new JTextField();
        text1.setBounds(210,60,120, 20);
        p3.add(text1);
        
        text2 = new JTextField();
        text2.setBounds(210,90,120,20);
        p3.add(text2);
        
        text3= new JTextField();
        text3.setBounds(210,130,120, 20);
        p3.add(text3);
        
        text4= new JTextField();
        text4.setBounds(210,165,120,20);
        p3.add(text4);
        
        text5 = new JTextField();
        text5.setBounds(210,200,120,20);
        p3.add(text5);
        
        text6= new JTextField();
        text6.setBounds(210,230,120,20);
        p3.add(text6);
        
        text7= new JTextField();
        text7.setBounds(210,60,120, 20);
        p4.add(text7);
        
        text8 = new JTextField();
        text8.setBounds(210,90,120,20);
        p4.add(text8);
        
        text9= new JTextField();
        text9.setBounds(210,120,120, 20);
        p4.add(text9);
        
        text10= new JTextField();
        text10.setBounds(210,150,120,20);
        p4.add(text10);
        
        text11 = new JTextField();
        text11.setBounds(210,180,120,20);
        p4.add(text11);
        
        text12= new JTextField();
        text12.setBounds(210,210,120,20);
        p4.add(text12);
        
        text13= new JTextField();
        text13.setBounds(210,30,120,20);
        p5.add(text13);
        
        text14= new JTextField();
        text14.setBounds(210,60,120,20);
        p5.add(text14);
        
        
        //Jbutton
        add_ele =new JButton();
        add_ele.setText ("Add Electric-Scooter");
        add_ele.setBounds(80,280,180,25);
        add_ele.addActionListener(this);
        p3.add(add_ele);
        
        add_elec =new JButton();
        add_elec.setText ("Purchase Electric-Scooter");
        add_elec.setBounds(100,270,185,25);
        add_elec.addActionListener(this);
        p4.add(add_elec);
        
        sell =new JButton();
        sell.setText ("Sell Electric-Scooter");
        sell.setBounds(80,90,185,25);
        sell.addActionListener(this);
        p5.add(sell);
        
        clearr =new JButton();
        clearr.setText ("Clear");
        clearr.setBounds(550,420,185,25);
        clearr.addActionListener(this);
        panel1.add(clearr);
        
        goauto =new JButton();
        goauto.setText ("Go back to Auto-Rickshaw");
        goauto.setBounds(550,470,190,25);
        goauto.addActionListener(this);
        panel1.add(goauto);
        
        go = new JButton();
        go.setText ("Display");
        go.setBounds(550,520,190,25);
        go.addActionListener(this);
        panel1.add(go);
        
        
        
        //Set the color
        Color cc=new Color(102, 153, 153);
        p3.setBackground(cc);
        p4.setBackground(cc);
        p5.setBackground(cc);
        
        Color co=new Color(230, 242, 255);
        panel1.setBackground(co);
        
        
        panel1.add(p3);
        panel1.add(p4);
        panel1.add(p5);
        frame1.add(panel1);
        frame1.setResizable(false);
        frame1.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        //Button of Auto Rickshaw
        if(e.getSource() == add_a){
            //add function
            try{
                int vehicleID = Integer.valueOf(f1.getText());
                String vehicleName = f6.getText();
                String vehicleColor = f7.getText();
                String vehicleWeight = f2.getText();
                String vehicleSpeed = f3.getText();
                int engineDisplacement = Integer.valueOf(f5.getText());
                String torque = f8.getText();
                int fuelTankCapacity = Integer.valueOf(f4.getText());
                String groundClearance = f9.getText();
                
                boolean present = false;
                for(Vehicle obj: array){
                    if(obj.getVehicle() == vehicleID){
                        present = true;
                    }
                }
                
                if(present == true){
                    JOptionPane.showMessageDialog(frame, "Already added");
                }else{
                    AutoRickshaw auto = new AutoRickshaw(vehicleID, vehicleName, vehicleColor, vehicleWeight, vehicleSpeed, engineDisplacement, torque, fuelTankCapacity, groundClearance);
                    array.add(auto);
                    JOptionPane.showMessageDialog(frame, "Added Successfully");
                }
                
    
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(frame, "Enter valid data");
            }
        }
        
        
        else if(e.getSource() == clear){
            //clear function
            f1.setText("");
            f2.setText("");
            f3.setText("");
            f4.setText("");
            f5.setText("");
            f6.setText("");
            f7.setText("");
            f8.setText("");
            f9.setText("");
            f10.setText("");
            f11.setText("");
            f12.setText("");
            
        }else if(e.getSource()== Book){
            //book function auto Rickshaw
              try{
               int vehicleID = Integer.valueOf(f10.getText());
               String year = String.valueOf(js.getSelectedItem());
               String month = String.valueOf(js2.getSelectedItem());
               String day = String.valueOf(js3.getSelectedItem());
               String bookedDate = year + month + day;
               int chargeAmount = Integer.valueOf(f11.getText());
               int numberOfSeats = Integer.valueOf(f12.getText());
               
               boolean present = false;
               for(Vehicle obj: array){
                   if(obj instanceof AutoRickshaw){
                       AutoRickshaw auto = (AutoRickshaw) obj;
                       if(auto.getVehicle() == vehicleID){
                           if(auto.getIsBooked() == false){
                               auto.Book(bookedDate, chargeAmount, numberOfSeats);
                               JOptionPane.showMessageDialog(frame, "AutoRickshaw has been booked!");
                               
                            }else{
                                JOptionPane.showMessageDialog(frame, "AutoRickshaw has already been booked!");
                            }
                            present = true;
                            break;
                       }
                   }
                }
               
               if(present == false){
                           JOptionPane.showMessageDialog(frame, "AutoRickshaw with this ID is not with us");
                   }
           }
           catch(NumberFormatException n){
               JOptionPane.showMessageDialog(frame, "Enter valid data!!!");
            }
           
       }else if(e.getSource() == clear){
           //clear book function
           f10.setText("");
           f11.setText("");
           f12.setText("");
           
       }else if(e.getSource() == dis){
           //display function// Dis is button of Display button
           for(Vehicle obj:array){
               if(obj instanceof AutoRickshaw){
                   AutoRickshaw auto = (AutoRickshaw) obj;
                   auto.display();
                   System.out.println("");
               }
           }
           
       }else if(e.getSource() == box){
           //Switch to electric scooter//box is button of switch to electric scooter
           f2();
           frame.setVisible(false);
           
        }
        //Electric scooter buttons//
        
    else if(e.getSource()== dis){
            //display function//dis is button of display of autorickshaw
            for(Vehicle obj:array){
                if(obj instanceof AutoRickshaw){
                    AutoRickshaw auto=(AutoRickshaw) obj;
                    auto.display();
                    System.out.println("");
                }
            }
        
        }
        
        // button fo electric scooter
        if(e.getSource() == add_ele ){
            //add elescooter
             try{
                int vehicleID = Integer.valueOf(text1.getText());
                String vehicleName = text2.getText();
                String vehicleColor = text3.getText();
                String vehicleWeight =text4.getText();
                String vehicleSpeed = text5.getText();
                int BatteryCapacity = Integer.valueOf(text6.getText());
                
                boolean present = false;
                for(Vehicle obj: array){
                    if(obj.getVehicle() == vehicleID){
                        present = true;
                    }
                }
                
                if(present == true){
                    JOptionPane.showMessageDialog(frame1, "Already added");
                }else{
                    ElectricScooter auto = new ElectricScooter(vehicleID, vehicleName, vehicleColor, vehicleWeight, vehicleSpeed, BatteryCapacity);
                    array.add(auto);
                    JOptionPane.showMessageDialog(frame1, "Added Successfully");
                }
                
                }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(frame1, "Enter valid data");
            }
        }
        else if(e.getSource() == clearr){
            //clear function
            text1.setText("");
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");
            text8.setText("");
            text9.setText("");
            text10.setText("");
            text11.setText("");
            text12.setText("");
            text13.setText("");
            text14.setText("");
            
        }
        else if(e.getSource() == add_elec){
            //purchase ele scooter
            try{
               int vehicleID = Integer.valueOf(text7.getText());
               String brand = text8.getText();
               int price = Integer.valueOf(text9.getText());
               String chargingTime = text10.getText();
               String mileage = text11.getText();
               int range = Integer.valueOf(text12.getText());
               
               boolean present = false;
               for(Vehicle obj: array){
                   if(obj instanceof ElectricScooter){
                       ElectricScooter ele = (ElectricScooter) obj;
                       if(ele.getVehicle() == vehicleID){
                           if(ele.getHasPurchased() == false){
                               ele.purchase(brand, price, chargingTime, mileage, range);
                               JOptionPane.showMessageDialog(frame, "ElectricScooter has been purchased!");
                               
                            }else{
                                JOptionPane.showMessageDialog(frame, "ElectricScooter has already been purchased!");
                            }
                            present = true;
                            break;
                       }
                   }
                }
               
               if(present == false){
                           JOptionPane.showMessageDialog(frame, "ElectricScooter with this ID is not with us");
                   }
           }
           catch(NumberFormatException n){
               JOptionPane.showMessageDialog(frame, "Enter valid data!!!");
            }
        }
        else if(e.getSource() == sell){
            //Sell electric scooter
            try{
               int vehicleID = Integer.valueOf(text13.getText());
               int price = Integer.valueOf(text14.getText());
               
               boolean present = false;
               for(Vehicle obj: array){
                   if(obj instanceof ElectricScooter){
                       ElectricScooter ele = (ElectricScooter) obj;
                       if(ele.getVehicle() == vehicleID){
                           if(ele.getHasSold() == false){
                               ele.sell(price);
                               JOptionPane.showMessageDialog(frame, "ElectricScooter has been Sold!");
                               
                            }else{
                                JOptionPane.showMessageDialog(frame, "ElectricScooter has already been Sold!");
                            }
                            present = true;
                            break;
                       }
                   }
                }
               
               if(present == false){
                           JOptionPane.showMessageDialog(frame, "ElectricScooter with this ID is not with us");
                   }
           }
           catch(NumberFormatException n){
               JOptionPane.showMessageDialog(frame, "Enter valid data!!!");
            }
        }
        
        else if(e.getSource() == goauto){
            //goto to auto Riskchaw
            f1();
            frame1.setVisible(false);
        }
        else if(e.getSource() == go){
            //display
            for(Vehicle obj:array){
                if(obj instanceof ElectricScooter){
                    ElectricScooter auto=(ElectricScooter) obj;
                    auto.display();
                    System.out.println("");
                }
            }
        }
        }
        public static void main(String[] args){
            TransportGUI objGUI= new TransportGUI();
            objGUI.f1();
            
            
            
        }
    }


    
    
    
    

