package com.cg.iter.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cg.iter.entity.Author;
import com.cg.iter.service.AuthorService;
import com.cg.iter.service.AuthorServiceImpl;

public class AuthorMain {

	public static void main(String[] args) {
		AuthorService service = new AuthorServiceImpl();
		Scanner scan = new Scanner(System.in);
		try {
			while(true) {
			
				System.out.println(" Create Author ");
				System.out.println("1. Enter New Author");
				System.out.println("2. Update Author");
				System.out.println("3. Delete Author");
				System.out.println("4. Exit");
				System.out.println("Enter your choice");
				String choice = null;
				choice = scan.nextLine();
				switch(choice) {
					case "1":
						Author author = new Author();
						System.out.println("Enter firstname");
						author.setFirstName(scan.nextLine());
						System.out.println("Enter middlename");
						author.setMiddleName(scan.nextLine());
						System.out.println("Enter lastname");
						author.setLastName(scan.nextLine());
						System.out.println("Enter phone number");
						author.setPhoneNo(scan.nextLine());
						if(service.addAuthor(author)) {
							System.out.println("Author is added");
						}else {
							System.out.println("Author is not added");
						}
						break;
					case "2":
						System.out.println("Enter author id");
						Integer id = Integer.parseInt(scan.nextLine());
						author = service.findAuthor(id);
						if(author != null) {
							System.out.println("Author eixst");
							System.out.println(author.toString());
							Author temp = new Author();
							temp.setAuthorId(author.getAuthorId());
							System.out.println("Enter firstname");
							temp.setFirstName(scan.nextLine());
							System.out.println("Enter middlename");
							temp.setMiddleName(scan.nextLine());
							System.out.println("Enter lastname");
							temp.setLastName(scan.nextLine());
							System.out.println("Enter phone number");
							temp.setPhoneNo(scan.nextLine());
							if(service.updateAuthor(temp)!=null) {
								System.out.println("Author updated");
							}else {
								System.out.println("Author not updated");
							}
						}else {
							System.out.println("Author does not exist");
						}
						break;
					case "3":
						System.out.println("Enter author id");
						id = Integer.parseInt(scan.nextLine());
						if(service.deleteAuthor(id)) {
							System.out.println("Author deleted");
						}else {
							System.out.println("Author not deleted");
						}
						break;
					case "4":
						System.out.println("Exiting program");
						System.exit(0);
						break;
					default:
						System.out.println("Enter 1 to 4 only");
						break;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
