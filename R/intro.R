# Esto es un comentario. 

# Asignación de variables
var_1 <- 10 

# Generar una secuencia de -10 a 10
x<- seq(from = -10, to = 10, by = 0.01)
y<- x^2 
plot(x, y, type = "l") #Graficar en el eje x la secuencia y en el eje y la funcion. 

### Distribuciones en R ###
x <- seq(from = -10, to = 10, by = 0.01)
y <- dnorm(x^3 , mean = 100 , sd = 35)
plot(x,y , main="Grafica de una cubica")


# Ejercicio 1 (dados)
dado <- 1:6
sample( dado  )   # Simulación de tirar 6 dados 
sample( dado , size = 1  )   # Simulación de tirar 6 dados y obtener el primero. 
tirada <- sample( dado , size = 10000 , replace =T )   # Simulación de tirar 100 dados 

# Probabilidad que el dado saque un 1
length(tirada[ tirada == 1 ])/length(tirada)
#igual a tener la cantidad de veces que sale uno en un arreglo, dividio la cantidad de la muestra


# Ejercicio 2 (monedas)
moneda <- c("cara", "cruz" , "canto")  # Vector que tiene las opciones de tirar una moneda.
probabilidad <- c(0.4999, 0.4999, 0.0002) #Probabilidad de cara, cruz y canto
tirada <- sample( moneda, size=1000 , prob = probabilidad , replace = T )
# Probabilidad de que salga canto en tirar 1000 veces una moneda
length(tirada[tirada="canto"])/length(tirada)

# Ejercicio 3 (tirar dos monedas)
monedas <- c("CC" , "CE", "EC", "EE")
sample( monedas , size=1000, replace = T)

" Tarea
  Lo que tienen que hacer es un generador de un maso de cartas. De las 52 cartas estan 
  divididas en 4. 
"

#install.packages("prob")
library(prob)

draw<-function(){
  cartas<-cards()
  vector<-sample(1:52,5)
  mano <- cartas[vector,]
  return (mano)
}

" Solución de la tarea
  Usaremos una libreria llamada prob, esta ya contiene una funcion llamada cards que contiene 
  todas las cartas, la mandaremos a guardar en una tabla y la retornamos. 
"