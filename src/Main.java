import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return t -> {
            U result = condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
            System.out.println(result);
            return result;
        };
}
    public static void main(String[] args) {

        Predicate<Integer> condition= x -> x %2!=0  ; //Проверка на четность
        Function<Integer, Integer> ifTrue = x -> x*3; // если четное умн на 3
        Function<Integer, Integer> ifFalse = x -> x*2; // если нет на 2
        Function<Integer,Integer> result = ternaryOperator(condition,ifTrue,ifFalse);
        result.apply(6);
//        Function<String, String> saveStringLength = ternaryOperator(condition,ifTrue,ifFalse);


//        Person nail = new Person("Наиль", -15, 15.555555555555555555);
//        Person kirill = new Person("Кирилл", 18, 18.5555555555555);
//        Person artem = new Person("Артем", 22, 18.9999999999999);
//        List<Person> personList = new ArrayList<>();
//        personList.add(nail);
//        personList.add(kirill);
//        personList.add(artem);
//
//        for (Person person : personList) {
//
//            System.out.println(person);
//        }
//        System.out.println("__________________________ Задание 1 анонимный класс");
//
//
//        for (Person person : personList) {
//
//            System.out.println(person);
//            System.out.println(new Predicate<Person>() {
//
//                @Override
//                public boolean test(Person person) {
//                    if (person.getAge() < 0) {
//                        return false;
//                    } else {
//                        return true;
//                    }
//                }
//            }.test(person));
//
//        }
//        System.out.println("__________________________ Задание 1 лямбда");
//        for (Person person : personList) {
//            System.out.println(person);
//            System.out.println(((Predicate<Person>) person1 -> {
//                if (person1.getAge() < 0) {
//                    return false;
//                } else {
//                    return true;
//                }
//            }).test(person));
//
//        }
//        System.out.println("__________________________ Задание 2 анонимный класс 1 вариант");
//        for (Person person : personList) {
//            System.out.println(person);
//            new Consumer<String>() {
//                public void accept(String person1) {
//                    System.out.println(" Привет! Меня зовут " + person1);
//                }
//            }.accept(person.getName());
//        }
//        System.out.println("__________________________ Задание 2 анонимный класс 2 вариант");
//        for (Person person : personList) {
//            System.out.println(person);
//            new Consumer<Person>() {
//                public void accept(Person person1) {
//                    System.out.println(" Привет! Меня зовут " + person1.getName());
//                }
//            }.accept(person);
//        }
//        System.out.println("__________________________ Задание 2 лямбда 2 вариант");
//        for (Person person : personList) {
//            System.out.println(person);
//            ((Consumer<Person>) person1 -> System.out.println(" Привет! Меня зовут " + person1.getName())).accept(person);
//        }
//
//        System.out.println("__________________________ Задание 3 анонимный класс ");
//        for (Person person : personList) {
//            System.out.println(person);
//            System.out.println(new Function<Double, Float>() {
//                @Override
//                public Float apply(Double aDouble) {
//                    Float a = aDouble.floatValue();
//                    return a;
//                }
//            }.apply(person.getLong1()));
//
//        }
//        System.out.println("__________________________ Задание 3 лямбда ");
//        for (Person person : personList) {
//            System.out.println(person);
//            System.out.println(((Function<Double, Float>) aDouble -> {
//                Float a = aDouble.floatValue();
//                return a;
//            }).apply(person.getLong1()));
//
//        }
//        System.out.println("__________________________ Задание 4 анонимный класс ");
//        for (Person person : personList) {
//            System.out.println(person);
//            System.out.println(new Supplier<Double>() {
//                @Override
//                public Double get() {
//                    return (Math.random() * ((100 - 0) + 1)) + 0;
//                }
//            }.get());
//
//        }
//        System.out.println("__________________________ Задание 4 лямбда ");
//        for (Person person : personList) {
//            System.out.println(person);
//            System.out.println(((Supplier<Double>) () -> (Math.random() * ((100 - 0) + 1)) + 0).get());
//
//        }
//        System.out.println("__________________________ Задание 5 анонимный класс ");


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

//    public static <T, U> Function<T, U> ternaryOperator(
//            Predicate<? super T> condition,
//            Function<? super T, ? extends U> ifTrue,
//            Function<? super T, ? extends U> ifFalse) {
//
//
//        T T;
//        new Predicate<T>() {
//
//            @Override
//            public boolean test(T t) {
//                if (t  ) {
//                    return (boolean) new Function<T, U>() {
//                        @Override
//                        public U apply(T t) {
//
//                            return (U) t;
//                        }
//                    }.apply(t);
//                } else {
//                    return (boolean) new Function<T, U>() {
//                        @Override
//                        public U apply(T t) {
//
//                            return (U) t;
//                        }
//                    }.apply(t);
//                }
//            }
//
//
//        }.test(0);
//        return null;
//    }
}
