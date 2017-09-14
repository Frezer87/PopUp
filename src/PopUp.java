import javax.swing.JOptionPane;

public class PopUp {
    public static void main(String[] args) {
        String a,b,c;
        a=JOptionPane.showInputDialog("Enter your Full Name");
        b=JOptionPane.showInputDialog("Enter your NOVA user name or email addrese");
        c=JOptionPane.showInputDialog("Enter Your NOVA ID. Number");
        JOptionPane.showMessageDialog(null, "Hi " + a + " " +"Wellcome to NOVA Community Collage's Website!");
    }

}
