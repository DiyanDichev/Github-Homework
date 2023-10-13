import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List_commands_Int_Type {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.add(2, 123);//добавя числото 123 на втори индекс в списъка.

        System.out.println(numbers.get(2));
    }
}
//1.numbers.add(123); // добавя стойност
//2.numbers.add(2, 123);//добавя числото 123 на втори индекс в списъка.
//3.numbers.set(2, 123); // сменя числото на втори индекс,при вече попълен индекс.
//4.numbers.set(2, numbers.get(2) + 10); // добавя числото 10 към стойността на числото във втрои индекс.
//5.numbers.remove(Integer.valueOf(123)); //ако искам да махна конкретно число,присъстващо в списъка.
//6.numbers.remove(123);// ще премахне този индекс от списъка,ако той съществува.
//  numbers.delete(2);// оператор за изтриване.
//
//7.List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3)); //масив към списък.

//8.for(int i = 0; i < numbers.size(); i++){
//    nums[i] = numbers.get(i);                 // списък към масив.
//}

//9.array.length // дължината на масива.
//10.list.size // дължината на списъка.
//11.System.out.println(numbers.get(2)); //принтира посочение индекс от списъка.
//12.System.out.println(numbers.contains(2)); //проверява и дали числото 2 присъства в някои от индексите на списъка и принтира true/false.

//13.        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
//                .map(Integer::parseInt)  //входни данни за Int
//                .toList();
//14.        int[] nums = numbers.stream().mapToInt(e -> e).toArray(); // списък към масив.
//15 .Collections.sort(numbers); // сортира по големина елементите в списъка.
//16 .Collections.reverse(numbers); // сортира от голямо към малко елементите в списъка.