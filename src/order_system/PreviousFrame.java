/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order_system;

/**
 *
 * @author User
 */
import javax.swing.JFrame;

public class PreviousFrame extends JFrame {
    private JFrame Home;

    public PreviousFrame(JFrame Home) {
        this.Home = Home;
    }

    public void goBackToHome() {
        this.setVisible(false); // Hide the current frame
        Home.setVisible(true); // Show the home page
    }
}
