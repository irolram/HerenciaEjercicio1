fun main() {
    val persona1 = Persona("Iván", 22, "77176762D")

    val estudiante1 = Estudiante("Jesús", 80, "31228599G", "DAM1", 9.5)


    val profesor1 = Profesor("Felipe", 16, "31228599G", "DAM1", 10)


    persona1.mostrarRol()
    estudiante1.mostrarRol()
    estudiante1.mostrarCalificacion()
    profesor1.mostrarRol()
    profesor1.mostrarExperiencia()
}