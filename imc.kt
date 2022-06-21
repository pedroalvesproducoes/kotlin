import java.util.Scanner
fun imc (peso: Float, altura: Float): Float {

return peso/(altura*altura)

} 
fun main (){
    val teclado = Scanner (System. `in`)
    print ("Digite o Peso:\t")
    var peso: Float = teclado.nextFloat() //70
    print ("Digite a altura:\t")
    var altura: Float = teclado.nextFloat() //1,77
    if(imc(peso,altura)<18)
        print ("sobpeso")
    else if (imc(peso,altura)>18 && imc(peso,altura)<25)
        print("ok")
    else 
        print ("sobrepeso");
}
