package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaCorrente(titular: Cliente, numeroConta: Int) : Conta
    (titular,
    numeroConta) {

    override fun sacarValor(valor: Double) {
       val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }


}