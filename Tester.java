public class Tester{
    public static void main(String[] args){
        Student student1 = new Student(1, "Treb");
        Student student2 = new Student(2, "Calma");

        Journal journal = new Journal(1914, "World War 1", "Unknown General");
        Book book = new Book(2025, "The birth of AGI", "OpenAI");

        ResourceBorrower resourceBorrower = new JournalBorrower();

        resourceBorrower.borrowResource(student1, journal);
        System.out.println();
        resourceBorrower = new BookBorrower();

        resourceBorrower.borrowResource(student2, book);
    }
}