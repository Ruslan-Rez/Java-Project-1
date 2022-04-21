package Project;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

public class Canopy extends JPanel
{
    private Alphabet[]alp;
    public Canopy(Alphabet[] alp){
        this.alp = alp;
        setPreferredSize( new Dimension(650, 650) );

    }




    protected Point2D pointAt(double radians, double radius) {
        double x = radius * Math.cos(radians);
        double y = radius * Math.sin(radians);

        return new Point2D.Double(x, y);
    }

    protected Point2D translate(Point2D point, Point2D to) {
        Point2D newPoint = new Point2D.Double(point.getX(), point.getY());
        newPoint.setLocation(point.getX() + to.getX(), point.getY() + to.getY());
        return newPoint;
    }

    public void paintComponent ( Graphics gr  )
    {

        super.paintComponent(gr);
        List<String> words = new ArrayList<>();
        words.add(String.valueOf(alp[0]));
        words.add(Integer.toString(alp[0].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[0].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[1]));
        words.add(Integer.toString(alp[1].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[1].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[2]));
        words.add(Integer.toString(alp[2].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[2].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[3]));
        words.add(Integer.toString(alp[3].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[3].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[4]));
        words.add(Integer.toString(alp[4].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[4].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[5]));
        words.add(Integer.toString(alp[5].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[5].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[6]));
        words.add(Integer.toString(alp[6].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[6].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[7]));
        words.add(Integer.toString(alp[7].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[7].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[8]));
        words.add(Integer.toString(alp[8].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[8].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[9]));
        words.add(Integer.toString(alp[9].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[9].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[10]));
        words.add(Integer.toString(alp[10].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[10].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[11]));
        words.add(Integer.toString(alp[11].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[11].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[12]));
        words.add(Integer.toString(alp[12].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[12].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[13]));
        words.add(Integer.toString(alp[13].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[13].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[14]));
        words.add(Integer.toString(alp[14].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[14].AlphabetNumber())).replace(' ','0'));
        words.add(String.valueOf(alp[15]));
        words.add(Integer.toString(alp[15].AlphabetNumber()));
        words.add(String.format("%7s",Integer.toBinaryString(alp[15].AlphabetNumber())).replace(' ','0'));


        Graphics2D g2d = (Graphics2D) gr.create();
        g2d.setColor(Color.BLACK);

        double startAngle = 0;
        double divisions = 80;
        double delta = 360.0 / divisions;


        int cntrX = getWidth()/2;
        int cntrY = getHeight()/2;

        int radius = getWidth()/3;
        int a = getWidth()/4;
        int b = getWidth()/7;
        int c = getWidth()/22;

        gr.drawOval( cntrX-radius, cntrY-radius, radius*2, radius*2 );
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,85,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,130,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,175,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,220,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,265,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,310,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,355,14);
        gr.fillArc(cntrX-radius,cntrY-radius,radius*2,radius*2,400,14);

        gr.drawOval( cntrX-b, cntrY-b, b*2, b*2 );

        int k = 0;

     for(int y = 0;y<8;y++) {
         for (int i = 32; i < 48; i = i + 3) {
             String gh = words.get(i);
             for (int j = 0; j < 7; j++) {

                 char n = (gh.charAt(j));

                 if (n == '1') {
                     gr.setColor(Color.RED);
                 } else if (n == '0') {
                     gr.setColor(Color.YELLOW);
                 }
                 gr.fillArc(cntrX - radius, cntrY - radius, radius * 2, radius * 2, k , 5);
                 k = k + 5;
             }


         }
       k = k+50;
     }
        gr.setColor(Color.DARK_GRAY);
        gr.fillArc(cntrX - radius, cntrY - radius, radius * 2, radius * 2,230,150);
     int g = 90;
        for(int y = 0;y<7;y++) {
            for (int i = 14; i < 30; i = i + 3) {
                String gh = words.get(i);
                for (int j = 0; j < 7; j++) {

                    char n = (gh.charAt(j));

                    if (n == '1') {
                        gr.setColor(Color.RED);
                    } else if (n == '0') {
                        gr.setColor(Color.YELLOW);
                    }
                    gr.fillArc(cntrX -a, cntrY - a, a * 2, a * 2, g, 5);
                    g = g + 5;
                }


            }
            g= g+50;
        }
        gr.setColor(Color.DARK_GRAY);
        gr.fillArc(cntrX - a, cntrY - a, a * 2, a * 2,60,150);
        gr.setColor(Color.BLACK);
        gr.drawOval( cntrX-a, cntrY- a, a*2, a*2 );
        int f = 270;
        for(int y = 0;y<7;y++) {
            for (int i = 2; i < 12; i = i + 3) {
                String gh = words.get(i);
                for (int j = 0; j < 7; j++) {

                    char n = (gh.charAt(j));

                    if (n == '1') {
                        gr.setColor(Color.RED);
                    } else if (n == '0') {
                        gr.setColor(Color.YELLOW);
                    }
                    gr.fillArc(cntrX -b, cntrY - b, b * 2, b * 2, f, 5);
                    f = f + 5;
                }


            }
            f= f+50;
        }
        gr.setColor(Color.DARK_GRAY);
        gr.fillArc(cntrX - b, cntrY - b, b * 2, b * 2,-80,230);
        gr.setColor(Color.BLACK);
        gr.drawOval( cntrX-b, cntrY-b, b*2, b*2 );
        gr.setColor(Color.BLACK);
        gr.fillOval(cntrX - c,cntrY-c,c*2,c*2);



        Point2D centerPoint = new Point2D.Double(cntrX, cntrY);
        double angle = startAngle;
        for (int index = 0; index < divisions; index++) {
            Point2D point = pointAt(Math.toRadians(angle), radius);
            point = translate(point, centerPoint);
            g2d.draw(new Line2D.Double(centerPoint, point));
            angle += delta;
        }


    }
}





