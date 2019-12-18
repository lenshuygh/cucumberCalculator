Feature: MAximum teruggevenn
  Ik wil van 2 getallen het grootste terugkrijgen

  Scenario Outline: als ik een getal <getal1> en een getal <getal2> geef wil ik het grootste terugkrijgen
    Given het eerste getal is <int1>, het tweede getal is <int2>
    When wanneer ik het eerste getal wil delen door het tweede
    Then zou ik de uitkomst willen hebben <int3>

    Examples:
      | int1 | int2 | int3 |
      | 12   | 4    | 3    |
      | 24   | 12   | 2    |
      | 3    | 3    | 1    |