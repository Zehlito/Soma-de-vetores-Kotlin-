//5 - Faça um algoritmo que leia dois vetores inteiro de 6 posições e gere um terceiro vetor com a soma dos vetores.
fun main() {
    val limits : Int = 6
    val myVector1 = IntArray(limits)
    val myVector2 = IntArray(limits)
    val myVector3 = IntArray(limits)

    for (i in 0..<limits)
    {
        print("Digite o valor para ser armazenado no vetor 1 posição [$i]: ")
        myVector1[i] = readLine()!!.toInt()
    }
    for (i in 0..<limits)
    {
        print("Digite o valor para ser armazenado no vetor 1 posição [$i]: ")
        myVector2[i] = readLine()!!.toInt()
    }
    for (i in 0..<limits)
    {
        myVector3[i] = myVector1[i] + myVector2[i]
    }
    for (i in 0..<limits)
    {
        println("Vetor 3 posição [$i] = " + myVector3[i])
    }
}