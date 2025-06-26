Feature: Autenticación de usuario en el sistema

Background:
	Given que el usuario se encuntra en la pagina de Login

	@LoginExitoso
	Scenario: Inicio de sesión Exitoso	
	When el especialista digita su usuario y contraseña correcto

   # cambio de prueba

	#intento 1
	Scenario Outline: Inicio de sesión con credenciales incorrectas primer intento
	When el especialista digita el usuario "<usuario>" y la contraseña "<contraseña>"
	Then muestra recuadro con texto: "Te quedan 2 intentos de ingreso o se bloqueará el usuario" y debajo al lado derecho botón azul con texto Entendido
 
	Examples:
	  | usuario         | contraseña     |
	  | usuario_falso   | password123    |
 
	  
	#intento 2
	Scenario Outline: Inicio de sesión con credenciales incorrectas segundo intento
	When el especialista digita el usuario "<usuario>" y la contraseña "<contraseña>"
	Then muestra mensaje "Te quedan 1 intentos de ingreso o se bloqueará el usuario" 
 
	Examples:
	  | usuario         | contraseña     |
	  | usuario_falso   | password123    |
	  

	#intento 3
	Scenario Outline: Inicio de sesión con credenciales incorrectas tercer intento
	When el especialista digita el usuario "<usuario>" y la contraseña "<contraseña>"
	Then muestra mensaje "Excediste el número de intentos" 
 
	Examples:
	  | usuario         | contraseña     |
	  | usuario_falso   | password123    |

	#Sesion abierta 
	Scenario: Ingresar portal coba con sesion abierta
    When en otro navegador o pestaña digita correctamente el usuario y la contraseña
    And ya se tiene una sesion abierta
    Then se muestra el modal Deseas ingresar al portal COBA desde esta ventana

	#Redireccion Desbloquo virtual 
	Scenario: Redireccion a desbloqueo virtual 
	Given que estoy en el modal de excediste numero de intentos 
	When de click en el boton desbloqueo virtual 
	Then redireccion a pagina del banco con titulo "Bienvenido (a) a desbloqueos y reinicios"


#Feature: Sesion abierta en portal COBA otro dispositivo
#Background:
	#Given que el usuario se encuntra en el modal de sesion abierta

	#Scenario: Boton regresar modal deseas ingresar al portal COBA desde esta ventana
	#When le de clic en el boton regresar
	#Then se debe devolver mostrando la pantalla del login del portal coba

	#Scenario: Boton ingresar aquí deseas ingresar al portal COBA desde esta ventana
	#When le de clic en el boton ingresar aquí
	#Then inicia sesion de esa pestaña
	#And la otra pestaña hace el cierre de sesion #Averiguar como se valida este cerrado de sesión

	