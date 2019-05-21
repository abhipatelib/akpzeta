public class TestLibrary {

   public static void main(String args[]) {
   
      Library system = new Library();
      Book Book1 = new Book("The Perks of being a Wallflower", "978-145169196");
      Book Book2 = new Book("James and the Giant Peach","978-0142410363");

      system.addBook(Book1);
      System.out.println("");
      system.addBook(Book2);
      System.out.println("");
      system.printBooks();

   }
}