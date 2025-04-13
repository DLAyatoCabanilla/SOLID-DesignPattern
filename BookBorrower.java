public class BookBorrower implements ResourceBorrower{

    @Override
    public void borrowResource(Student student, Resource resource) {
        System.out.println("Student named: " + student.getName());
        System.out.println("borrowed the " + resource.getClass() + " titled: " + resource.getTitle());        
    }
}
