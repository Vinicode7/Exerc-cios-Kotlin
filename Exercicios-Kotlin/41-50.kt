//41 Desenvolva um programa que mostre na tela a seguinte contagem:
//100 95 90 85 80 ... 0 Acabou!

fun main (){
    var i = 100
    while (i >= 0){
        println(i)
        i -= 5
    }
    print("Acabou!")
}

//42 Faça um algoritmo que pergunte ao usuário um número
//inteiro e positivo qualquer e mostre uma contagem até esse
//valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

fun main (){
    print("Digite um número inteiro positivo: ")
    val n = readLine()!!.toInt()
    var i = 1
    while ( i <= n){
        println(i)
        i ++
    }
    print("Acabou!")
}

//43 Desenvolva um algoritmo que mostre uma contagem regressiva de
//////30 até 1, marcando os números que forem divisíveis por 4,
//////exatamente como mostrado abaixo:
//////30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...

fun main(){
    var i = 30
    while (i >= 1){
        if( i % 4 == 0){
            println("[$i]")
        }else{
            println(i)
        }
        i --
    }
}

//44 Crie um algoritmo que leia o valor inicial da contagem, o
//valor final e o incremento, mostrando em seguida todos os
//valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
// Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!

fun main() {
    var primeiroValor = 3
    var ultimoValor = 10
    var incremento = 2
    while (primeiroValor <= ultimoValor) {
        print("$primeiroValor ")
        primeiroValor += incremento
    }
    print("Acabou!")
}

//45 O programa acima vai ter um problema quando digitarmos o
//primeiro valor maior que o último. Resolva esse problema com um
//código que funcione em qualquer situação.
//

fun main() {
    print("Digite seu primeiro valor: ")
    var primeiroValor = readLine()!!.toInt()
    print("Digite seu último valor: ")
    var ultimoValor = readLine()!!.toInt()
    print("Digite seu incremento: ")
    var incremento = readLine()!!.toInt()

    if (primeiroValor > ultimoValor) {
        print("Ocorreu um erro!! o primeiro valor não pode ser maior que o ultimo!")
    }else{
        while  (primeiroValor <= ultimoValor){
            print("$primeiroValor ")
            primeiroValor += incremento
        }
        print("Acabou!")
    }
}

//46 Crie um programa que calcule e mostre na tela o resultado da
//soma entre 6 + 8 + 10 + 12 + 14 + ... + 98 + 100.
//
fun main (){
    var i = 6
    var soma = 0
    while (i <= 100){
        print(i)
        soma += i

        if (i < 100){
            print("+")
        }
        i += 2
    }
    println(" = $soma")
}

//47 Desenvolva um aplicativo que mostre na tela o resultado da
//expressão 500 + 450 + 400 + 350 + 300 + ... + 50 + 0
//
fun main(){
    var soma = 0
    var i = 500
    while (i >= 0){
        print(i)
        soma += i

        if (i > 0){
            print("+")
        }
        i -= 50
    }
    print("= $soma")
}

//48 Faça um programa que leia 7 números inteiros e no final
//mostre o somatório entre eles.
//
fun main (){
    var qtd = 0
    var soma = 0
    while (qtd < 7){
        print("Digite um numero: ")
        val numero = readLine()!!.toInt()
        soma += numero
        qtd ++
    }
    print("soma $soma")
}

//49 Crie um programa que leia 6 números inteiros e no final mostre
//quantos deles são pares e quantos são ímpares.
//
fun main(){
    var par = 0
    var impar = 0
    var qtd = 1
    while (qtd <= 6){
        print("Digte um numero inteiro: ")
        val numero = readLine()!!.toInt()
        if (numero %2 == 0){
            par += 1
        }else{
            impar += 1
        }
        qtd ++
    }
    print("numeros impares: $impar numeros pares: $par")
}


//50 Desenvolva um programa que faça o sorteio de 20 números
//entre 0 e 10 e mostre na tela:
//
//• Quais foram os números sorteados
//• Quantos números estão acima de 5
//• Quantos números são divisíveis por 3

import kotlin.random.Random

fun main(){
    var numerosAcimaDe5 = 0
    var numerosDivisiveisPor3 = 0
    var qtd = 0
    while (qtd < 20){
        val numero = Random.nextInt(0 , 11)
        println("numero aleatório: $numero ")

        if (numero >  5){
            numerosAcimaDe5 ++
        }

        if (numero %3 ==0 ){
            numerosDivisiveisPor3 ++
        }
        qtd ++
    }
    println("Numero acima de 5: $numerosAcimaDe5")
    println("Numero dividido por 3: $numerosDivisiveisPor3")
}