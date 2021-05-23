package sorteio;

import java.util.Random;

public class Sorteio {
	
	public static void main(String[] args) {
		
		int [] fixos = new int[25]; int[] sortear = new int[25];
		fixos[0] = 1;
		fixos[fixos.length-1] = 25;
		Random teste = new Random(); int sorteado; int numerosorteios = 2;
		
		while(numerosorteios>0) {	
	
			for(int i = 2;i<25;i++) {
				sortear[i-1]=i;
			}
		
			for(int j = 1;j<24;j++) {
				fixos[j]=0;
			}
		
			int i = 0;
			
			while(i<13){ // 13 pq ja tem dois numeros no vetor fixos o primiero e o ultimo
			
			sorteado = teste.nextInt(25);

				try { // coloquei pq aparece um erro de array....
	        	
					if(sorteado == sortear[sorteado-1]) {
				
						fixos[sorteado-1] = sorteado;
						sortear[sorteado-1] = 0;
						i++;
				 
					}
			
				}catch(ArrayIndexOutOfBoundsException e) {
				
				}
			
			}
		
			for (int j =0; j < 25; j++) {
				
				if (fixos[j]>0){
					
					System.out.print(fixos[j]+" ");
					
				}
		}
		
		System.out.println();	
		numerosorteios--;
		
		}
	}
}
