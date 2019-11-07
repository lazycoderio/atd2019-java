package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleTest extends BaseTest{

    @Test
    public void exampleTest(){
        assertTrue(true, "this is the message when it fails");
    }
}
