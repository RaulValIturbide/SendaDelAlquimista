package sendadelalquimista;

public class Notas {

    /*Problemas a arreglar
   
    
     */
 /*Problemas arreglados
        -No puedo agregar el objeto alquimia en la ronda 
        -Las pociones se pueden usar aunque no est�n en posesi�n del jugador/enemigo
     */
    
 /*To Do List 
    -Crear el comportamiento del enemigo en la ronda
    -Que los da?os tengan un componente aleatorio tanto de enemigos como del jugador
    -Crear resistencias
    - Sistema de velocidad para elegir quien empieza atacando
    -Necesito darle a la IA acceso a la alquimia en el metodo "ejecucionIA" para crear un switch donde la IA aleatoriamente decida si usar alquimia o no en sus armas
        para luego implementarlo en la ronda
     */
    
    /*Hecho
    -A?adir armas a la ia y pociones para que pueda usarlas
    -Las pociones pueden usarse aunque no se tengan en posesion, debo hacer algo para que salgan diferentes mensajes dependiendo de si
        no la tengo o si ya la he usado  
    
    */
    
    
    
    
    
    
    
    
 /*
    02/01/2025
    -Arreglado el problema en el que un arma tiene siempre un da�o determinado
    -Crear una clase pociones para mezclar y crear habilidades de alquimia
    -Crear el mapa
    
    03/01/2025
    -Creo que he solucionado el problema de llevar las pociones dentro de cada batalla introduciendo el array aAlquimia[]en los metodos para que el jugador tenga acceso (o no) a 
    todos ellos, me parece que crear� un boolean que permita activar/desactivar su uso.
    -He creado un metodo para hacer que la "IA" ataque al jugador durante la ronda.
    -Creo que deber�a generar alg�n tipo de boolean que "gaste" una acci�n para asi no poder usar pociones infinitas o cambiar de armas infinitamente
    
    04/01/2025
    -He creado el atributo "arma" para los enemigos y ahora deben usar el da?o de sus armas para atacar, tambien poseen ahora las pociones de alquimia pero 
    no est� implementado su uso todavia
    -He conseguido crear una lista de las pociones en combate, por ahora la idea es que posees un conocimiento del numero de pociones existentes pero no conoces su nombre 
     por lo que hay un hueco con "???????" cuando no tienes la pocion en posesion
    
    05/01/2025
    -Ahora el jugador ver� la alquimia que puede crear y la que no, si elige una que todavia no ha conocido le aparecer� un texto indicando que 
        no conoce todavia la creaci�n de la misma
    -He creado un listado de alquimias que el jugador podr� observar como si se tratase de un antiguo libro, con hojas o informacion faltante
        aqu� el jugador podr� ver la info de las alqu�mias que conozca pero no de las que desconozca estando ocultas por una serie de 
        interrogantes
    
    
    
    
    
    
    
    
    
     */
}
