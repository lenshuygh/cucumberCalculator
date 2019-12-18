Feature: Min waarde van twee getallen
  Ik wil de min waarde van twee getallen

  Scenario Outline: als ik twee getallen heb, wil ik het getal met de minste waarde terugkrijgen
    Given het eerste getal is <int1>
    When het tweede getal is <int2>
    Then zou ik het laagste getal terug willen krijgen <int3>

    Examples:
      | int1 | int2 | int3 |
      | 12   | 2    | 2    |
      | 3    | -3   | -3   |
      | -5   | -6   | -6   |