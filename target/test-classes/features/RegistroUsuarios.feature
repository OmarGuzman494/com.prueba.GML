#Author: omarguzman73@gmail.com

@RegistroUsuarios
Feature:  Ingresar al portal web de Guru99 Demo Site y realizar el registro de usuarios

   @AgregarNuevoUsuario
  Scenario Outline: seleccionar la opcion elements web tables y agregar un nuevo registro 
    Given ingresar al portal web demo guru99 "<url>"
    And ingresar a la pestana Register
    When diligenciar informacion de contacto "<txtFirstName>", "<txtLasttName>", "<txtPhone>","<txtEmail>"
    And diligenciar informacion de mail "<txtAddress>", "<txtCity>", "<txtState>", "<txtPostalCode>", "<txtCountry>"
    And diligenciar información del usuario "<txtUserName>", "<txtPassword>","<txtConfirmPassword>",
    And enviar informacion 
    Then Verificar el registro de usuario "<txtUserName>"
    And Salir de la pagina
    
     Examples: 
      | url                           | txtFirstName  |txtLasttName | txtPhone          |txtEmail            | txtAddress           | txtCity    | txtState      |txtPostalCode |txtCountry  | txtUserName   | txtPassword  | txtConfirmPassword | 
       ##@externaldata@src\test\resources\DataDriver\DataProyecto.xlsx@DatosUsuarios   
|http://demo.guru99.com/test/newtours/|Wilson|Zastoque|3114459568|wzastoque@gmail.com|Calle 5 18 - 32|Bogota|Cundinamarca|50001|COLOMBIA|Wzastoque|Zasroque123*|Zasroque123*|
|http://demo.guru99.com/test/newtours/|Ivana|Zarate|3174526589|izarate@gmail.com|Carrera 80 Bis 49 - 21|Cancum|Jalisco|127005|MEXICO|Izarate|Zarate321+|Zarate321+|
|http://demo.guru99.com/test/newtours/|Luz Dary|Cabezas|3214562587|ldcabezas@gmail.com|Avda Quito 92 -27|Rosario|Corrientes|125005|ARGENTINA|ldcabezas|Cabezas456/|Cabezas456/|


