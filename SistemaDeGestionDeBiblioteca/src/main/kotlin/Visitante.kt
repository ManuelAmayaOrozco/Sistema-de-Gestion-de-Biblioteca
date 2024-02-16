class Visitante(id: String, nombre: String): Usuario(id, nombre) {

    override fun cogerPrestado(usuario: Usuario, libro: Libro) {
        println("Los visitantes no pueden coger libros prestados.")
    }

}