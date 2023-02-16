package program;

import java.io.IOException;
import java.util.Scanner;

import model.Usuario;
import service.GithubService;

public class Program {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

    	String username;

    	GithubService githubservice = new GithubService();

        try {
        	System.out.printf("Digite o usuário no github: ");
        	username = scanner.next();
        	
            Usuario userData = githubservice.getProfile(username);
           
            System.out.println(userData.showProfile() + "\n");
           
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        scanner.close();
    }
}


