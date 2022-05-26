# Sintaxis en Java

- Distingue mayúsculas de minúsculas
- Solo detecta el primer espacio en blanco
- Las instrucciones de una línea acaban
obligatoriamente en ;

## Variables

Sintaxis declaración

modificadorAcceso TipoDeDato identificador;

Reglas para identificadores

- Comiencen por caracteres $ ó _.
- No pueden usar palabras reserveadas
- Buena practica o convención usar camelCase
(a veces se usa snake_case)

## Constantes 

Sintaxis declaración

final TipoDeDato IDENTIFICADOR;

- Obligatoriamente lleva el modificador final
- Buena práctica o convención usar UNDERSCORE_CASE

## Tipos de datos en Java

### Primitivos

1 booleano, 4 numéricos enteros, 2 numéricos flotantes y 1 caracteres
alfanuméricos

Tipo        Valor

boolean     true ó false (muy utilizado)

byte        Enteros de 8 bit

short       Enteros de 16 bit

int         Enteros de 32 bit (muy utilizado)

long        Enteros de 64 bit (el valor tendrá el sufijo L)

float       Flotantes de 32 bit (el valor tendrá el sufijo f)

double      Flotantes de 64 bit (muy utilizado)

char        Caracteres de 16 bit (valores Unicode) van con
            comillas simples

### Tipos Complejos
(Arrays y Objetos)

Todos los complejos dependen de clases propias de Java o clases
creadas por el desarrollador
Clases genéricas

- Array
- Object 
