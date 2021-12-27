#Author: omarguzman73@gmail.com

@ValidarFechas
Feature:  Ingresar al portal web de Guru99 Demo Site y validar la fecha de la pagina con la fecha del sistema

   @ValidarFechaPagina
  Scenario Outline: validar la fecha de la pagina con la fecha del sistema
    Given ingresar al portal web demo guru99 "http://demo.guru99.com/test/newtours/index.php"
    And ingresar a la pestana Home
    When capturar la fecha de la pagina
    Then comparar fecha pagina con fecha sistema
    And Salir de la pagina
