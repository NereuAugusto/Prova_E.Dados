package exercicio2;

public class Fila {

	No inicio, fim;
	
	// m�todo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista){
		No aux = new No(motorista);
		if(inicio == null){
			
		inicio = aux;
			
		}else{
			
		aux.esq = fim;
		fim.dir = aux;
		}
		
		fim = aux;
	}
	
	// m�todo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {
		No des = inicio;

		inicio = des.dir;	
		inicio.esq = null;	
		des.dir = null;
	}
	
	// m�todo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No dados = inicio;
		while(dados != null) {
			System.out.println(dados.motorista.getNome());
			dados = dados.dir;
		}	
	}
}