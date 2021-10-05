# new feature
# Tags: optional

Feature: Un cliente desea un prestamo de libre inversion para remodelar su vivienda

  Scenario: El cliente cuenta con un salario mayor o igual a un salario minimo
    Given quiero un prestamo de libre inversion
    When 1800000 es mayor o igual que salario minimo
    Then deberia obtener el mensaje de aprobacion "Es apto para solicitar el prestamo"

  Scenario: El cliente cuenta con un salario menor a un salario minimo
    Given quiero un prestamo de libre inversion
    When 800000 es menor que un salario minimo
    Then deberia obtener el mensaje de negacion "NO es apto para solicitar el prestamo"