//package org.launchcode;
//
//import org.junit.After;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class CarTest {
//    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//
////    @Test
////    public void emptyTest() {
////        assertEquals(10,10,.001);
////    }
//
//
//    Car test_car;
//
//    @BeforeEach
//    public void createCarObject() {
//        test_car = new Car("Toyota", "Prius", 10, 50);
//    }
//    //TODO: constructor sets gasTankLevel properly
//
//    @Test
//    public void testInitialGasTank() {
//        //Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
////assertFalse(test_car.getGasTankLevel()==0);
//
//    }
//
//    //TODO: gasTankLevel is accurate after driving within tank range
//
//@Test
//    public void accurategasTankLevel(){
//
//        assertEquals(50, 50);
//    }
//
//
//
//    //TODO: gasTankLevel is accurate after attempting to drive past tank range
//@Test
//    public void inacurateGasTankLevel(){
//
//        assertEquals(50,50);
//}
//
//
//    //TODO: can't have more gas than tank size, expect an exception
//
//    @Test
//    public void exceedGasTankLevel(){
//
//assertFalse (test_car.getGasTankSize()>10);
//    }
//
//
//}