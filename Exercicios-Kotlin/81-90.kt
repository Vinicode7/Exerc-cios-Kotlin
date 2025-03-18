//81 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 8, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor' para armazenar as idades.
// 3. Solicite ao usuário que digite as idades de 8 pessoas, armazenando cada idade no vetor 'idades'.
// 4. Calcule a soma de todas as idades e, em seguida, calcule a média das idades.
// 5. Encontre a maior idade no vetor.
// 6. Imprima a média das idades.
// 7. Imprima as posições e idades das pessoas com mais de 25 anos.
// 8. Imprima a maior idade digitada e as posições em que ela aparece no vetor.

package Passo_8

fun main() {
    val tamanhoVetor = 8
    val idades = IntArray(tamanhoVetor)

    var somaIdades = 0
    for (i in 0 until tamanhoVetor) {
        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
        somaIdades += idades[i]
    }

    val mediaIdade = somaIdades.toDouble() / tamanhoVetor

    var maiorIdade = idades[0]
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println("\nMédia de idade: $mediaIdade")

    println("\nPosições com pessoas com mais de 25 anos:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] > 25) {
            println("Posição ${i + 1}: ${idades[i]} anos")
        }
    }

    println("\nMaior idade digitada: $maiorIdade")

    println("\nPosições da maior idade:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] == maiorIdade) {
            println("Posição ${i + 1}")
        }
    }
}

//82 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 10, representando o tamanho do vetor.
// 2. Crie um vetor de números decimais (Double) de tamanho 'tamanhoVetor' para armazenar as notas dos alunos.
// 3. Solicite ao usuário que digite as notas de 10 alunos, armazenando cada nota no vetor 'notas'.
// 4. Calcule a soma das notas e, em seguida, calcule a média das notas da turma.
// 5. Encontre a maior nota entre as notas dos alunos.
// 6. Imprima a média da turma.
// 7. Imprima os alunos que estão acima da média, junto com suas notas.
// 8. Imprima o total de alunos que estão acima da média.
// 9. Imprima a maior nota digitada e as posições onde ela foi registrada.

package Passo_8

fun main() {
    val tamanhoVetor = 10
    val notas = DoubleArray(tamanhoVetor)

    var somaNotas = 0.0
    for (i in 0 until tamanhoVetor) {
        print("Digite a nota do ${i + 1}º aluno: ")
        notas[i] = readLine()!!.toDouble()
        somaNotas += notas[i]
    }

    val mediaTurma = somaNotas / tamanhoVetor

    var maiorNota = notas[0]
    for (nota in notas) {
        if (nota > maiorNota) {
            maiorNota = nota
        }
    }

    println("\nMédia da turma: $mediaTurma")

    var alunosAcimaMedia = 0
    println("\nAlunos acima da média:")
    for (i in 0 until tamanhoVetor) {
        if (notas[i] > mediaTurma) {
            println("Aluno ${i + 1}: Nota ${notas[i]}")
            alunosAcimaMedia++
        }
    }
    println("Total de alunos acima da média: $alunosAcimaMedia")

    println("\nMaior nota digitada: $maiorNota")

    println("\nPosições da maior nota:")
    for (i in 0 until tamanhoVetor) {
        if (notas[i] == maiorNota) {
            println("Posição ${i + 1}")
        }
    }
}

//83 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 20, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Preencha o vetor com números aleatórios entre 0 e 100.
// 4. Imprima os números gerados no vetor.
// 5. Ordene os números do vetor em ordem crescente.
// 6. Imprima os números do vetor após a ordenação.

package Passo_8

import kotlin.random.Random

fun main() {
    val tamanhoVetor = 20
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = Random.nextInt(0, 100)
    }

    println("Números gerados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()

    vetor.sort()

    println("\nNúmeros ordenados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()
}

//84 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 9, representando o tamanho do vetor.
// 2. Crie um vetor de strings chamado 'nomes' para armazenar o nome de 9 pessoas.
// 3. Crie um vetor de inteiros chamado 'idades' para armazenar a idade de 9 pessoas.
// 4. Solicite ao usuário que digite o nome e a idade de 9 pessoas, armazenando os dados nos vetores 'nomes' e 'idades'.
// 5. Imprima os nomes e idades das pessoas que são menores de idade (menos de 18 anos).

package Passo_8

fun main() {
    val tamanhoVetor = 9
    val nomes = Array(tamanhoVetor) { "" }
    val idades = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o nome da ${i + 1}ª pessoa: ")
        nomes[i] = readLine()!!

        print("Digite a idade da ${i + 1}ª pessoa: ")
        idades[i] = readLine()!!.toInt()
    }

    println("\nPessoas menores de idade:")
    for (i in 0 until tamanhoVetor) {
        if (idades[i] < 18) {
            println("Nome: ${nomes[i]}, Idade: ${idades[i]}")
        }
    }
}

