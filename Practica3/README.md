# **Practico N°3**


### **1.Persona** 

Implementar una clase llamada *Persona* con las siguientes características: <br>
**Atributos:** nombre, edad, fecha de nacimiento, DNI, sexo, peso y altura <br>
**Valores por defecto:**  <br>
El DNI es un valor obligatorio, no posee valor por defecto. <br>
 - En caso de la fecha de nacimiento será el 1 de enero de 2000. <br>
 - Sexo será Femenino por defecto. <br>
 - El nombre por defecto es N y el apellido es N. <br>
 - El peso y la altura son 1 por defecto. <br>
Acorde a lo anterior se deben crear los constructores. Con DNI, con DNI nombre y apellido, con DNI nombre apellido y Fecha de nacimiento….. <br>
**La responsabilidad** de la clase es la siguiente: <br>
 - Cálculo del índice de masa Corporal. Una persona sabe calcular cuál es su índice de masa corporal el cual es peso / altura2 <br>
 - Saber si está en forma. Está en forma si el índice de masa corporal se encuentra entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad). <br>
 - Saber si está cumpliendo años. <br>
 - Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18
años <br>
 - Métodos set de cada parámetro, excepto de DNI. <br>
 - Saber si puede votar. Es necesario ser mayor de 16 años. <br>
 - Saber si es coherente. Que la fecha de nacimiento coincida con la edad. <br>
 - Mostrar toda la información del objeto. Es decir devolver un String con la información del mismo. <br>


### **2 Electrodomésticos**
Crear una clase Electrodoméstico con las siguientes características: <br>
Atributos son nombre, precio base, color, consumo energético y peso. <br>
Valores por defecto: <br>
 - El color por defecto es gris plata. <br>
 - El consumo energético 10 Kw. <br>
 - Precio base 100 pesos. <br>
 - El peso es 2 kg. <br>
Implementar todos los constructores. <br>
La funcionalidad de la clase es la siguiente: <br>
 - Todos los métodos get y set. <br>
 - Comprobar si el electrodoméstico es de bajo consumo (menor que 45 Kw) <br>
 - Calcular el balance, el mismo es el resultado de dividir el costo por el peso <br>
 - Indicar si un producto es de alta gama, el balance es mayor que 3 <br>

 ### **3 Elementos Geométricos**
Implementar la clase punto geométrico, la cual posee dos valores de coordenada X, Y.
El valor por defecto de los mismos es (0,0)  <br>
La funcionalidad que posee la clase es la siguiente: <br>
 - Desplazar el punto en el plano. Se encarga de trasladar el punto a otra posición
del plano. Para esto se incrementan los valores de X e Y en una cierta cantidad
(cierto desplazamiento en X y cierto desplazamiento en Y). <br>
 - Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
euclídea con otro punto acorde a la siguiente formula: <br>
Distancia2 = ( X1 – X2 )2 + (Y1 – Y2)2 <br>
La clase Math de Java define un método de clase sqrt para el cálculo de la raíz
cuadrada. <br>
Implementar la clase Rectángulo. <br>
Para esta clase es necesario definir el rectángulo utilizando los puntos como vértices. Se
trabajará con Rectángulos cuyos lados estén paralelos a los ejes. <br>
Nota. Definir la estructura que deber poseer un rectángulo y en base a esto implementar
los atributos de la clase. <br>
La funcionalidad que debe proveer un rectángulo es la siguiente <br>
 - Desplazarlo en el plano. Trasladar el rectángulo acorde a ciertos valores de X e
Y. <br>
 - Calcular el Área del rectángulo. <br>
 - Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
del mismo es mayor que la del otro. <br>
 - Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
propiedades para que sea un cuadrado. <br>
 - Determinar el largo del lado superior. <br>
 - Determinar si está acostado o parado (si el alto es más que el ancho). <br>


### **4 Series**
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo. <br>
Las series poseen como atributos (además de los episodios correspondientes) un título,
una descripción, un creador y un género. <br>
Implementar en Java las clases involucradas, determinar qué clase es responsable de
responder los siguientes servicios e implementar en Java. <br>
 - Ingresar la calificación de un episodio. Si el valor ingresado como calificación 
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior. <br>
 - Obtener el total episodios vistos de una temporada particular. <br>
 - Obtener el total de episodios vistos de una serie. <br>
 - Obtener el promedio de las calificaciones dadas para una temporada particular. <br>
 - Obtener el promedio de las calificaciones dadas para una serie. <br>
 - Determinar si se vio todos los episodios de la serie. <br>
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos <br>