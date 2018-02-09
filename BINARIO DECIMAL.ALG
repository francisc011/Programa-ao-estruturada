Algoritmo "Binario decimal"
// Professor   : Margarida GOmes
// Decriçao    : Transformar numero binario em decimal
// Autor(a)    : Francisco Sousa
// Data atual  : 09/02/2018
Var
num1 : caracter
posicao,f : inteiro


Inicio
escreval("Digite um número binario :")
leia(num1)
 para posicao de compr(num1) ate 1 passo -1 faca
  se copia(num1,posicao,1)="1" entao
   f <- f + int(exp(2,compr(num1)-posicao))
  fimse
 fimpara
escreval("A representação decimal de ", num1, " é ", f)


Fimalgoritmo