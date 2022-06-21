import java.util.Scanner 
fun main (){
    val teclado = Scanner(System. `in`);
    print("Digite um número do mês que nasceu:\t");
    var mes = teclado. nextInt()
    val mesString = when(mes){
        1-> "janeiro"
        2-> "fevereiro"
        3-> "março"
        4-> "abril"
        5-> "maio"
        6-> "junho"
        7-> "julho"
        8-> "agosto"
        9-> "setembro"
        10-> "outubro"
        11-> "novembro"
        12-> "dezembro"
        else-> "mêm inválido"
    }
    println("você nasceu em "+mesString);
}