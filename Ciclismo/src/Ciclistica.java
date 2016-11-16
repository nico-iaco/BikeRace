/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Nicola-pc
 */
public class Ciclistica extends JPanel {
    int cordx;
    int cordy;
    Image img;
    public Ciclistica(int yy,int xx){
        cordx=0;
        cordy=yy;
        setSize(80,81);
        Toolkit tm=Toolkit.getDefaultToolkit();
        switch(xx){
            case 1:
                try{
                    img=ImageIO.read(new File("src/BICI1.JPG"));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 2:
                try{
                    img=ImageIO.read(new File("src/BICI2.JPG"));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 3:
                try{
                    img=ImageIO.read(new File("src/BICI3.JPG"));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 4:
                try{
                    img=ImageIO.read(new File("src/BICI4.JPG"));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 5:
                try{
                    img=ImageIO.read(new File("src/BICI5.JPG"));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 6:
                try{
                    img=ImageIO.read(new File("src/BICI6.JPG"));
                }
                catch(Exception e){
                    System.out.println(e);
                }
                break;
        }
        MediaTracker mt=new MediaTracker(this);
        mt.addImage(img,1);
        try{
            mt.waitForID(1);
        }
        catch(InterruptedException e){}
    }
    public void setCordx(int n){
        cordx=n;
    }
    public int getCordx(){
        return cordx;
    }
    public void paint(Graphics g){
        g.drawImage(img, cordx, cordy, null);
    }
}
