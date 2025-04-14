package Exercicios.n3.n1.Banco;

import Exercicios.n3.n1.BancoExceptions.BoletoException;
import Exercicios.n3.n1.BancoExceptions.SaldoException;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double dividaTotal;
    private boolean estaUsandoChequeEspecial;
    private boolean acima500;
    private final double saldoInicial;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
        this.saldoInicial = saldo;
        if (this.saldo <= 500.0) {
            this.acima500 = false;
            this.chequeEspecial = 50.0;
        } else {
            this.acima500 = true;
            this.chequeEspecial = this.saldo / 2;
        }
        this.estaUsandoChequeEspecial = false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getChequeEspecial() {
        return this.chequeEspecial;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
        if (this.estaUsandoChequeEspecial) {
            if (saldo <= this.dividaTotal) {
                this.saldo = 0;
                this.dividaTotal -= saldo;
            } else {
                this.saldo -= this.dividaTotal;
                this.dividaTotal = 0;
                this.estaUsandoChequeEspecial = false;
                if (this.acima500)
                    this.chequeEspecial = this.saldoInicial / 2;
                else
                    this.chequeEspecial = 50;
            }
        }
    }

    public void sacar(double saldo) throws SaldoException {
        double[] valores = this.pagamento(saldo);
        if (valores.length == 3)
            throw new SaldoException("Saldo insuficiente");
        else {
            this.saldo -= valores[0];
            this.chequeEspecial -= valores[1];
            this.dividaTotal += valores[1] / 5;
            this.estaUsandoChequeEspecial = true;
            System.err.println("Você usou o saldo do cheque especial");
            System.err.println("20% do valor usado será cobrado no próximo depósito");
        }
    }

    public void pagarBoleto(Boleto boleto) throws BoletoException, SaldoException {
        if (boleto.isPago())
            throw new BoletoException("Boleto já está pago");

        double[] valores = this.pagamento(boleto.getPrecoTotal());
        if (valores.length == 3)
            throw new SaldoException("Saldo insuficiente");
        else {
            this.saldo -= valores[0];
            this.chequeEspecial -= valores[1];
            this.dividaTotal = valores[1] / 5;
            boleto.pagar();
            if (valores[1] > 0){
                this.estaUsandoChequeEspecial = true;
                System.err.println("Você usou o saldo do cheque especial");
                System.err.println("20% do valor usado será cobrado no próximo depósito");
            }
        }
    }

    public boolean estaUsandoChequeEspecial() {
        return this.estaUsandoChequeEspecial;
    }

    private double[] pagamento(double valor) {
        if (this.saldo >= valor)
            return new double[]{valor, 0};
        else if (this.saldo + this.chequeEspecial >= valor) {
            return new double[]{this.saldo, valor - this.saldo};
        }
        return new double[]{this.saldo, this.chequeEspecial, valor - this.chequeEspecial - this.saldo};
    }

    @Override
    public String toString() {
        if (!this.estaUsandoChequeEspecial)
            return "Saldo: R$ " + String.format("%.2f", this.getSaldo()) +
                    "\nCheque especial: R$ " + String.format("%.2f", this.getChequeEspecial());
        return "Saldo: R$ " + String.format("%.2f", this.getSaldo()) +
                "\nCheque especial: R$ " + String.format("%.2f", this.getChequeEspecial()) +
                "\nDívida do cheque especial: R$ " + String.format("%.2f", this.dividaTotal);
    }
}