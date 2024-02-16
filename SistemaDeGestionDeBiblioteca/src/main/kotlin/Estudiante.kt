class Estudiante(id: String, nombre: String, val carrera: String): Usuario(id, nombre) {

    private var prestamo = false

    override fun cogerPrestado(usuario: Usuario, libro: Libro) {
        if (prestamo == false) {
            println("El estudiante $nombre puede coger prestado el libro.")
            prestamo = true
        }
        else {
            println("El estudiante $nombre no puede coger prestado el libro.")
        }
    }

}