# programacion1-25

| Tamaño del repositorio        | Lenguaje utilizado|
| ------------- | :-------------:| 
| ![GitHub repo size in bytes](https://img.shields.io/github/repo-size/jciccio/programacion1-25.svg?style=for-the-badge)      |   Java|

## Material visto en clase
Ejemplos tomados del código fuente generado en las distintas lecciones.

### Comentarios
Elementos omitidos por el compilador a la hora de transformar el código fuente en código binario/ejecutable. Utilizado por el programador para comprender mejor qué se está codificando

```java
// Esto es un comentario de una línea debe iniciar con (//), toda la línea es omitida

/* Esto es un comentario
  de varias líneas se note los delimitadores utilizados al inicio
  y final 
*/
```

### Creación de objetos
  * Creación de clases (class)
  ```java
  public class Carta //Declaración de una clase, usando las palabra resevadas public class
  ```
  
  * Creación de variables de instancia o atributos de clase
  ```java
   // Atributos

   // Para definir un tipo de dato:
   // Declaramos el valor privado
   // Definimos qué tipo de dato es
   // Damos un nombre a la variable
   private String nombre;
  ```
  * Creación de métodos de un objeto
  ```java
   //Declaracion de un método:
   //1. Si es publico o privado (accesible desde la instancia)
   //2. Qué (tipo de dato) quiero que retorne el método  
   //3. Cómo se llama el método
   //4. Qué necesito que reciba el método para funcionar
   public void setPalo(String paloParametro){
      palo = paloParametro;
   }
  ```

  * Generación de instancias (declaración e inicialización de objetos o tipos no primitivos)
  ```java
// NombreDeClase nombreInstancia = new NombreClase();
Persona persona1 = new Persona();
  ```

  
### Transformación de tipos de datos utilizando __Casting__
```java
 float(), double(), int(), +
```

| Método        | Descripción           | Ejemplo
| ------------- |:-------------:| :-------------:|
| double()        | Conversión a número real  | float(12) --> 12.0
| int()        | Conversión a número entero  | int(12.4) --> 12
| +        | Conversión a hilera de caracteres | "" + 12 --> "12"

#### Conversión de String a números:

| Método        | Descripción           | Ejemplo
| ------------- |:-------------:| :-------------:|
| Double.parseDouble(hilera)        | Conversión a número real  | Double.parseDouble("12.4") --> 12.4
| Integer.parseInt(hilera)        | Conversión a número entero  | Integer.parseInt("15") --> 15


### Solicitud de datos al usuario

#### Consola

Import necesario:
```java
import java.util.Scanner;
```
Ejemplo:
```java
Scanner scanner = new Scanner(System.in);
System.out.println("Digite su nombre: ");
String nombre = scanner.nextLine();
```
#### JOptionPane (utilizando una ventana emergente):

Import necesario:
```java
import javax.swing.JOptionPane;
```
Ejemplo:
```java
String nombre = JOptionPane.showInputDialog("Digite su nombre");
```

### Manejo de excepciones

Uso de los bloques try{...}catch(Exception e){...}

```java
try{
  // código propenso a fallos
}
catch (Exception e) 
{
  // acción a tomar si se encuentra un error.
}
```

Ejemplo con dos bloques catch:

```java
int valor = 0;
String numeroHilera =  JOptionPane.showInputDialog (“Digite un número”);
try{
   valor = Integer.parseInt (numeroHilera);
}
catch (NumberFormatException e){
   System.out.println (“El valor digitado no es un número.”);
}
catch (Exception e){
   System.out.println (“Ocurrió un error inesperado.”);
}
```

Note que se codifica primero el bloque con la excepción más específica `NumberFormatException` y luego el bloque con la excepción general en este caso.

Conversión a un número:
```java
public int convertirStringAInt(String valor){
   int numero = 0;
   try{
      numero = Integer.parseInt(valor);
   }
   catch(NumberFormatException e){
      System.err.println("Ocurrio un error al convertir: " + valor);
   }
   return numero;
}
```

Ejemplo visto en clase (Interfaz)
```java 
public double solicitarNumeroReal(String mensaje){
    String numeroHilera = JOptionPane.showInputDialog(mensaje);
    double numero = 0;
    try{
      numero = Double.parseDouble(numeroHilera);
    }
    catch(NumberFormatException e){
      System.err.println("Ocurrio un error al convertir el numero: " + e);
    }
    return numero;
  }
```

### Sobrecarga de métodos y constructores

La firma de un método está compuesta por su nombre y los tipos de datos de los parámetros que recibe (en orden).

La sobrecarga consiste en tener métodos con el mismo nombre pero con distintos parámetros. Java utiliza la cantidad de parámetros, junto con sus tipos para determinar cuál es el método correcto que debe ser invocado.

De igual forma, en Java se pueden sobrecargar los constructores de una clase (permitiendo tener varios). Esto se llama sobrecarga de constructores.

Ejemplos vistos en clase:

Sobrecarga de métodos (clase CalculadoraV2.java)
```java
   public double multiplicar(double valor1, double valor2){
      double resultado = valor2 * valor1;
      return resultado;
   }

   public int multiplicar(int valor1, int valor2){
      return valor1*valor2;
   }

   public double multiplicar(double valor1, int valor2){
      return valor1*valor2;
   }

   public double multiplicar(int valor1, int valor2, int valor3){
      return valor1*valor2*valor3;
   }
```

Sobrecarga de constructores (clase Carta.java)

```java
public Carta() {
   palo = "Diamantes";
   numero = 3;
}

public Carta(int numero, String palo){
   this.numero = numero;
   this.palo = palo;
}
```


### Estructuras de control (__if__, __if/else__)

  * Operadores relacionales (and: __&&__, or: __||__, xor: __^__, not: __!__)
  
  * Operadores lógicos (__>__, __>=__,__<__,__<=__,__==__)
  
  * Orden precedencia:
  
  | Orden        | Tipo           | Operador|
  | ------------- |:-------------:| :-------------:|
  |1|Posfijos |( )|
  |2|Multiplicativos |*, /, %, //|
  |3|Aditivos |+,-|
  |4|Unarios |x++, x--|
  |5|Relacionales |>, <, <=, >=|
  |6|Igualdad |==|
  |7|AND | and|
  |8|OR | or|
  |9|Asignación |=, +=, -=, *=, /=,%= …|


#### Estructura if 

Ejemplo tomado de la clase carta, convierte un número entero que representa una carta en una hilera de caracters con su respectivo valor.
```java
public String convertirNumeroCartaIf(){
   String valorCarta = "";
   if (numero == 1){
      valorCarta = "As";
   }
   else {
      if (numero == 11){
         valorCarta = "J";
      }
      else{
         if (numero == 12){
            valorCarta = "Q";
         }
         else{
            if (numero == 13){
               valorCarta = "K";
            }
            else{
               valorCarta += numero;
            }   
         } 
      } 
   }
   return valorCarta;
}
```

#### Estructura switch

Ejemplo anterior codificado utilizando la estructura switch

```java
// Retorne J Q K As o el numero como String
public String convertirNumeroCarta(){
   String valorCarta = "";
   switch(numero){
      case 11:
         valorCarta = "J";
      break;
      case 12:
         valorCarta = "Q";
      break;
      case 13:
         valorCarta = "K";
      break;
      case 1:
         valorCarta = "As";
      break;
      default:
         valorCarta += this.numero;
   }
   return valorCarta;
}
```


### Estructuras de repetición

![alt text](screenshots/ciclos.jpg "Ejemplo gráfico visto en clases")

### Ciclo while

Ejemplo tomado de la clase Matemáticas

```java
public double calcularPromedioWhile(){
  double suma = 0;
  int n = 0; // iteraciones que se harán y servirá como condición de parada

  while(n < 5){
    suma += interfazUsuario.solicitarNumeroEntero("Digite un numero (while)");
    n++; // cambio de condición
  }
  return suma/5;
}
```

### Ciclo do - while

Ejemplo tomado de la clase Matemáticas


```java
public double calcularPromedioDoWhile(){
  double suma = 0;
  int n = 0;

  do {
    suma += interfazUsuario.solicitarNumeroEntero("Digite un numero (do-while)");
    n++;
  }while(n < 5);
  return suma/5;
}
```
### Ciclo for

Ejemplo tomado de la clase Matemáticas


```java
public double calcularPromedioFor(){
  double suma = 0;

  for (int  n = 0 ; n < 5 ; n++){
    suma += interfazUsuario.solicitarNumeroEntero("Digite un numero (for)");
  }

  return suma /5;
}
```

### Arreglos

Ejemplos vistos en clase:

```java
//Declaración por extensión:
int [] arreglo1 = {10,20,30,40,50};

int [] arreglo2 = new int[5]
// Genera un arreglo de 5 celdas [0,0,0,0,0]

int tamanyo = arreglo.length // -> retorna el tamaño del arreglo

// Las celdas se indexan a partir de 0, por lo que las celdas
// siempre van desde [0,tamanyo[

// Acceso a una celda:
int y = arreglo1[1] // retorna un 20

// Asignación a una celda:
arreglo2[2] = 31;
// cambia el arreglo a: [0,0,31,0,0]
```

Paso argumentos a un programa:

```java
public static void main (String[] args){
      System.out.println("args.length " + args.length);
      if (args.length > 0){
         System.out.println(args[0]);  
         int x = Integer.parseInt(args[0]);
         int y = Integer.parseInt(args[1]);
         int suma = x + y;
         System.out.println("La suma es: " + suma);
      }
    ...
```

### Valores por referencia y copia

  Al invocar un método, las variables de tipo primitivo, se invocan por copia.
  Los objetos (arreglos, clases, etc.) se envían como una referencia a su ubicación en
  memoria, por tanto si se modifican dentro del método, se modificará las variables que apunten a la misma referencia.

### Recursividad:

 Se encuentra compuesto por dos partes:
  
  * Casos base (triviales)
         
         * Casos donde se puede obtener una solución directa (sin necesidad de un llamado recursivo)
         * Los métodos pueden tener uno o más
         * Son los encargados de detener el ciclo creado por la recursividad
  * Casos recursivos
  
         * Son los casos en donde no se puede obtener una solución directa
         * Llaman de nuevo al mismo método cambiando los parámetros del mismo
         * El objetivo es llegar hasta un caso trivial dados los valores de los parámetros
  
  Ejemplo Sumatoria (con un llamado recursivo)
  
```java
   // Calcula de forma recursiva una sumatoria de un valor n
   // Los métodos recursivos están compuestos de casos base (triviales) y casos recursivos
   // El caso trivial es el más sencillo, del cual se puede derivar una respuesta directa
   // En el caso de la sumatoria, sabemos que el caso base es 0, en donde podemos obtener 
   // directamente el resultado sin realizar cálculos.
   // El caso recursivo busca reducir el espacio del problema hasta llegar al caso base
   // En este caso nuestro caso recursivo será tomar n y calcular la sumatoria de su n-1
   // El resultado es asignado a una variable y retornado 
   // En este ejemplo, si el parámetro recibio es menor a 0, el método retornará 0
   public int calcularSumatoria(int n){
      int resultado = 0;
      if (n <= 0){ // Caso base
         resultado = 0;
      }
      else{ // Caso recursivo
         resultado = n + calcularSumatoria(n-1);
      }
      return resultado;
   }
```


### Matrices

Ejemplos vistos en clase:

Declaración, inicialización y asignación
```java
  int  [][] matriz1 = new int [3][5];
  // 0 0 0 0 0
  // 0 0 0 0 0 
  // 0 0 0 0 0 

  matriz1[0][2] = 12;
  // 0 0 12 0 0
  // 0 0 0  0 0 
  // 0 0 0  0 0 
```

Declaración e inicialización por extensión:

```java
int [][]matriz2 = {
  {1,2},
  {3,4}, 
  {5,6}
};
```

Declaración línea por línea
```java
  int [][] matriz3 = new int [5][];
  matriz3[0] = new int [4];
  matriz3[1] = new int [8];
  matriz3[2] = new int [5];
  matriz3[3] = new int [6];
  matriz3[4] = new int [2];
```

Impresión:

```java
public void imprimir(int [][] matriz){
  for (int  f = 0 ; f < matriz.length ; f++){
    for (int c = 0 ; matriz[f] != null && c < matriz[f].length; c++){
      System.out.print(matriz[f][c] + "\t");
    }
    System.out.println();
  }
}
```