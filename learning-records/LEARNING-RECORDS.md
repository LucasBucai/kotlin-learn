# Clase 1 - Variables

Completado:
- Declaración con val y var.
- Tipos básicos explícitos.
- Inferencia de tipos.
- Reasignación con var.

Observación:
- Preferir val por defecto.
- Usar var solo cuando el valor se reasigna.

# Clase 2 - Funciones básicas

Completado:
- Declaración de funciones con `fun`.
- Parámetros con tipo explícito.
- Tipo de retorno.
- Uso de `return`.
- Llamadas a funciones desde `main`.
- Funciones que devuelven `Int`, `Boolean` y `String`.
- Interpolación de strings con `$name`.

Ejercicios trabajados:
- `sum(num1: Int, num2: Int): Int`.
- `isAdult(age: Int): Boolean`.
- `welcome(name: String): String`.

Observación:
- Para comparar edad adulta, usar `>= 18`, no solo `> 18`.
- Una condición booleana puede devolverse directamente con `return age >= adultAge`.
- En Kotlin, `"Bienvenido, $name"` usa el valor de la variable.
- `"Bienvenido, <name>"` imprime el texto literal `<name>`.

# Clase 3 - if como expresión

Completado:
- Uso de `if` para producir un valor.
- Asignación del resultado de un `if` a una variable o retorno de función.
- Funciones de una sola expresión combinadas con `if`.

Ejercicio trabajado:
- `accessMessage(age: Int): String`.

Observación:
- En Kotlin, `if` puede devolver un valor.
- Cuando `if` se usa como expresión, debe cubrir ambos casos con `else`.
- La función `accessMessage(17)` devuelve `"No puede entrar"`.
- La función `accessMessage(23)` devuelve `"Puede entrar"`.
