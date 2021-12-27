#Author: omarguzman73@gmail.com

@BusquedaDeVuelos
Feature:  Ingresar al portal web de Guru99 Demo Site y buscar vuelos diligenciando todos los datos requeridos

   @BuscarVuelos
  Scenario Outline: diligenciando todos los datos requeridos y buscar vuelos
    Given ingresar al portal web demo guru99 "<url>"
    When diligenciar detalles del vuelo "<txtType>", "<txtCantPassengers>", "<txtDepartingFrom>","<txtMonthFrom>","<txtDayFrom>","<txtArrivingIn>","<txtMonthReturning>","<txtDayReturning>"
    And diligenciar informacion preferencias "<txtServiceClass>", "<txtAirline>"
    And Buscar vuelo
    Then Verificar resultado de la busqueda
    And Salir de la pagina
    
     Examples: 
      | url                           | txtType  |txtCantPassengers | txtDepartingFrom          |txtMonthFrom            | txtDayFrom           | txtArrivingIn    | txtMonthReturning      |txtDayReturning |txtServiceClass |txtAirline | 
       ##@externaldata@src\test\resources\DataDriver\DataProyecto.xlsx@DatosVuelos
|http://demo.guru99.com/test/newtours/reservation.php|oneway|2|London|January|4|Sydney|April|17|Business|Unified Airlines|
|http://demo.guru99.com/test/newtours/reservation.php|roundtrip|4|Frankfurt|March|13|Paris|May|25|First|Pangea Airlines|

