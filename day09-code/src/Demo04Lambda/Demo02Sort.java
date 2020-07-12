package Demo04Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Sort {

    public static void main(String[] args) {
        Person[] arr = {
            new Person("迪丽热巴", 19),
            new Person("古力娜扎", 16),
            new Person("玛尔扎哈", 37),

        };
//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
//        Arrays.sort(arr, (Person o1, Person o2) -> {
//            return o1.getAge() - o2.getAge();
//        });
        //Eg:Omit
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());
        for(Person person: arr) {
            System.out.println(person.getName() + ":" + person.getAge());
        }
    }

}
