package pl.sda.util;

import pl.sda.model.Person;

public class PersonUtil {
    public int parseId(String id){
        if (id == null || id.trim().isEmpty()){
            throw new IllegalArgumentException("id is empty " + id);
        }

        return Integer.parseInt(id);
    }
}
