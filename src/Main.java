import javax.swing.*;
import java.awt.*;

public class Main {

    static JTextField textField = new JTextField();
    static String x="",y="",operation="";
    private static double calculator(){
        return switch (operation){
            case "+"->Double.parseDouble(x) + Double.parseDouble(y);
            case "-"->Double.parseDouble(x) - Double.parseDouble(y);
            case "*"->Double.parseDouble(x) * Double.parseDouble(y);
            case "/"->Double.parseDouble(x) / Double.parseDouble(y);
            default -> 0;
        };
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);

        JPanel panel1 = new JPanel(), panel2 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout(4,4,1,1));
        panel1.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        panel2.setBorder(BorderFactory.createEmptyBorder());

        JTextField textField = new JTextField();
        textField.setMaximumSize(new Dimension(300,30));


        JButton one = new JButton("1");

        JButton two = new JButton("2");

//        JButton three = new JButton("3");
//        addObject(three);
//        JButton four = new JButton("4");
//        addObject(four);
//        JButton five = new JButton("5");
//        addObject(five);
//        JButton six = new JButton("6");
//        addObject(six);
//        JButton seven = new JButton("7");
//        addObject(seven);
//        JButton eight = new JButton("8");
//        addObject(eight);
//        JButton nine = new JButton("9");
//        addObject(nine);
//        JButton zero = new JButton("0");
//        addObject(zero);
//        JButton plus = new JButton("+");
//        addObject(plus);
//        JButton minus = new JButton("-");
//        addObject(minus);
//        JButton divide = new JButton("/");
//        addObject(divide);
//        JButton times = new JButton("*");
//        addObject(times);
//        JButton equals = new JButton("=");
//        addObject(equals);
//        JButton reset = new JButton("C");
//        addObject(reset);

        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);







    }
}