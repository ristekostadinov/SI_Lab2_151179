import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {


    private List<String> createList(String... values){
        return new ArrayList<>(Arrays.asList(values));
    }

    @Test
    void testEveryStatement(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,createList("any")));
        assertTrue(ex.getMessage().contains("The user is not instantiated"));

        RuntimeException ex2;
        User user2 = new User(null, "any", null);
        ex2 = assertThrows(RuntimeException.class, () -> SILab2.function(user2,createList("any")));
        assertTrue(ex2.getMessage().contains("The user is missing some mandatory information"));

        User user3 = new User("prv", "prv123", null);
        assertFalse(SILab2.function(user3, createList("any")));

        User user4 = new User("one", "two", null);
        assertFalse(SILab2.function(user4, createList("any")));

        User user5 = new User("one", "ristekostadinov", null);
        assertFalse(SILab2.function(user5, createList("any")));

        User user6 = new User("one", "Riste12#", null);
        assertTrue(SILab2.function(user6, createList("any")));
    }

    @Test
    void testEveryBranch(){
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null,createList("any")));
        assertTrue(ex.getMessage().contains("The user is not instantiated"));

        RuntimeException ex2;
        User user2 = new User(null, "any", null);
        ex2 = assertThrows(RuntimeException.class, () -> SILab2.function(user2,createList("any")));
        assertTrue(ex2.getMessage().contains("The user is missing some mandatory information"));

        User user3 = new User("prv", "prv123", null);
        assertFalse(SILab2.function(user3, createList("any")));

        User user4 = new User("one", "two", null);
        assertFalse(SILab2.function(user4, createList("any")));

        User user5 = new User("one", "ristekostadinov", null);
        assertFalse(SILab2.function(user5, createList("any")));

        User user6 = new User("one", "Riste12#", null);
        assertTrue(SILab2.function(user6, createList("any")));
    }
}