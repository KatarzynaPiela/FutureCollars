package org.lesson5ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

  @Test
    void shouldReturnCircleAreaValue(){
      //Given
      int expectedArea = 40;
      Circle circle = new Circle(4);
      //When
      int result = circle.getArea();
      //Then
      assertEquals(expectedArea, result);
  }
  @Test
    void shouldReturnCirclePerimeterValue(){
      //Given
      int expectedPerimeter = 35;
      Circle circle = new Circle(4);
      //When
      int result = circle.getPerimeter();
      //Then
      assertEquals(expectedPerimeter, result);
  }
}