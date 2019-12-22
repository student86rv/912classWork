package ua.epam.streamTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("enuHFGVBnewovgfuwbrHNVI");
        list.add("qwertyuiopasdf");
        list.add("rghbjud");
        list.add("rd");

//        list.stream().filter((str) -> str.length() >= 10).forEach(System.out::println);

        List<User> users = new ArrayList<>();
        users.add(new User(1, "Ivan", "Ivanov", "ivanov@gmail.com", new Date()));
        users.add(new User(2, "Petr", "Petrov", "petrov@gmail.com", new Date()));
        users.add(new User(2, "Sidor", "Sidorov", "sidorov@gmail.com", new Date()));

        Stream<UserDto> userStream = users.stream().map((usr) -> new UserDto(usr.firstName, usr.lastName, usr.email));

        List<UserDto> userDTOlist = userStream.collect(Collectors.toList());
        System.out.println(userDTOlist);
    }
}
