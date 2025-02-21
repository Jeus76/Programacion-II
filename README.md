# Programación-II

Bienvenidos a mi repositorio Programación II. 
En este repositorio estaré recopilando todos los ejercicios y practicas las cuales vaya elaborando a lo largo de la asignatura.
-----------

PRÁCTICA #1


En esta práctica se nos pide la obtención de una aproximación iterativa al número pi, para lograr esto hicimos uso del método de Montecarlo, el cual es una técnica de simulación que utiliza números aleatorios para estimar soluciones a problemas matemáticos o físicos, especialmente aquellos que son difíciles de resolver analíticamente. Se basa en la repetición de experimentos aleatorios y el análisis de sus resultados estadísticos.

En esta práctica la aplicamos para aproximarnos al valor de pi a través del problema matemático de la aguja de Buffon. Utilizamos un círculo de radio 1 el cual se encuentra dentro de un cuadrado. Utilizamos un método iterativo para representar las coordenadas de los puntos/pasos que caerían dentro de nuestra figura geométrica. Después que se hayan colocado todos los puntos, se cuenta cuantos cayeron dentro del círculo, este número lo dividimos por el total de puntos que se hayan utilizado. Después de la división se multiplica por cuatro ese resultado y nos daría una aproximación al número pi.

A continuacion, se ilustrara las relaciones entre clases mediante un diagrama UML:


![DiagramaUMLPiIterativo](https://github.com/user-attachments/assets/e92048dc-a794-4302-aad8-0ce73193321f)




---------
PRACTICA #2


Este proyecto calcula el valor de PI utilizando el método de Monte Carlo. El programa lanza un número especificado de "dardos" aleatorios en un cuadrado y cuenta cuántos caen dentro de un círculo inscrito en ese cuadrado. La relación entre los dardos dentro del círculo y el total de dardos se utiliza para aproximar el valor de PI.

Estructura del Proyecto
El proyecto consta de dos paquetes principales:

aplicacion: Contiene la clase Main que maneja la entrada del usuario y llama a los métodos para calcular PI.
mates: Contiene la clase Matematicas que implementa los métodos para calcular PI utilizando el método de Monte Carlo.
Clases
Main
La clase Main es la clase principal del programa. Se encarga de:

Solicitar al usuario el número de dardos que desea lanzar.
Llamar al método generarNumeroPi de la clase Matematicas para calcular el valor de PI.
Mostrar el resultado al usuario.
Matematicas
La clase Matematicas contiene los métodos necesarios para calcular el valor de PI. Sus responsabilidades incluyen:

generarNumeroPi: Este método calcula el valor de PI utilizando el método de Monte Carlo. Llama al método recursivo generarNumeroPiRecursivo para contar cuántos dardos caen dentro del círculo.
generarNumeroPiRecursivo: Este método recursivo lanza dardos aleatorios y cuenta cuántos caen dentro del círculo. Devuelve el número de aciertos.
Cómo Ejecutar el Proyecto
Clona el repositorio en tu máquina local.
Navega al directorio del proyecto.
Compila las clases con el siguiente comando:
javac aplicacion/Main.java mates/Matematicas.java
Ejecuta el programa con el siguiente comando:
java aplicacion.Main
Ingresa el número de dardos que deseas lanzar y el programa calculará el valor de PI.
Diagrama UML
UML.png

Descripción del Método de Montecarlo
El método de Montecarlo es una técnica de simulación que utiliza números aleatorios para aproximar resultados matemáticos. En este caso, se utiliza para calcular el valor de Pi generando puntos aleatorios dentro de un cuadrado y contando cuántos caen dentro de un círculo inscrito.

Autor
Luis Holgado Arranz y Jesús Alejandro Hernández Méndez
