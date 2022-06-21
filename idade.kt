import java.util.Scanner

fun idade(ano: Int): Int {
    
    return 2022 - ano;
}

fun main() {

   val teclado = Scanner(System.`in`)
   print("Digite o ano que nasceu: ")

   var ano:Int = teclado.nextInt()

   print("Sua idade atual : " + idade(ano))
}
