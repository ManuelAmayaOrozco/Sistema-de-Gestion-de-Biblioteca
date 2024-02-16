sealed class Usuario(val id: String, val nombre: String) {

    abstract fun cogerPrestado(usuario: Usuario, libro: Libro)

}