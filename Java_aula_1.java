class main{
    public static void main(String[]args){

        // Vamos criar aabaixo, um objeto a partir da Classe Conta corrente
ContaCorrente c1 = new ContaCorrente();
c1.depositar(50.00);
System.out.println("Saldo: " + c1.saldo());

c1.depositar(150.00);
System.out.println("Saldo: " + c1.saldo());

c1.sacar(50.00);
System.out.println("Saldo: " + c1.saldo());

Continhas multiplicar = new Continhas();
System.out.println(multiplicar.multiplicar(10, 2));
}
}
    
// Tarefa abaixo : Criar um Método para realizar saques

class ContaCorrente{  // essa é a classe 
//esses abaixo será  os atributos da classe (string e Double)
    String numero;
    String correntista;  
      double saldo;
      double limite;
//esses abaixo será os métodos da classe
public void depositar(double valor){
    this.saldo = this.saldo + valor;
    // ou você pode escrever --> this.saldo += valor;
}
public void sacar(double valor){
    this.saldo = this.saldo - valor;
}
public double saldo(){
    return this.saldo;
}
}

//por fim, vamos criar a classe para multiplicação de números inteiros

class continhas{
    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }
}
// FIM 