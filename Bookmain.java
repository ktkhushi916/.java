import java.util.Scanner;
class Book{
    String name;
    String author;
    int price;
    int numPages;
    public Book(String name,String author,int price,int numPages){
        this.name=name;
        this.author=author;
        this.price=price;
        this.numPages=numPages;
    }
    
   
@Override
public String toString(){
   String name, author, price, numPages;
   name = "Book name: " + this.name + "\n";
   author = "Author name: " + this.author + "\n";
   price = "Price: " + this.price + "\n";
   numPages = "Number of pages: " + this.numPages + "\n";
   return name + author + price + numPages;
}

}
public class Bookmain{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name,author;
        int price,numPages;
        System.out.println("Enter number of books:");
        int n=s.nextInt();
        Book b[];
        b=new Book[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER NAME FOR BOKK "+(i+1)+":");
            name=s.next();
            System.out.println("ENTER AUTHOR FOR BOKK "+(i+1)+":");
            author=s.next();
            System.out.println("ENTER   PRICE FOR BOKK "+(i+1)+":");
            price=s.nextInt();
            System.out.println("ENTER NUMBER OF PAGES FOR BOKK "+(i+1)+":");
            numPages=s.nextInt();
            b[i]=new Book(name,author,price,numPages);
            
            

        }
        System.out.println("\n Book Details");
        for(int i=0;i<n;i++){
              System.out.println(b[i].toString());


        }
        s.close();

  
    }
}


