PRÁCTICA TESTING


1. EJEMPLO: countPositive

1) El fallo del código se encuentra en la línea 14, dentro de la sentencia if. Esta sentencia se utiliza para determinar los números del array que son positivos, pero considera el 0 como positivo, el cual es un número neutro ni positivo ni negativo, por lo que el fallo está en el igual después del mayor que. Simplemente quitando ese igual, el código estaría bien.

2) Implementado en fichero CountPositiveTest
No ejecuta el fallo del programa porque todos los números son negativos

3) Implementado en fichero CountPositiveTest
En esta prueba ocurre el error de que en el programa se considera 0 como número positivo

4) No es posible, porque ni la variable contadora del bucle ni el contador pueden fallar, ya que sin importar los elementos del array funcionarán sin errores, aunque el resultado no sea el esperado.

6) Implementado en fichero CountPositive



2. EJEMPLO: lastZero

1) El fallo del código se encuentra en el bucle for. Se quiere buscar el último cero del array para devolver su posición, pero al ser un bucle incremental, al encontrar el primero terminará la ejecución. Para corregirlo, hbaría que convertir el bucle en uno decremental, es decir, inicializarlo a la última posición del array y desde ahí, bajar uno por uno.

2) No es posible, porque el fallo se encuentra en el bucle for y sin entrar en él no es posible ejecutar el programa.

3) Implementado en fichero LastZeroTest
En esta prueba ocurre que se devuelve la posición del primer cero cuando los esperado es la posición del último.

4) No es posible, porque el bucle funciona de manera correcta, el fallo es que no realiza la tarea requerida sino que realiza otra

6) Implementado en fichero LastZero



3. EJEMPLO: findLast

1) El fallo del código se encuentra al inicializar la variable contadora del bucle. Se debería incluir el 0. Si se terminar el bucle en mayor que 0, entonces si el tamaño de éste es 5, se contarán 4 posiciones, por lo que no comprobaría una.

2) No es posible, porque el fallo se encuentra en el bucle for y sin entrar en él no es posible ejecutar el programa.

3) Implementado en fichero FindLastTest
En esta prueba el programa no entra en la posición del 2, por lo que devuelve -1

4) No es posible, porque el bucle simplemente no accede a la última posición del array, pero eso no es error ni de compilación ni de ejecución

6) Implementado en fichero FindLast



4. EJEMPLO: oddOrPos

1) El fallo del código se encuentra en que, si el número es negativo, no importa si es par o impar no se contará. Este fallo se refleja en el if. Para corregirlo habrá que realizar la operación del módulo en valor absoluto y luego ya comparar si es 1 o no.

2) Implementado en OddOrPosTest
No ejecuta el fallo porque todos los números son positivos

3) Implementado en OddOrPosTest

4) No es posible, porque ni la variable contadora del bucle ni el contador pueden fallar, ya que sin importar los elementos del array funcionarán sin errores, aunque el resultado no sea el esperado.

6) Implementado en OddOrPos


