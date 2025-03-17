//21 - Faça um algoritmo que leia um determinado ano e mostre se ele é ou não BISSEXTO.

fun main() {
    print("Digite um ano: ")
    val ano = readln().toInt()

    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
        println("O ano $ano é BISSEXTO.")
    } else {
        println("O ano $ano não é BISSEXTO.")
    }
}

//22 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua situação em relação ao alistamento militar.
//Se estiver antes dos 18 anos, mostre em quantos anos faltam para o alistamento.
//Se já tiver mais de 18 anos, mostre quantos anos já se passaram do alistamento.

fun main() {
    print("Digite o ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val idade = 2023 - anoNascimento

    if (idade < 18) {
        println("Faltam ${18 - idade} anos para o alistamento.")
    } else {
        println("Já se passaram ${idade - 18} anos do alistamento.")
    }
}

//23 - Uma loja quer dar descontos para todos, mas especialmente para mulheres.
//Faça um programa que leia nome, sexo e o valor das compras do cliente e calcule o preço com desconto.
//Homens ganham 5% de desconto.
//Mulheres ganham 13% de desconto.

fun main() {
    print("Digite o nome do cliente: ")
    val nome = readln()

    print("Digite o sexo do cliente (M/F): ")
    val sexo = readln().uppercase()

    print("Digite o valor das compras: ")
    val valorCompras = readln().toDouble()

    val desconto = if (sexo == "F") 0.13 else 0.05
    val valorFinal = valorCompras * (1 - desconto)

    println("O valor final com desconto é: R$$valorFinal")
}

//24 - Faça um algoritmo que pergunte a distância que um passageiro deseja percorrer em Km.
//Calcule o preço da passagem, cobrando R$0,50 por Km para viagens até 200Km e R$0,45 para viagens mais longas.

fun main() {
    print("Digite a distância a ser percorrida (Km): ")
    val distancia = readln().toDouble()

    val preco = if (distancia <= 200) {
        distancia * 0.50
    } else {
        distancia * 0.45
    }

    println("O preço da passagem é: R$$preco")
}

//25- [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas retas.
//Regra Matemática: Para três segmentos formarem um triângulo, o comprimento de cada lado deve ser menor que a soma dos outros dois.

fun main() {
    print("Digite o comprimento do primeiro segmento: ")
    val a = readln().toDouble()

    print("Digite o comprimento do segundo segmento: ")
    val b = readln().toDouble()

    print("Digite o comprimento do terceiro segmento: ")
    val c = readln().toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        println("É possível formar um triângulo com esses segmentos.")
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}

//26 - Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando na tela uma das mensagens abaixo:
//O primeiro valor é o maior
//O segundo valor é o maior
//Não existe valor maior, os dois são iguais

fun main() {
    println("Numero 1: ")
    val num1 = readln().toInt()

    println("Numero 2: ")
    val num2 = readln().toInt()

    if (num1 > num2) {
        return println("O primeiro valor é o maior")
    }
    if(num2 > num1) {
        return println("O segundo valor é o maior")
    }
    return println("não existe valor maior, os dois são iguais")
}

//27 - Crie um programa que leia duas notas de um aluno e calcule
//a sua média, mostrando uma mensagem no final, de acordo com a
//média atingida:
//• Média até 4.9: REPROVADO
//• Média entre 5.0 e 6.9: RECUPERAÇÃO
//• Média 7.0 ou superior: APROVADO

fun main() {
    println("Nota 1: ")
    val nota1 = readln().toDouble()

    println("Nota 2: ")
    val nota2 = readln().toDouble()

    val media = nota1 + nota2 / 2

    if (media <= 4.9) { return println("REPROVADO")}
    if (media <= 6.9 ) { return println("RECUPERAÇÃO")}
    return println("APROVADO")
}

//28 - Faça um programa que leia a largura e o comprimento de um terreno retangular, calculando e mostrando a sua área em m².
//
//O programa também deve mostrar a classificação do terreno:
//Abaixo de 100m² → TERRENO POPULAR
//Entre 100m² e 500m² → TERRENO MASTER
//Acima de 500m² → TERRENO VIP

fun main() {
    println("Digite a largura do terreno (em metros):")
    val largura = readLine()!!.toDouble()

    println("Digite o comprimento do terreno (em metros):")
    val comprimento = readLine()!!.toDouble()

    val area = largura * comprimento

    println("A área do terreno é: %.2f m²".format(area))

    when {
        area < 100 -> println("Classificação: TERRENO POPULAR")
        area in 100.0..500.0 -> println("Classificação: TERRENO MASTER")
        area > 500 -> println("Classificação: TERRENO VIP")
    }
}

//29 - Desenvolva um programa que leia o nome de um funcionário, seu salário, quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de acordo com a tabela a seguir:
//Até 3 anos de empresa → aumento de 3%
//Entre 3 e 10 anos → aumento de 12.5%
//10 anos ou mais → aumento de 20%

fun main() {
    println("Digite o nome do funcionário:")
    val nome = readLine()!!

    println("Digite o salário do funcionário (em R$):")
    val salario = readLine()!!.toDouble()

    println("Digite quantos anos o funcionário trabalha na empresa:")
    val anosTrabalho = readLine()!!.toInt()

    val novoSalario = when {
        anosTrabalho <= 3 -> salario * 1.03  // Aumento de 3%
        anosTrabalho in 4..10 -> salario * 1.125  // Aumento de 12.5%
        anosTrabalho > 10 -> salario * 1.20  // Aumento de 20%
        else -> salario
    }

    println("Funcionário: $nome")
    println("Salário atual: R$ %.2f".format(salario))
    println("Novo salário: R$ %.2f".format(novoSalario))
}

//30 - [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo de triângulo será formado:
//
//EQUILÁTERO → todos os lados iguais
//ISÓSCELES → dois lados iguais
//ESCALENO → todos os lados diferentes

fun main() {
    print("Digite o comprimento do primeiro segmento: ")
    val a = readLine()!!.toDouble()

    print("Digite o comprimento do segundo segmento: ")
    val b = readLine()!!.toDouble()

    print("Digite o comprimento do terceiro segmento: ")
    val c = readLine()!!.toDouble()

    if (a < b + c && b < a + c && c < a + b) {
        println("É possível formar um triângulo com esses segmentos.")

        when {
            a == b && b == c -> println("O triângulo é EQUILÁTERO (todos os lados iguais).")
            a == b || a == c || b == c -> println("O triângulo é ISÓSCELES (dois lados iguais).")
            else -> println("O triângulo é ESCALENO (todos os lados diferentes).")
        }
    } else {
        println("Não é possível formar um triângulo com esses segmentos.")
    }
}