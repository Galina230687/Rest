package ru.netology.rest2.repository;


import org.springframework.stereotype.Repository;
import ru.netology.rest2.authorities.Authorities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password)
    {

        List<Authorities> resutlList = new ArrayList<>();
        Map<String, String> users = new HashMap<>();
        users.put("Galina", "01234");
        users.put("Galina2", "12345");

        if (users.containsKey(user))
        {
            if(users.get(user).equals(password))
            {
                resutlList.add(Authorities.READ);
            }
        }

        return resutlList;
    }
}
