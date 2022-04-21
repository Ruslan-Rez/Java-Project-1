package Project;
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class Words {
    public static void main(String[] args) {
        Alphabet one = new Alphabet(args[0].charAt(0),args);
        Alphabet two = new Alphabet(args[0].charAt(1),args);
        Alphabet three = new Alphabet(args[0].charAt(2),args);
        Alphabet four = new Alphabet(args[0].charAt(3),args);
        Alphabet five = new Alphabet(args[1].charAt(0),args);
        Alphabet six = new Alphabet(args[1].charAt(1),args);
        Alphabet seven = new Alphabet(args[1].charAt(2),args);
        Alphabet eight = new Alphabet(args[1].charAt(3),args);
        Alphabet nine = new Alphabet(args[1].charAt(4),args);
        Alphabet ten = new Alphabet(args[1].charAt(5),args);
        Alphabet eleven = new Alphabet(args[2].charAt(0),args);
        Alphabet twelve = new Alphabet(args[2].charAt(1),args);
        Alphabet thirteen = new Alphabet(args[2].charAt(2),args);
        Alphabet fourteen = new Alphabet(args[2].charAt(3),args);
        Alphabet fifteen = new Alphabet(args[2].charAt(4),args);
        Alphabet sixteen = new Alphabet(args[2].charAt(5),args);
        Alphabet[] alp = {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen};
        JFrame frame = new JFrame( "Centered Circle" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.add(new Canopy(alp));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        }

    }





