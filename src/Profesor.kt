class Profesor (nombre: String, edad: Int, id: String, val departamento: String, val aniosExperiencia: Int):Persona(nombre, edad, id) {

    override fun mostrarRol() {

        println("Rol: profesor")
    }

    fun mostrarExperiencia(){
        println(aniosExperiencia)
    }
}