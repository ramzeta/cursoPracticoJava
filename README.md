# Proyecto Java: Guía de Fundamentos y Tecnologías

## Índice

1. [Fundamentos del lenguaje Java](#fundamentos-del-lenguaje-java)
2. [Colecciones](#colecciones)
3. [Entrada/Salida](#entraday-salida)
4. [Concurrency](#concurrency)
5. [Networking](#networking)
6. [Fechas y Tiempo](#fechas-y-tiempo)
7. [Streams y Lambda](#streams-y-lambda)
8. [JDBC](#jdbc)
9. [Seguridad](#seguridad)
10. [JNDI y JMX](#jndi-y-jmx)
11. [JavaFX](#javafx)
12. [Anotaciones y Reflexión](#anotaciones-y-reflexión)

---

## Fundamentos del lenguaje Java

### java.lang.Object
- Clase raíz de todas las clases en Java.
- Provee métodos como `toString()`, `equals()`, y `hashCode()`.

### java.lang.String
- Clase inmutable para manipular cadenas de caracteres.
- Ofrece métodos como `concat()`, `substring()`, y `length()`.

### java.lang.Math
- Clase con métodos estáticos para operaciones matemáticas.
- Ejemplo: `Math.sqrt()`, `Math.abs()`.

### java.lang.System
- Provee acceso a funcionalidades relacionadas con el sistema.
- Ejemplo: `System.currentTimeMillis()`, `System.out.println()`.

---

## Colecciones

### java.util.List
- Interfaz para listas ordenadas.
- Implementaciones: `ArrayList`, `LinkedList`.

### java.util.Set
- Interfaz para conjuntos sin elementos duplicados.
- Implementaciones: `HashSet`, `TreeSet`.

### java.util.Map
- Interfaz para mapear claves únicas a valores.
- Implementaciones: `HashMap`, `TreeMap`.

### java.util.Queue
- Interfaz para colas FIFO (First-In-First-Out).
- Implementaciones: `LinkedList`, `PriorityQueue`.

---

## Entrada/Salida

### java.io.File
- Clase para manipular archivos y directorios.

### java.io.FileInputStream / java.io.FileOutputStream
- Clases para lectura y escritura de archivos en bytes.

### java.io.InputStreamReader / java.io.OutputStreamWriter
- Clases para lectura y escritura de caracteres.

---

## Concurrency

### java.util.concurrent.ExecutorService
- Interfaz para ejecución de tareas en hilos.

### java.util.concurrent.Future
- Representa el resultado de una operación asincrónica.

### java.util.concurrent.locks.Lock
- Interfaz para mecanismos de bloqueo.

---

## Networking

### java.net.Socket / java.net.ServerSocket
- Clases para programación de sockets.

### java.net.URL
- Clase para representar un URL.

---

## Fechas y Tiempo

### java.time.LocalDate / java.time.LocalDateTime / java.time.ZonedDateTime
- Clases para manipulación de fechas y tiempos.

---

## Streams y Lambda

### java.util.stream.Stream
- Clase para operaciones de procesamiento de datos en secuencia.

### java.util.function.Predicate / java.util.function.Function
- Interfaces funcionales para operaciones lambda.

---

## JDBC

### java.sql.Connection / java.sql.Statement / java.sql.ResultSet
- Clases para conexión y manipulación de bases de datos.

---

## Seguridad

### java.security.KeyStore / java.security.PublicKey / java.security.PrivateKey
- Clases para almacenamiento y manipulación de claves.

---

## JNDI y JMX

### javax.naming.InitialContext
- Clase para acceder al servicio de nombres.

### javax.management.MBeanServer
- Interfaz para gestionar beans de Java.

---

## JavaFX (si es relevante)

### javafx.scene.Scene / javafx.stage.Stage
- Clases para crear interfaces gráficas.

---

## Anotaciones y Reflexión

### java.lang.annotation.Annotation
- Interfaz para definir anotaciones.

### java.lang.Class / java.lang.reflect.Method
- Clases para manipulación de clases y métodos en tiempo de ejecución.

---
