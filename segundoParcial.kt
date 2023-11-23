import java.util.*
import kotlin.concurrent.schedule
/*open class Enemy(val name:String,val fuerza:Int){
    init {
        println("Iniciando superclase  de $name")
    }
    open fun collision(collider:String){
        println("Has chocado con algo")
    }
}
class Goomba:
	Enemy("Goomba",1){
    init {
        println("Iniciando subclase $name")
    }    
}
class Koopa:
	Enemy("Koopa",2){
    override fun collision(collider:String){
        when(collider){
            "Weapon"->{
                state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy"->changeDirection()
        }
    }
        
}
    

class Mario(var vidas:Int = 3){
    init{
        println("It´s me,Mario!!!")
    }
    private var lives = 3;
    	/*set(value){
            if(field ==1){
                field = 0;
            }
        }*/
    
    	
    fun die(){
       
        lives--;
        println("Has perdido una vida")
        
    }
    fun getLives():String{
        return "Mario tiene $lives vidas"
    }
    public fun collision(collisionObj:String){
        when(collisionObj){
            "Goomba"-> die()
            "Super" -> "Super Mario";
        }
    }
    fun gameOver(){
        println("Has perdido el juego");
    }
    
}
*/
fun main() {
    /*
    var mario = Mario();
    
    for(i in 1 .. 5){
        mario.collision("Goomba")
        print(mario.getLives())
        
    }*/
    //CLASES ABSTRACTAS: replicar todo en IntelliJ
    val viajeMonterrey = National("Monterrey")
    viajeMonterrey.quotePrice(4)
    viajeMonterrey.reserve(4)
    //CLASE CON INTERFAZ INMPLEMENTADA Y HEREDANDO DE UNA CLASE
   val viajeMonterreyconDescuento = NationalLowSeason("Monterrey")
   viajeMonterreyconDescuento.reserve(4)
    
    
    
    
}
data class
abstract class Travel{
    abstract val country:String
    abstract val city:String
    protected val serviceType = "viaje"
    protected var reserved = false
    protected var paidAmount = 0
    
    abstract fun quotePrice(numDays:Int)
    protected abstract fun getPrice(numDays:Int):Int
    
    fun reserve(numDays: Int){
        if(reserved){
            println("Ya reservaste tu viaje!,pais: $country,$city,precio:$paidAmount".trimMargin())
            return
        }
        val amount = getPrice(numDays)
        if(amount == 0){
            return;
        }
        reserved = true
        paidAmount = amount
        println("Viaje reservado exitosamente! Pais:$country,Ciudad:$city,precio:$paidAmount".trimMargin())
    }
}
open class National(override val city:String): Travel(){
    override val country = "Mexico"
    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San cristobal de las casas" to 240,
        "San Miguel de Allende" to 320
    )
    override fun getPrice(numDays:Int):Int{
        val fee = fees[city]
        return if(fee==null) 0 else fee*numDays
    }
    override fun quotePrice(numDays:Int){
        val price = getPrice(numDays)
        if(price == 0){
            println("Lo sentimos no hacemos viaje a esta ciudad")
            
        }else{
            println("Tu viaje a $city cuesta: $price")
        }
    }
}

interface IPromotion{
    val discount:Int//el descuento en porcentaje o cantidad
    val typeDiscount:Int//Porcentaje o cantidad
    
    fun getDiscountPrice(amount:Int):Int{//Obtener el precio real ya con el descuento
        return if(typeDiscount == 0){
            (amount * (100-discount))/100
        }else{
            amount- discount
        }
    }
}
class NationalLowSeason(city:String):National(city),IPromotion{
    override val discount = 10 //Es porcentaje
    override val typeDiscount = 0
   
    override fun getPrice(numDays:Int):Int
    {
        val amount = super.getPrice(numDays)
        return if (amount == 0) 0 else getDiscountPrice(amount)
    }
}


class Automovil {
  
    var modelo: String = ""

  
    private var velocidad: Int = 0

   
    protected var color: String = ""

   
    fun acelerar() {
        velocidad += 10
        println("Acelerando a $velocidad km/h")
    }

    
    private fun detener() {
        velocidad = 0
        println("Deteniendo el automóvil")
    }

   
    protected fun cambiarColor(nuevoColor: String) {
        color = nuevoColor
        println("El nuevo color del automóvil es $color")
    }
}


class Persona {
    
    var nombre: String = ""

    
    private var edad: Int = 0

   
    protected var genero: String = ""

   
    fun saludar() {
        println("Hola, mi nombre es $nombre")
    }

  
    private fun cumplirAnios() {
        edad++
        println("¡Feliz cumpleaños! Ahora tengo $edad años")
    }

    
    protected fun definirGenero(nuevoGenero: String) {
        genero = nuevoGenero
        println("Mi género es $genero")
    }
}


class Telefono {
    
    var marca: String = ""

    
    private var modelo: String = ""

    // Atributo protegido
    protected var bateria: Int = 100

    fun llamar() {
        println("Llamando desde el teléfono $marca")
    }

   
    private fun cargarBateria() {
        bateria = 100
        println("La batería del teléfono $marca está completamente cargada")
    }

    
    protected fun usarModoAhorro() {
        println("Usando modo ahorro de energía en el teléfono $marca")
    }
}
