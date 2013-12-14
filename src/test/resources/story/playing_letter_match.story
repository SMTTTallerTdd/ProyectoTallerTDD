Scenario: Letra contenida en palabra - palabra no completada

Given Jugando
When Ingreso una letra contenida en la plabra
And No se completa la palabra con la letra introducida
Then Se pinta la letra introducida en los espacios correspondientes

Scenario: Letra contenida en palabra - palabra completada

Given Jugando
When Ingreso una letra contenida en la plabra
And se completa la palabra con la letra introducida
Then Se pinta la letra introducida en los espacios correspondientes
And Se muestra un mensaje indicando juego terminado con victoria

Scenario: letra contenida en la plabra otra vez

Given Jugando
When Ingreso una letra contenida en la plabra otra vez
And La letra ingresada ya había sido jugada
Then se muestra un mensaje indicando que esa letra ya fue ingresada