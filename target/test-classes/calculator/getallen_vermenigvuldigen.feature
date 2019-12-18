Feature: Getallen vermenigvuldigen
  Ik wil een getal kunnen vermenigvuldigen

  Scenario Outline: als ik een getal vermenigvuldig, wil ik de uitkomst hebben
    Given het eerste getal is <int1>, het tweede getal is <int2>
    When wanneer ik het eerste getal wil vermenigvuldigen met het tweede
    Then zou ik de uitkomst willen hebben <double3>

    Examples:
      | int1 | int2 | double3 |
      | 12   | 2    | 24      |
      | 3    | 3    | 9       |
      | 5    | 5    | 25      |