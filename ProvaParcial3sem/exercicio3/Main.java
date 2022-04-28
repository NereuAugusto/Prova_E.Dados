package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inserção dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
		
		// imprime os elementos da lista
		lista.imprimir();
	}
	
	public static void inverter(Lista lista) {
			No inv = lista.inicio;
			No invRes;
			
			while(inv != null) {
				
				if(inv == lista.inicio){
					
				inv.esq = inv.dir;
				inv.dir = null;
				inv = inv.esq; 
					
				}else if(inv != lista.fim){
					
				invRes = inv.esq;
				inv.esq = inv.dir;
				inv.dir = invRes;
				inv = inv.esq;
					
				}else {
					
				inv.dir = inv.esq;
				inv.esq = null;
				break;
				
				}
			   }
			
			invRes = lista.inicio;
			lista.inicio = lista.fim;
			lista.fim = invRes;
		}
}
