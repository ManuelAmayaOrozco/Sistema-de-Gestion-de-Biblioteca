fun main(args: Array<String>) {

    val libro1 = Libro("Libro 1", "Yo", 2004)
    val libro2 = Libro("Libro 2", "Tú", 1999)
    val libro3 = Libro("Libro 3", "Él", 2005)

    val estudiante = Estudiante("8888888", "Es Tudiante", "Si")
    val profesor = Profesor("99999999", "Pro Fesor", "Alguno")
    val visitante = Visitante("10101010", "Visi Tante")

    estudiante.cogerPrestado(estudiante, libro1)
    profesor.cogerPrestado(profesor,libro2)
    visitante.cogerPrestado(visitante,libro3)

}