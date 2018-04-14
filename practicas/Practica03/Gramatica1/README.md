# Gramática 1
La gramática escrita en forma EBNF es:

     #+BEGIN_EXAMPLE
     E : (E (+|-))* T
     T : (T (*|/))* F
     F : [-] NUMBER
     #+END_EXAMPLE

La gramática sin estrella de Kleene aumentada es:

     S : E
	 E : K(+|-)T | T
	 K : E | K(+|-)F | F
	 T : L(*|/)F | F
	 L : T | L(*|/)F | F
	 F : [-] NUMBER


La misma se encuentra implementada en src/main/byaccj/ari.y

Se construyeron tres ejemplos:
1. src/main/resources/test.txt (Archivo bien formado)
2. src/main/resources/testDiv0.txt
3. src/main/resources/testMalFormada.txt

Para compilar ocupando maven ocupamos:

		$ mvn clean initialize package

Para probar los archivos de ejemplo:

		$ java -cp target/Analisissintactico-1.0.jar asintactico.Parser src/main/resources/test.txt
		$ java -cp target/Analisissintactico-1.0.jar asintactico.Parser src/main/resources/testDiv0.txt
		$ java -cp target/Analisissintactico-1.0.jar asintactico.Parser src/main/resources/testMalFormada.txt

Nota: Se modificó el archivo pom.xml para que coincidiera con el nombre del comando byaccj (En el ejemplo estaba como byacc solamente)