package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// método para inserir um elemento na lista, a inserção deve manter a lista ordenada
	public void inserir(int dado) {
		
		No ins = new No(dado);
		No insRes = inicio;

		if(inicio == null){
			
			inicio = ins;
			fim = ins;
			
		} else if (inicio == fim){
			if(ins.dado > fim.dado){
				
			fim.dir = ins;
			ins.esq = fim;
			fim = ins;
				
			} else {
				
			fim.esq = ins;
			ins.dir = fim;
			inicio = ins;
			}
			
		} else {
			if(ins.dado > fim.dado){
				
			fim.dir = ins;
			ins.esq = fim;
			fim = ins;
				
			} else if (ins.dado < inicio.dado) {
				
				inicio.esq = ins;
				ins.dir = inicio;
				inicio = ins;
				
			} else {
				while(insRes != null){
					if (ins.dado <= insRes.dir.dado && ins.dado >= insRes.dado){
						
					ins.esq = insRes;
					insRes.dir.esq = ins;
					ins.dir = insRes.dir;
					insRes.dir = ins;
					break;
					
					}
					
					insRes = insRes.dir;
				}
			}
		}
	}
	
	// método para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
