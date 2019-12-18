Feature: sum of numbers?
  when you receive 2 numbers, the sum is displayed

  Scenario Outline: If i get 2 integers, i want to have the sum of these two integers
    Given one number <int1> and a second number <int2>
    When I ask for the sum
    Then I should be told the sum <int3> of the two numbers
    Examples:
      | int1 | int2 | int3 |
      | 1    | 1    |  2   |
      | 1    | 2    |  3   |
      | 0    |-5    | -5   |



