Feature: Consultar Oferta de empleo
  Como Usuario
  Quiero ingresar a www.choucairtesting.com
  A consulta informacion de oferta de empleo

  @ConsultaExitosaEmpleo
  Scenario: consulta de Empleo
    Given Elias ingresa a la pagina choucairtesting
    When Selecciona en el menu el modulo de Empleo
    And Selecciona la opcion portal de empleo
    And ingresa a la opcion conoce nuestras vacantes
    Then debe mostrar el la oferta Analista de Pruebas Funcionales
