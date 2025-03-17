fun main() {
    println("Hello World!")
}

/**
 *Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas-
 *vindas para ela:
 *
 *Ex:
 *Qual é o seu nome? João da Silva
 * Olá João da Silva, é um prazer te conhecer!
 */

fun main() {
    println("Digite seu nome")
    val name = readln()
    println("Ola $name ")
}

//3 Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
//mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.

fun main() {
    println("Digite seu nome")
    val name = readln()
    println("Digite seu salario")
    val salario = readln()
    println("Ola $name Seu Salario é $salario")
}

//4 - Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

fun main() {
    print("Digite um numero: ")
    val number1 = readln().toDouble();
    print("Digite um numero: ")
    val number2 = readln().toDouble();
    val soma = number1 + number2;
    println("Ola sua soma é $soma")
}

//5 - Faça um programa em Kotlin que leia as duas notas de um aluno em uma matéria e
//mostre na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5

fun main() {
    print("Digite a AP1: ")
    val AP1 = readln().toDouble();
    print("Digite a AP2: ")
    val AP2 = readln().toDouble();

    val media = (AP1 + AP2) / 2;

    println("Sua média é $media")
}

//6
//Faça um programa em Kotlin que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

fun main() {
    print("Digite um número: ")
    val numero = readln().toInt();
    val antecessor = numero - 1;
    val sucessor = numero + 1;
    println("antecessor: $antecessor");
    println("sucessor $sucessor");

}

//7 Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
//e a sua terça parte.
//Ex: Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

fun main() {
    print("Digite um numero: ")
    val numero = readln().toDouble();
    val dobro = numero * 2;
    val terca_parte = numero / 3;
    println("O dobro de $numero é: $dobro ")
    println("A terça parte de $numero é: $terca_parte")

}

//8 Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
//valores relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 100
//Distância de 10000 Cm

fun main() {
    print("Digite um numero: ")
    val metros = readln().toDouble();
    val cm = metros * 100

    println("$metros é equivalente a $cm")

}


//9 Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
//R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
//cotação atual)

fun main() {
    print("Quantidade de Real: ")
    val real = readln().toDouble();
    val dolar = real * 3.45

    println("$real é equivalente a $dolar")

}

//10 Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

fun main() {
    print("Digite a Largura: ")
    val largura = readln().toDouble();

    print("Digite a Altura: ")
    val altura = readln().toDouble();

    val area = altura * altura
    val quantidade = area / 2

    println("Sera nescessario $quantidade litros de tinta para pintar $area metros quadrados ")

}

