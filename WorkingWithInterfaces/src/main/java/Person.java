public class Person implements Comparable<Person> {
    String firstName;
    String lastName;
    int age;

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public int compareTo(Person p) {
        int last = this.lastName.compareTo(p.lastName);
        int first =  this.firstName.compareTo(p.firstName);

        return last == 0 ? first : last;
    }


}
