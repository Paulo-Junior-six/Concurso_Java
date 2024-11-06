package concurso.java;

import java.util.Scanner;

public class Concurso {
	

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("Qual a quantidade de pessoas que realizaram as provas?");
			int n = sc.nextInt();
			sc.nextLine();
			
			String[] nomes = new String[n];
			  double[] notaEtp1 = new double[n];
			  double[] notaEtp2 = new double[n];
			  double[] medias = new double[n];
			
			
			for(int i = 0; i < n; i++) {
				System.out.println("Digite os dados da " + (i + 1) + "ª pessoa: ");
				System.out.print("nome: ");
				  nomes[i] = sc.nextLine();
				System.out.print("Nota primerira etapa: ");
				  notaEtp1[i] = sc.nextDouble();
				System.out.print(" Nota segunda etapa: ");
				  notaEtp2[i] = sc.nextDouble();
				sc.nextLine();
				
				medias[i] = (notaEtp1[i] + notaEtp2[i]) / 2.0;
				
			}
				System.out.println("\nResultados"); {
			        for (int i = 0; i < n; i++)
			        {
			            System.out.printf("%s, %.1f, %.1f, MEDIA = %.2f\n",
			                              nomes[i], notaEtp1[i], notaEtp2[i], medias[i]);	
			        }
			}
			            
			     System.out.println("\n APROVADOS ");
			     int aprovados = 0;
			     double mediaAprovados = 0;
			        for(int i = 0; i < n; i++) {
			        	if(medias[i] >= 70) {
			        	   System.out.println(nomes[i]);
			        	   aprovados++;
			        	   mediaAprovados += medias[i];
			        	   
			        	}
			        }
			      
			        double aprovacao = (double) aprovados / n * 100;
			        System.out.printf("\naprovação: %.1f %%\n", aprovacao);
			        
			        double maiorMedia = medias[0];
			        String nomeMaiorMedia = nomes[0];
			        for(int i = 1; i < n; i++) {
			        	if(medias[i] > maiorMedia) {
			        		maiorMedia = medias[i];
			        		nomeMaiorMedia = nomes[i];
			        	}
			        }
		
			        System.out.println("Inscrito com a maior média: " + nomeMaiorMedia);
			        
			       if(aprovados > 0) {
			    	   double mediaApvd = mediaAprovados / aprovados;
			    	   System.out.printf("Nota média dos aprovados: %.2f\n", mediaApvd);
			       
			       }
			       else {
			    	   System.out.printf("Não há candidatos aprovados: %.2f\n");
			       }
			       
			       sc.close();
		     }
			        
		}




