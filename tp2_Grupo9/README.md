# TP N°2 - Grupo 9

Trabajo Practico N°2 de Programacion orientada a objetos

## Integrantes
 
 - Carrillo, Marianela Valentina Abril
 
 - Lamas Mendez, Cristian Octavio
 
 - Maidana, Antonella Mariel
 
 - Meruvia, Jimena Virginia
 
 - Ortega, Julieta Esmeralda
 
### Respuestas: 

Ejercicio 3
Es necesario utilizar la palabra reservada static? 
No, en este caso no es necesario usar "static" porque las constantes están declaradas dentro del método "main"
Usamos "final" porque sirve para indicar que el valor es una constante, o sea, que una vez que le damos un valor no lo podemos cambiar
Por ejemplo, si ponemos "final int DIAS_SEMANA = 7", esa constante va a mantener el valor 7 durante la ejecución
"static" se usaría si quisiéramos declarar la constante como parte de la clase, fuera del método "main"
Como en este ejercicio las estamos colocando dentro del "main", podemos usar solamente "final"

Ejercicio 19
Por qué texto1 == texto2 devuelve true?
Porque los dos tienen el mismo texto "Hola" y Java puede guardar los textos iguales en un mismo lugar de memoria llamado String Pool. Por eso texto1 y texto2 terminan haciendo referencia al mismo objeto.
Por qué texto1 == texto3 devuelve false?
Porque texto3 fue creado usando new String("Hola"), por lo que se crea un objeto nuevo. Aunque contiene el mismo texto, es una referencia diferente.
Qué sucede cuando utilizamos el método equals() para comparar los valores?
equals() compara el contenido de los objetos. Por eso texto1.equals(texto2) da true y texto1.equals(texto3) también da true, porque en los dos casos el contenido es "Hola".

Ejercicio 20
El valor de textoOriginal no cambia porque los String en Java son inmutables, es decir que una vez que se crean no se pueden modificar. Cuando usamos replace(), se crea un nuevo texto con el cambio realizado y ese resultado se guarda en textoModificado. Por eso textoOriginal sigue siendo "Hoja" y textoModificado pasa a ser "Hola".
