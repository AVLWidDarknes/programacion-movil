/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import kotlin.math.pow

const val PI = 3.1416f
const val PHI =  1.618f
fun circleArea(radius:Float):Float{
    return PI * radius.pow(2);
}
fun getPI():Float{
    return PI;
}
fun printPhi(){
    println("El numero auero vale $PHI")
}
fun main() {
    val radius = 4f;
    val area = circleArea(radius);
    println("El area del circulo es : ${area}")
    println("El valor de pi es: ${getPI()}")
    printPhi();
    if(login("AVLWID","12345")){
        println("El usuario y la contraseña fueron llenados correctamente")
    }else{
        "El usuario y/o la contraseña están vacios"
    }
    val uservalidate = login("AVLWID","12345")
    println("Usuario loggeado? $uservalidate")
    
    println("Area con valores por defecto: ${rectangleArea()}")
    println("Area con valores por defecto: ${rectangleArea(height = 10.0)}")
    println("Area con named arguments: ${rectangleArea(height = 10.0,base = 10.0)}")
    println("El volumen del rectangulo es: ${volumenPrismaRectangular(10.0,10.0,10.0)}")
	imprimir()
    imprimir("Remplazo del primer valor por defecto")
    promedio(10f)
    
    val nombres = listOf("Kirby","Fox","Pikachu","")
    for(i in 1 until 10){
        println(i);
   
    }
   
    for(nombre in nombres){
        println(nombre)
    }
    println("Ciclo foreach:")
    nombres.forEach{
        println(it)
    }
    println("----Secuencia de control----")
    for(nombre in nombres){
        println(nombre)
        if(nombre == "Fox"){
            println("El personaje $nombre se encontró")
            break;
        }
    }
    var x = 10;
    while(x > 0){
        println(x)
        x--;
    }
    val lista = listOf("Pedro Luis","Juan Manuel","Juan Luis","María Ines","Romeo","Ernesto","Juan Pedro","Ariadna"
                      ,"Mireya María","Ana Sofía","José Juan","Pedro Luis","Pedro Luis","Michell")
    val nombre = lista[0];
    fun nombreRep(nombreP:String):Int{
    	var rep = 0;
    	for(name in lista){
        	if(name == nombreP){
            	rep++;
        	}
        
    	}
    	return rep;
	}
    
	println("El numero de veces que se repite el nombre $nombre es ${nombreRep(nombre)}")
    var y:Int = 20;
    do{
       println(y)
       y--
    }while(y > 0)
    println("El index del nombre Pedro Luis es ${lista.indexOf("Romeo")}")
    println("El último elemento de la lista de nombres es ${lista[lista.size-1]}")
    
    val list = mutableListOf(1,2,3,4)
    list.add(5)
   	
    val numSet: Set<Int> = setOf(0,1,2,3,4,5,5)
    val reverseNumSet:Set<Int> = setOf(0,1,2,3,4,5)
    
   
    
    for(number in numSet){
        println(number)
        
    }
    
    val namesToAges:Map<String,Int> = mapOf("Juan" to 20,"Yami" to 25,"Diana" to 33)
    
    println(namesToAges["Yami"])
    
    for((nombre,edad) in namesToAges){
        println("El nombre es $nombre y la edad es: $edad")
    }
    
    //Instancia de una clase
		val hugo = Persona("Hugo Sanchez Perez", 25);
		println("El nombre de la persona es ${hugo.nombre}");
    
    
}
//Funciones locales, funcion dentro de una funcion.
fun login(user:String,password:String):Boolean{
    fun validate(input:String):Boolean{
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)
    
    return userValidated && passValidated
}
fun rectangleArea(base:Double = 20.0,height:Double = 19.0):Double{
    return base * height
}
fun volumenPrismaRectangular(base:Double,height:Double,profundidad:Double):Double{
	return rectangleArea(base,height) * profundidad
}
fun imprimir(
	valor:String = "Este es el primer valor por defecto",
    valor1:String = "Este es el segundo valor por defecto"
){
    println(valor)
    println(valor1)
}
fun promedio(
    calificacion1:Float,
    calificacion2:Float = 8f,
    calificacion3:Float = 8f
){
    println("El promedio del alumno es ${(calificacion1+calificacion2+calificacion3)/3}")
}
//Tarea Clases y objetos: crear una clase y instanciar clases
/* Kotlin */
class Persona {
    var nombre: String
    var edad: Int
    constructor(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
}