Feature: Realizacion de casos ingresando nombre de usuario y contrase�a
Scenario: Verificacion de ingreso de sesion
Given Abrir Chrome
When Ingresa Username "diego" y Password "diego"
Then Inicia sesion