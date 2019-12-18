Feature: Getallen dafronden
  Ik wil een getal kunnen afronden

  Scenario Outline: als ik een getal afrond, wil ik de uitkomst hebben, afgerond tot op het meegegeven aantal cijfers
    Given het eerste getal is <double1>, het tweede getal is <int1>
    When wanneer ik het eerste getal wil afronden tot op <int1> aantal cijfers na de komma
    Then zou ik de uitkomst willen hebben <double2>

    Examples:
      | double1 | int1 | double2 |
      | 3.1415  | 2    | 3.14    |
      | 3       | 2    | 3.00    |