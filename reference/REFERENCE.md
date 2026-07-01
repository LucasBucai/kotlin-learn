# val vs var

`val` declara una variable que no se puede reasignar.

`var` declara una variable que sí se puede reasignar.

Regla práctica:
usar `val` por defecto y cambiar a `var` solo si el valor necesita cambiar.

# Funciones básicas

Una función se declara con `fun`.

Forma general:

```kotlin
fun nombre(parametro: Tipo): TipoDeRetorno {
    return resultado
}
```

Ejemplo:

```kotlin
fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}
```

## Boolean

Una función puede devolver un `Boolean`.

```kotlin
fun isAdult(age: Int): Boolean {
    val adultAge = 18
    return age >= adultAge
}
```

`>=` significa mayor o igual.

## Funciones de una sola expresión

Si la función devuelve una sola expresión, se puede escribir más corta:

```kotlin
fun welcome(name: String): String = "Bienvenido, $name"
```

## Strings

Para insertar una variable dentro de un texto, usar `$`.

```kotlin
val name = "Lucas"
val message = "Bienvenido, $name"
```

Resultado:

```text
Bienvenido, Lucas
```

Concatenación alternativa:

```kotlin
val message = "Bienvenido, " + name
```

Regla práctica:
preferir `$name` cuando solo se quiere insertar una variable en un texto.
