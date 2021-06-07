//202030799 Manuel Rojas
//Diseñar un algoritmo que lea desde teclado la información
//sobre altura, edad, y sexo (F/M) de los participantes de un
//curso. La lectura finaliza cuando se lee un valor de altura
//negativo. Luego calcule:
//	a. Promedio de altura de las mujeres.
//	b. Promedio de altura de los varones.
//	c. Promedio de edad de los participantes.
Proceso Ejercicio12Parte2
	alturaMT <- 0
	alturaMC <- 0
	alturaFT <- 0
	alturaFC <- 0
	edadT <- 0
	
	Hacer
		Escribir "Ingrese la altura de la persona"
		Leer altura
		Si altura > 0 Entonces
			Escribir "Ingrese la edad de la persona"
			Leer edad
			Escribir "Ingrese el sexo de la persona (F/M)"
			Leer sexo
			
			Si Mayusculas(sexo) == "F" Entonces
				alturaFT <- alturaFT + altura
				alturaFC <- alturaFC + 1
				edadT <- edadT + edad
			SiNo
				Si Mayusculas(sexo) == "M" Entonces
					alturaMT <- alturaMT + altura
					alturaMC <- alturaMC + 1
					edadT <- edadT + edad
				SiNo
					Escribir "No ingresado. Escriba un sexo valido"
				FinSi
			FinSi
		FinSi
	Hasta Que altura <= 0
	
	alturaMP <- alturaMT/alturaMC
	alturaFP <- alturaFT/alturaFC
	edadP <- edadT/(alturaMC+alturaFC)
	
	Escribir "El promedio de altura de las mujeres es: ", alturaFP
	Escribir "El promedio de altura de los varones es: ", alturaMP
	Escribir "El promedio de edad de los participantes es: ", edadP
FinProceso