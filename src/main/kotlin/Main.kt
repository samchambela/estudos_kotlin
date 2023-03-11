fun main() {
   val mesAtual = "3"
   val anoAtual = 2023


   // concatenando as frases
//    println ("mensagem $idade")
//    println ("eu tenho " + idade + " anos")
//    println ("eu tenho $idade anos")
//    println ("eu me chamo $nome e tenho $idade anos.")

//    fun calculaAnoNasc() {
//        var anoNasc: Int = anoAtual - idade
//    }

   println ("Digite seu nome:")
   val nome = readln()
   println ("Olá, $nome.")

   println("Digite seu mês de aniversário (de 1 a 12):")
   val mesDeAniv = readln()

   println ("Digite sua idade:")
   val idade = readln().toInt()
   println ("Você tem $idade anos.")

   var anoDeNascimento = anoAtual-idade

   if(mesDeAniv>mesAtual) {
//      anoDeNascimento = anoDeNascimento - 1
      anoDeNascimento -= 1
   } else {
      anoDeNascimento
   }

   println ("Seu ano de nascimento é: $anoDeNascimento.")
}