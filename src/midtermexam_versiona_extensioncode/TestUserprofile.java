/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author kursad
 */
public class TestUserprofile {
    
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter User ID: ");
    String id = in.nextLine();
    
    System.out.print("Enter Genre (Comedy, Drama,Action, Mystery): ");
    String genre = in.nextLine();
    
    UserProfile user1 = new UserProfile(id, genre);
    
    System.out.println("User Profile Created");
    
    }
}
