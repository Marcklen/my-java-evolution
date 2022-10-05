package exercicio_04_10_22;

import java.util.Date;
import java.util.List;

public class ContaCorrente {

	int numeroConta;
	int numeroAgencia;
	String nomeCliente;
	Date dataNascimento;
	double saldoConta;
	
	//depositarValores
	void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Erro, não há como depositar valores menores que R$ 0,00 reais");
		}else {
			saldoConta += valor;
		}
	}
	//sacarValores();
	void sacar(double valor) {
		if(valor > saldoConta) {
			System.out.println("Saldo insuficiente, consulte o seu extrato para verificar qual valor você pode sacar!");
		}else {
			saldoConta -= valor;
		}
	}
	//transferirValores();
	void transferir(double valor, ContaCorrente conta) {
		conta = new ContaCorrente();
		
	}
	//cancelarContaComJustificativa
	boolean cancelar(ContaCorrente conta, String justificativa) {
		return false;
	}
	//consultarExtrato
	List<?> consultarExtrato(Date inicio, Date fim) {
		if(fim.after(inicio)) {
			System.out.println("ERRO");
		}
		return List.of(inicio, fim);
	}
	//consultarSaldoAtual
	double consultarSaldo() {
		System.out.println("Agencia:       " + numeroAgencia);
		System.out.println("ContaCorrente: " + numeroConta);
		System.out.println("Cliente:       " + nomeCliente);
		System.out.print("Saldo Atual:     ");
		return saldoConta;
	}
}