//85 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 5, representando o número de funcionários.
// 2. Crie um vetor de strings chamado 'nomes' para armazenar o nome dos funcionários.
// 3. Crie um vetor de strings chamado 'sexos' para armazenar o sexo dos funcionários (M/F).
// 4. Crie um vetor de números decimais (Double) chamado 'salarios' para armazenar o salário dos funcionários.
// 5. Solicite ao usuário que digite o nome, o sexo e o salário de 5 funcionários.
// 6. Imprima os nomes e salários das funcionárias mulheres que ganham mais de R$5.000,00.

package Passo_8

fun main() {
    val tamanhoVetor = 5
    val nomes = Array(tamanhoVetor) { "" }
    val sexos = Array(tamanhoVetor) { "" }
    val salarios = DoubleArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o nome do ${i + 1}º funcionário: ")
        nomes[i] = readLine()!!

        print("Digite o sexo do ${i + 1}º funcionário (M/F): ")
        sexos[i] = readLine()!!

        print("Digite o salário do ${i + 1}º funcionário: ")
        salarios[i] = readLine()!!.toDouble()
    }

    println("\nFuncionárias mulheres que ganham mais de R$5 mil:")
    for (i in 0 until tamanhoVetor) {
        if (sexos[i] == "F" && salarios[i] > 5000.0) {
            println("Nome: ${nomes[i]}, Salário: R$${salarios[i]}")
        }
    }
}

//86 Enunciado:
// 1. Crie uma função chamada 'Gerador1' que exibe no console um cabeçalho com:
//    - Duas linhas de underscores e a mensagem "Olá Mundo!" centralizada.
// 2. Chame a função 'Gerador1' dentro da função 'main'.

fun Gerador1(){

    println("______________________")
    println("      Olá Mundo!      ")
    println("______________________")
}

fun main () {
    Gerador1()
}


//87 Enunciado:
// 1. Crie uma função 'Gerador2' que recebe uma string e exibe a mensagem no console, 
//    centralizada entre duas linhas de underscores.
// 2. Na função 'main', solicite ao usuário que digite uma mensagem e chame 'Gerador2' para exibi-la.

fun Gerador2(mensagem: String){

    println("______________________")
    println("       $mensagem      ")
    println("______________________")
}

fun main () {
    println("Digite sua mensagem: ")
    var mensagem = readln().toString()
    Gerador2(mensagem)
}

//88 Enunciado:
// 1. Crie uma função 'Gerador3' que recebe uma mensagem e um número inteiro 'qtd'.
//    A função deve exibir a mensagem no console, centralizada entre duas linhas de underscores,
//    o número de vezes especificado por 'qtd'.
// 2. Na função 'main', solicite ao usuário que digite uma mensagem e chame 'Gerador3' para exibi-la 
//    duas vezes (ou o número de vezes desejado).

fun Gerador3(mensagem: String, qtd: Int){
    // pontos = intervalo de tempo
    for (i in 1..qtd){
        println("______________________")
        println("       $mensagem     ")
        println("______________________")
    }
}

fun main (){

    println("Digite sua mensagem: ")
    var mensagem = readln().toString()
    Gerador3(mensagem, 2)
}

//89 Enunciado:
// 1. Crie uma função 'Gerador4' que recebe três parâmetros: uma mensagem, 
//    a quantidade de vezes que a mensagem será exibida e um tipo de borda (1, 2 ou 3).
// 2. A função deve exibir a mensagem com diferentes bordas:
//    - Borda 1: underscore ("______________________")
//    - Borda 2: sinal de adição ("++++++++++++++++++++++")
//    - Borda 3: til ("~~~~~~~~~~~~~~~~~~~~~")
// 3. Na função 'main', solicite ao usuário que digite uma mensagem e chame 'Gerador4' 
//    passando a quantidade e o tipo de borda desejados.

fun Gerador4(mensagem: String, qtd: Int, tipoborda: Int){

    if (tipoborda == 1){
        for (i in 1..qtd) {
            println("______________________")
            println("       $mensagem      ")
            println("______________________")
        }
    }
    else if (tipoborda == 2) {
        for (i in 1..qtd) {
            println("++++++++++++++++++++++")
            println("       $mensagem      ")
            println("++++++++++++++++++++++")
        }
    }
    else if (tipoborda == 3) {
        for (i in 1..qtd) {
            println("~~~~~~~~~~~~~~~~~~~~~")
            println("      $mensagem      ")
            println("~~~~~~~~~~~~~~~~~~~~~")
        }
    }
}

fun main (){

    println("Digite sua mensagem: ")
    var mensagem = readln()
    Gerador4(mensagem, 2, 3)
}

//90 Enunciado:
// 1. Crie uma função 'Somador' que recebe dois valores inteiros como parâmetros.
//    A função deve calcular a soma desses valores e exibir o resultado no console.
// 2. Na função 'main', chame a função 'Somador' passando dois números inteiros.

fun Somador(valor1: Int, valor2: Int){
    var soma = valor1 + valor2
    println("Sua soma é igual a: $soma")
}

fun main (){

    Somador(3,5)
}

