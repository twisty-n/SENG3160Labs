import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class TestMachinery {

   @TestSubject
   TestMachine test = new TestMachine();
   
   @Mock
   IMachineService service;
   
   @Test
   public void testMachine() {
       EasyMock.expect(service.getMachineCost(test))
            .andReturn(1000.0);
            
        EasyMock.replay(service);
        
        Assert.assertEquals(test.getMachineCost(), 1000.0, 10.0);
   }

}