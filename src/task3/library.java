package task3;
import java.util.*;
public class library {
	private book[] books;
	private int capacity;
	private int size;
	
	public library(int capacity) {
		
		this.capacity = capacity;
		this.books = new book[capacity];
		this.size = 0;
	}
	
	public void addbook(book book) {
		if(size<capacity) {
			books[size]=book;
			size++;
			System.out.println("Book Added successfully! ");
		} else {
			System.out.println("Library is full.can't add books!!");			
		}
	}
	
	public void  removebook(int bookid) {
		for(int i=0;i<size;i++) {
			if(books[i].getBookid()==bookid) {
				for(int j=i;j<size-1;j++) {
					books[j]=books[j+1];
				}
				books[size-1]=null;
				size--;
				System.out.println("Book removed successfully!!");
				return;
			}
		}
	}
	
	public void searchbook(int bookid) {
		for(int i=0;i<size;i++) {
			if(books[i].getBookid()==bookid) {
				System.out.println("Book found :");
				displaybook(i);
				return;
			}
		}
		System.out.println("Bookid"+bookid+"not found");
	}
	
	public void displaybooks() {
		if(size==0) {
			System.out.println("Library is empty!!");
			return;
		}else {
			System.out.println("\t Books in Library :");
			for(int i=0;i<size;i++) {
				displaybook(i);
			}
		}
		
	}
	
	public void displaybook(int index) {
		book book=books[index];
		System.out.println("Book ID :"+book.getBookid());
		System.out.println("Title :"+book.getTitle());
		System.out.println("Author :"+book.getAuthor());
		System.out.println("Available :"+(book.isIsavailable()? "yes" : "no"));
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		library library=new library(10);
		
		while(true) {
			System.out.println("\n Library Management System");
			System.out.println("1.Add Book");
			System.out.println("2.Remove Book");
			System.out.println("3.Search Book");
			System.out.println("4.Display Book");
			System.out.println("5.Exit");
			System.out.println("\n Enter the choice : ");
			int choice=obj.nextInt();
			
			switch(choice) {
			
			case 1: System.out.println("Enter Book Id :");
			int bookid=obj.nextInt();
			obj.nextLine();
			System.out.println("Enter Title :");
			String title=obj.nextLine();
			System.out.println("Enter Author :");
			String author=obj.nextLine();
			book book=new book(bookid, title, author);
			library.addbook(book);
			break;
			
			case 2: System.out.println("Enter Book Id to remove :");
			int removeid=obj.nextInt();
			library.removebook(removeid);
			break;
			case 3: System.out.println("Enter Book Id to search :");
			int searchid=obj.nextInt();
			library.searchbook(searchid);
			break;
			case 4: library.displaybooks();
			break;
			case 5: System.out.println("Exiting program....");
			obj.close();
			System.exit(0);
			break;
			default:
				System.out.println("Invalid choice.Please enter correct choice :");
			 
			}
		}
		
	}
}
