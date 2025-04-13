public class Tester{
    public static void main(String[] args){
        Student student1 = new Student(1, "Ayato");
        Student student2 = new Student(2, "Cabanilla");

        Journal journal = new Journal(1914, "World War 1", "Adolf Hitler");
        Book book = new Book(2025, "The birth of Deepseek", "OpenAI");

        ResourceBorrower resourceBorrower = new JournalBorrower();

        resourceBorrower.borrowResource(student1, journal);
        System.out.println();
        resourceBorrower = new BookBorrower();

        resourceBorrower.borrowResource(student2, book);
    }
}
