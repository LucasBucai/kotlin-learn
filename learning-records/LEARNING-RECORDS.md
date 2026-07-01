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
