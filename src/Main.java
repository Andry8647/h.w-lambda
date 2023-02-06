import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {


        Person nail = new Person("Наиль", -15);
        Person kirill = new Person("Кирилл", 18);
        Person artem = new Person("Артем", 22);
        List<Person> personList = new ArrayList<>();
        personList.add(nail);
        personList.add(kirill);
        personList.add(artem);

        for (Person person : personList) {

            System.out.println(person);
        }
        System.out.println("__________________________");

//        PersonPositiveAge personPositiveAge = new PersonPositiveAge();

        for (Person person : personList) {

            System.out.println(person);
//            Predicate<Person> personPredicate = new Predicate<Person>() {
//                @Override
//                public boolean test(Person person) {
//                    if (person.getAge() < 0) {
//                        return false;
//                    } else {
//                        return true;
//                    }
//                }
//            };
//            System.out.println(personPredicate.test(person));
            System.out.println(new Predicate<Person>() {

                @Override
                public boolean test(Person person) {
                    if (person.getAge() < 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }.test(person)) ;

        }
//    static class PersonPositiveAge implements Predicate<Person>{
//
//        @Override
//        public boolean test(Person person) {
//            if(person.getAge()< 0){
//                return false;
//            }else {
//                return true;
//            }
//
//        }
//    }
    }
}
