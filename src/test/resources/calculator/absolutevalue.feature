Feature: Absolute waarde
  Return absolute waarde van gegeven getal

  Scenario Outline:
    Given entry is <number>
    When I ask the absolute value
    Then I should get the <absoluteNumber>

    Examples:
      | number | absoluteNumber |
      | 10     | 10             |
      | -10    | 10             |
      | 0      | 0              |