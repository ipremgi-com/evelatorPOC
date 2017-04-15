package factories;

import junit.framework.Assert;
import model.people.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by IPREMGI on 15/04/2017.
 */
public class TestPersonFactory {
    static PersonFactory pf;
    Person p;
    @BeforeClass
    public static void setUp(){
        pf = new PersonFactory();
    }

    @Test
    public void test_clientInstance(){
        p = pf.getPerson(PersonType.CLIENT);

        Assert.assertTrue(p instanceof Client);
    }

    @Test
    public void test_maintentanceCrewInstance(){
        p = pf.getPerson(PersonType.MAINTENANCE_CREW);

        Assert.assertTrue(p instanceof MaintenanceCrew);
    }

    @Test
    public void test_employeeInstance(){
        p = pf.getPerson(PersonType.EMPLOYEE);

        Assert.assertTrue(p instanceof Employee);
    }

    @Test
    public void test_gogglesDeveloperInstance(){
        p = pf.getPerson(PersonType.DEVELOPER_GOGGLES);

        Assert.assertTrue(p instanceof Developer);
        Assert.assertTrue(p.getType().contentEquals("Developer - GOGGLES"));

    }

    @Test
    public void test_mugTomeDeveloperInstance(){
        p = pf.getPerson(PersonType.DEVELOPER_MUGTOME);

        Assert.assertTrue(p instanceof Developer);
        Assert.assertTrue(p.getType().contentEquals("Developer - MUGTOME"));

    }

}
