class Profesor(id: String, nombre: String, val departamento: String): Usuario(id, nombre) {

    private var prestamo = false

    override fun cogerPrestado(usuario: Usuario, libro: Libro) {
        if (prestamo == false) {
            println("El profesor $nombre puede coger prestado el libro.")
            prestamo = true
        }
        else {
            println("El profesor $nombre no puede coger prestado el libro.")
        }
    }

}