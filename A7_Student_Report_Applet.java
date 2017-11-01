//Incomplete. Java applets have now become obsolete and are no longer used


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import com.sun.xml.internal.ws.wsdl.writer.TXWContentHandler;

public class A7_Student_Report extends Applet implements ActionListener{
    Label lblTitle, lblRegNo, lblName, lblJava, lblSE, lblCA, lblBI, lblMP;
    TextField txtRegNo, txtName, txtJava, txtSE, txtCA, txtBI, txtMP;
    Button cmdReport;
    float total;
    float avg;
    public void init(){
        lblTitle=new Label("Enter Student Details");
        lblRegNo=new Label("Register No.");
        lblName=new Label("Name");

        txtRegNo=new TextField();
        txtName=new TextField();

        cmdReport=new Button("View Details")


    }

}