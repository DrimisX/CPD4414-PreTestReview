/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Tests for the Shape class
 */

public class SquareTest {

        public SquareTest() {
            
        }
        
        @Test
        public void testGetAreaIs400WhenSquareCreatedWithSideOf20() {
            Square instance = new Square(20);
            int expResult = 400;
            int result = instance.getArea();
            assertEquals(expResult, result);
        }
        
        /**
         * Test that when you create a square with default constructor,
         * that getArea() returns 0.
         */
        @Test
        public void testGetAreaIs0WhenSquareCreated() {
            
        }
        
        /**
         * Test that when you create a square with argument of 100,
         * that getSide() returns 100.
         */
        @Test
        public void testGetSideIs100WhenSquareCreatedWithSideOf100() {
            
        }
    
        /**
         * Test that when you create a square with default constructor,
         * then use setSide(500), that getSide() returns 500.
         */
        @Test
        public void testGetSideIs500WhenSquareCreatedThenSetSideTo500() {
            
        }
}
