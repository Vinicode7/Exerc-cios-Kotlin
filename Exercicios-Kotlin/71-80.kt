//71 Declare um vetor de inteiros com 8 elementos, 
// onde todos os valores iniciais sejam iguais a 999.
// Imprima todos os valores do vetor, um por um, utilizando um laço de repetição.

package Passo_8

fun main() {
    val vetor = IntArray(8) { 999 }

    for (i in vetor.indices) {
        print("${vetor[i]} ")
    }
}

// 72 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 10, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para preencher o vetor, onde o valor de cada elemento será o índice + 1 multiplicado por 5.
// 4. Utilize outro laço de repetição para imprimir cada valor do vetor.
// 5. Cada elemento será impresso seguido de um espaço.

package Passo_8

fun main() {
    val tamanhoVetor = 10
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = (i + 1) * 5
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}

//73  Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 10, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para preencher o vetor, onde o valor de cada elemento será 9 menos o índice.
// 4. Utilize outro laço de repetição para imprimir cada valor do vetor.
// 5. Cada elemento será impresso seguido de um espaço.

package Passo_8

fun main() {
    val tamanhoVetor = 10
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = 9 - i
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}

//74 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 10, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para preencher o vetor. 
//    - Se o índice for par, o valor será 5.
//    - Se o índice for ímpar, o valor será 3.
// 4. Utilize outro laço de repetição para imprimir cada valor do vetor.
// 5. Cada elemento será impresso seguido de um espaço.

package Passo_8

fun main() {
    val tamanhoVetor = 10
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        if (i % 2 == 0) {
            vetor[i] = 5
        } else {
            vetor[i] = 3
        }
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}

//75 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 15, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Atribua o valor 1 nas duas primeiras posições do vetor (índices 0 e 1).
// 4. Utilize um laço de repetição para preencher o vetor com a sequência de Fibonacci, onde:
//    - Cada número será a soma dos dois números anteriores.
// 5. Utilize outro laço de repetição para imprimir cada valor do vetor.
// 6. Cada elemento será impresso seguido de um espaço.

package Passo_8

fun main() {
    val tamanhoVetor = 15
    val vetor = IntArray(tamanhoVetor)
    
    vetor[0] = 1
    vetor[1] = 1
    
    for (i in 2 until tamanhoVetor) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }

    for (elemento in vetor) {
        print("$elemento ")
    }
}

//76 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 7, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para preencher o vetor com números aleatórios entre 0 e 100.
// 4. Imprima a mensagem "Valores gerados:".
// 5. Utilize outro laço de repetição para imprimir cada valor do vetor.
// 6. Cada elemento será impresso seguido de um espaço.

package Passo_8

import kotlin.random.Random

fun main() {
    val tamanhoVetor = 7
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = Random.nextInt(0, 100)
    }

    println("Valores gerados:")
    for (elemento in vetor) {
        print("$elemento ")
    }
    println()
}

// 77 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 7, representando o tamanho do vetor.
// 2. Crie um vetor de strings de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para pedir ao usuário que digite o nome de 7 pessoas, 
//    armazenando cada nome no vetor 'nomes'.
// 4. Após a entrada de dados, imprima a mensagem "Nomes na ordem inversa:".
// 5. Utilize outro laço de repetição para imprimir os nomes do vetor na ordem inversa.
// 6. Cada nome será impresso em uma nova linha.

package Passo_8

fun main() {
    val tamanhoVetor = 7
    val nomes = Array(tamanhoVetor) { "" }

    for (i in 0 until tamanhoVetor) {
        print("Digite o nome da ${i + 1}ª pessoa: ")
        nomes[i] = readLine()!!
    }
    
    println("\nNomes na ordem inversa:")
    for (i in tamanhoVetor - 1 downTo 0) {
        println(nomes[i])
    }
}

//78 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 15, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para pedir ao usuário que digite 15 números,
//    armazenando cada número no vetor 'numeros'.
// 4. Após a entrada de dados, imprima o vetor completo.
// 5. Em seguida, imprima as posições e os valores dos múltiplos de 10 no vetor.
// 6. Cada múltiplo de 10 será impresso juntamente com sua posição no vetor.

package Passo_8

fun main() {
    val tamanhoVetor = 15
    val numeros = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    println("\nVetor completo:")
    for (numero in numeros) {
        print("$numero ")
    }
    println()

    println("\nPosições dos múltiplos de 10:")
    for (i in 0 until tamanhoVetor) {
        if (numeros[i] % 10 == 0) {
            println("Posição ${i + 1}: ${numeros[i]}")
        }
    }
}

//79 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 10, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para pedir ao usuário que digite 10 números,
//    armazenando cada número no vetor 'numeros'.
// 4. Após a entrada de dados, imprima a mensagem "Números pares e suas posições:".
// 5. Em seguida, imprima os números pares do vetor juntamente com suas posições.

package Passo_8

fun main() {
    val tamanhoVetor = 10
    val numeros = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()!!.toInt()
    }

    println("\nNúmeros pares e suas posições:")
    for (i in 0 until tamanhoVetor) {
        if (numeros[i] % 2 == 0) {
            println("Número ${numeros[i]} na posição ${i + 1}")
        }
    }
}
//80 Enunciado:
// 1. Declare uma variável 'tamanhoVetor' com o valor 30, representando o tamanho do vetor.
// 2. Crie um vetor de inteiros de tamanho 'tamanhoVetor'.
// 3. Utilize um laço de repetição para preencher o vetor com números aleatórios entre 1 e 15.
// 4. Solicite ao usuário que digite um número (chave).
// 5. Utilize outro laço de repetição para verificar em quais posições o número (chave) foi sorteado no vetor.
// 6. Imprima as posições em que a chave foi encontrada.
// 7. No final, imprima quantas vezes a chave foi sorteada no vetor.

package Passo_8

import kotlin.random.Random

fun main() {
    val tamanhoVetor = 30
    val vetor = IntArray(tamanhoVetor)

    for (i in 0 until tamanhoVetor) {
        vetor[i] = Random.nextInt(1, 16)
    }

    print("Digite um número (chave): ")
    val chave = readLine()!!.toInt()

    var contadorChave = 0
    println("\nPosições onde a chave $chave foi encontrada:")
    for (i in 0 until tamanhoVetor) {
        if (vetor[i] == chave) {
            println("Posição ${i + 1}")
            contadorChave++
        }
    }

    println("\nA chave $chave foi sorteada $contadorChave vezes.")
}

