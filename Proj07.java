/*File Proj07.java Copyright 2002 R.G.Baldwin
The purpose of this assignment is to assess the student's
ability to write a Swing program handling mouse events on
a JFrame object containing a JPanel object.
Revised: 10/29/22
**********************************************************/
import javax.swing.*;
import java.awt.*;
public class Proj07 {
    public static void main(String[] args){
        Proj07Runner theRunner = new Proj07Runner();
        JFrame theJFrame = theRunner.getJFrame();
        System.out.println(
                "The JFrame width = " + theJFrame.getWidth());
        System.out.println(
                "The JFrame height = " + theJFrame.getHeight());
        Insets JFrameInsets = theJFrame.getInsets();
        System.out.println("JFrame insets");
        System.out.println(
                JFrameInsets.top + ", " +JFrameInsets.left + ", " +
                        JFrameInsets.right + ", " + JFrameInsets.bottom);

        JPanel theJPanel = theRunner.getJPanel();
        System.out.println(
                "The JPanel width = " + theJPanel.getWidth());
        System.out.println(
                "The JPanel height = " + theJPanel.getHeight());
        Insets JPanelInsets = theJPanel.getInsets();
        System.out.println("JPanel insets");
        System.out.println(
                JPanelInsets.top + ", " +JPanelInsets.left + ", " +
                        JPanelInsets.right + ", " + JPanelInsets.bottom);
    }//end main
}//end class Proj07
//=======================================================//