package com.thoughtworks.school.practice.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FizzBuzzerTest {

  private FizzBuzzer fizzBuzzer = new FizzBuzzer();

  @Test
  void should_return_the_number_when_it_does_not_match_any_rule() {
    assertEquals("2", fizzBuzzer.fizzBuzz(2));
  }

  @Test
  void should_return_fizz_when_it_is_multiple_of_3() {
    assertEquals("Fizz", fizzBuzzer.fizzBuzz(3));
  }
}