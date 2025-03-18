/* 91 Desenvolva um algoritmo que leia dois valores pelo teclado e
passe esses valores para um procedimento Maior() que vai
verificar qual deles é o maior e mostrá-lo na tela. Caso os dois
valores sejam iguais, mostrar uma mensagem informando essa
característica.*/

fun Maior(value1: Int, value2: Int){
    if(value1 > value2){
        println("$value1 > $value2")
    } else if(value2 > value1){
        println("$value2 > $value1")
    } else {
        println("$value1 == $value2")
    }
}

fun main() {
    print("Digite o valor 1: ");
    var val1 = readln().toInt();

    print("Digite o valor 2: ");
    var val2 = readln().toInt();
    
    Maior(val1, val2);
}

/*92 rie uma lógica que leia um número inteiro e passe para um
procedimento ParOuImpar() que vai verificar e mostrar na tela
se o valor passado como parâmetro é PAR ou ÍMPAR.*/

fun ParOrImpar(num: Int){
    if(num%2==0){
        println("$num é par");
    } else {
        println("$num é ímpar");
    }
}

fun main() {
    print("Digite o valor: ");
    var num = readln().toInt();
    ParOrImpar(num);
}


/*93 Faça um programa que tenha um procedimento chamado Contador()
que recebe três valores como parâmetro: o início, o fim e o
incremento de uma contagem. O programa principal deve solicitar a
digitação desses valores e passá-los ao procedimento, que vai
mostrar a contagem na tela.*/

fun Contador(inicio: Int, fim: Int, incremento: Int) {
    var i = inicio
    while(i <= fim){
        print("$i >> ");
        i += incremento;
    }
    print("FIM")
}

fun main() {
    print("Digite o valor de início: ");
    val inicio = readln().toInt();

    print("Digite o valor do fim: ");
    val fim = readln().toInt();

    print("Digite o valor do incremento: ");
    val incremento = readln().toInt();

    Contador(inicio, fim, incremento);
}

/*94 Desenvolva um aplicativo que tenha um procedimento
chamado Fibonacci() que recebe um único valor inteiro como
parâmetro, indicando quantos termos da sequência serão mostrados
na tela. O seu procedimento deve receber esse valor e mostrar a
quantidade de elementos solicitados.*/

fun Fibonacci(final: Int) {

    if(final <= 0){
        println("Por favor, insira um número maior que zero.");
        return;
    }

    var primeiro = 1;
    var segundo = 1;

    for (i in 1..final) {
        print("$primeiro >> ");
        val proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
    }
    println("FIM");
}

fun main() {
    print("Digite a quantidade de números da sequência de Fibonacci: ");
    val final = readln().toInt();

    Fibonacci(final);
}

//95 Refaça o exercício 90, só que agora em forma de função
//Somador(), que vai receber dois parâmetros e vai retornar o
//resultado da soma entre eles para o programa principal.

fun Somador(a: Int , b: Int): Int {
    return a + b
}

fun main () {
    print("Digite um numero inteiro: ")
    var numero1 =  readln()!!.toInt()
    print("Digite o segundo numero inteiro: ")
    var numero2 = readln()!!.toInt()

    var resultado = Somador(numero1 ,numero2)
    print("o seu resultador é $resultado")
}

//96 Crie um programa que tenha uma função Media(), que vai receber
//as 2 notas de um aluno e retornar a sua média para o programa
//principal.

fun Media(n1: Int , n2: Int): Int {
    return (n1 + n2) / 2
}

fun main() {
    print("Digite sua nota: ")
    var notaap1 = readln()!!.toInt()
    print("Digite sua segunda nota: ")
    var notaap2 = readln()!!.toInt()
    var soma = Media(notaap1 , notaap2)
    print("A sua media é: $soma")
}

//97 Refaça o exercício 91, só que agora em forma de função Maior(),
//mas faça uma adaptação que vai receber TRÊS números como parâmetro
//e vai retornar qual foi o maior entre eles.

fun Maior(a:Int , b:Int , c:Int):Int {
    return maxOf(a , b , c)
}

fun main() {
    print("Digite um valor inteiro: ")
    var n1 = readln()!!.toInt()
    print("Digite um segundo valor: ")
    var n2 = readln()!!.toInt()
    print("Digite um terceiro valor: ")
    var n3 = readln()!!.toInt()
    var resultado = Maior(n1 , n2 , n3)
    print("o maior numero que apareceu é $resultado")
}

//98 Crie um programa que tenha uma função SuperSomador(), que vai
//receber dois números como parâmetro e depois vai retornar a soma
//de todos os valores no intervalo entre os valores recebidos.
//Ex:
//SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
//SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar
//85

fun SuperSomador(a:Int , b:Int):Int{
    val maior = maxOf(a , b)
    val menor = minOf(a, b)

    var soma = 0
    for (num in menor..maior){
        soma += num
    }
    return soma
}

fun main() {
    print("Coloca um numero: ")
    var n1 = readln()!!.toInt()
    print("Coloca outro numero: ")
    var n2 = readln()!!.toInt()
    var resultado = SuperSomador(n1 , n2)
    print("a soma dos intervalos entre os valores de $n1 a $n2 é: $resultado")
}

//99 Faça um programa que possua uma função chamada Potencia(),
//que vai receber dois parâmetros numéricos (base e expoente) e vai
//calcular o resultado da exponenciação.
//Ex: Potencia(5,2) vai calcular 5**2 = 25

fun potencia(base: Int, expoente: Int): Int {
    var resultado = 1
    for (i in 1..expoente) {
        resultado *= base
    }
    return resultado
}

fun main() {
    print("Digite um numero inteiro que voce quer como Base: ")
    var base = readln()!!.toInt()
    print("Digite um numero inteiro que voce quer como expoente: ")
    var expoente = readln()!!.toInt()
    var resultado = potencia(base , expoente)
    print("o resultado da exponenciação é: $resultado")
}

//100 Melhore o exercício 96, criando além da função Media() uma
//outra função chamada Situacao(), que vai retornar para o programa
//principal se o aluno está APROVADO, em RECUPERAÇÃO ou REPROVADO.
//Essa nova função, vai receber como parâmetro o resultado
//retornado pela função Media().

fun Media2 (n1: Int , n2: Int): Int {
    return (n1 + n2) / 2
}

fun Situação(resultado: Int):String {

    if(resultado >=6){
        return "APROVADO"
    }else if(resultado ==5) {
        return "FAZER PROVA SUBSTITUTIVA "
    }else{
        return "REPROVADO"
    }
}


fun main() {
    print("Digite sua nota: ")
    var nota1 = readln()!!.toInt()
    print("Digite sua segunda nota: ")
    var nota2 = readln()!!.toInt()
    var soma = Media2(nota1 , nota2)
    var resultado = Situação(soma)
    println("A sua media é: $soma")
    println("Resultado: $resultado")
    }