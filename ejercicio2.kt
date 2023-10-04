const val PI =3.1416;
fun main() {
    //Por defecto nos asigna un tipo de dato double a la variable decimal
    val decimal = 5.45;
    println(PI);
    //Conversión de una variable a flotante
    val flotante = 6.1715f;
    println(flotante);
    
    //Tienen que ser dos variables decimales
    val perimetro = PI * (2 * decimal);
    
    println("El perimetro del circulo con radio $decimal es: $perimetro")
    
    
}