import java.util.Scanner
fun vaquinha (conta: Float, pessoas: Float): Float {

return conta/pessoas

} 
fun main (){
    val teclado = Scanner (System. `in`)
    print ("Digite valor da conta:\t")
    var conta: Float = teclado.nextFloat() //70
    print ("Digite a quantidade de pessoas:\t");
    var pessoas: Float = teclado.nextFloat() //1,77
    println (" cada pessoa  " + vaquinha(conta,pessoas))


    //if(imc(peso,altura)<18)
       // print ("sobpeso")
    //else if (imc(peso,altura)>18 && imc(peso,altura)<25)
        //print("ok")
    //else 
        //print ("sobrepeso");
}
