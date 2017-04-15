package model.people;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by IPREMGI on 15/04/2017.
 */
public enum PersonType {
    DEVELOPER_GOGGLES,
    DEVELOPER_MUGTOME,
    MAINTENANCE_CREW,
    EMPLOYEE,
    CLIENT;


    private static final List<PersonType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static PersonType randomPerson()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
