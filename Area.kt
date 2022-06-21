package math

import java.util.Scanner
import java.lang.IllegalArgumentException
import kotlin.math.pow

fun areaDoCirculo(raio: Double) =
when {
    raio > 0 -> Math.PI * raio.pow(2.0)
    else -> throw IllegalArgumentException("raio precisam ser positivo")
}

fun areadoRetangulo(largura: Double, altura: Double) =  when {
    largura > 0 && altura > 0 -> largura * altura
   else -> throw IllegalArgumentException("largura e altura precisam ser positivos")
}
fun areadoQuadrado(largura: Double) =
when {
    largura > 0 -> largura * largura
    else -> throw IllegalArgumentException("Largura precisa ser positiva")
}
fun  areadoTriangulo(base: Double, height: Double) =
    when {
        base > 0 && height > 0 -> base * height / 2
        else -> throw IllegalArgumentException("Base and Height must be positive")
    }


fun main(){
    val teclado = Scanner(System.`in`)
    println("Digite qual área quer calcular\n1.Área do círculo\n2.Área do quadrado\n3.Área do retângulo\n4.Área do triângulo")
    var opcao:Int = teclado.nextInt();
    when(opcao){
        1->{  print("Digite o valor do raio:\t");
            var raio:Double= teclado.nextDouble();
            println ("Área do circulo:\t" + areaDoCirculo(raio));
        }
        2->{print("Digite a largura\t");
            var largura:Double = teclado.nextDouble();
            println("Área do quadrado:\t" + areadoQuadrado(largura));
        }
        3->{ print("Digite o valor da largura:\t");
            var largura:Double = teclado.nextDouble();
            print("Digite o valor da altura:\t");
            var altura:Double = teclado.nextDouble();
            print("Área do retângulo:\t " + areadoRetangulo(altura,largura));
        }
        4->{print("Digite o valor da altura:\t");
            var altura:Double = teclado.nextDouble();
            print("Digite o valor da base:\t");
            var base:Double = teclado.nextDouble();
            print("Área do triângulo:\t " + areadoTriangulo(altura,base));
        }
        else-> println("Opção inválida");
    }
} 