Scenario: Letra no contenida en palabra - Oportunidades disponibles

Given Jugando
When Ingreso una letra no contenida en la plabra
Then El número de oportunidades disminuye en uno

Scenario: Letra no contenida en palabra - Ultima oportunidad

Given Jugando
When Ingreso una letra no contenida en la plabra
Then El número de oportunidades disminuye en uno
And El juego termina con derrota y en un mensaje se muestra la palabra
