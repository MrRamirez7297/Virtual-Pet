package virtualpet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    
    @Test 
    public void testFeed(){
        VirtualPet virtualPet = new VirtualPet();
        virtualPet.feed();
        Assertions.assertEquals(2,virtualPet.getHunger());
    }
}
