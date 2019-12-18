Feature: difference of numbers?
  when you receive 2 numbers, the difference is displayed

  Scenario Outline: If i get 2 integers, i want to get the difference fo these two integers
    Given one number <int1> and a second number <int2>
    When I ask for the difference
    Then I should be told the difference <int3> of the two numbers
    Examples:
      | int1 | int2 | int3 |
      | 1    | 1    |  0   |
      | 1    | -1   |  2   |
      | 4    | 1    |  3   |
      | 1    | 4    |  -3  |
