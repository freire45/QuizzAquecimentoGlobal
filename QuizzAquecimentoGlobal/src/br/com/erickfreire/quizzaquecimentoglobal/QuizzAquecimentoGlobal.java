package br.com.erickfreire.quizzaquecimentoglobal;

import javax.swing.JOptionPane;

/**
 * Programa em Java que apresenta um QUIZZ sobre aquecimento global.
 * @author Erick Freire
 * @version 1 - Criado em 23-04-2021 as 17:28
 */

public class QuizzAquecimentoGlobal {
	public static void main(String[] args) {
		
		String resposta;
		int resp;
		int correto = 0;
		
		JOptionPane.showMessageDialog(null, "Bem vindo ao QUIZZ de aquecimento global!");
		
		resposta = JOptionPane.showInputDialog("Qual dos períodos abaixo é conhecido como um estado de temperatura da terra: \n\n"
				                              + "1 - Era do Caos\n"
				                              + "2 - Era do Michel Jackson\n"
				                              + "3 - Era do Gelo\n"
				                              + "4 - Era das Florestas\n");
		
		resp = Integer.parseInt(resposta);
		
		if(resp == 3) {
			correto = correto + 1;
		}
		
		resposta = JOptionPane.showInputDialog("O que tem aumentado a temperatura da terra: \n\n"
                + "1 - Cheiro Ruim\n"
                + "2 - Gases estufa\n"
                + "3 - Laquê\n"
                + "4 - Bafo do Joao\n");

        resp = Integer.parseInt(resposta);

        if(resp == 2) {
           correto = correto + 1;
        }
        
		resposta = JOptionPane.showInputDialog("O as pessoas tem feito por conta do aquecimento: \n\n"
                + "1 - Ligado o ar condicionado\n"
                + "2 - Ligado o ventilador\n"
                + "3 - Migrando de países e regiões\n"
                + "4 - Vivendo no caos\n");

        resp = Integer.parseInt(resposta);

        if(resp == 3) {
           correto = correto + 1;
        }
		
		resposta = JOptionPane.showInputDialog("O aumento de temperatura no Brasil tem causado problema na: \n\n"
                + "1 - Vendinha do Seu Fernando\n"
                + "2 - Avenida Paulista\n"
                + "3 - Sorveteria do seu zé\n"
                + "4 - Agricultura\n");

        resp = Integer.parseInt(resposta);

        if(resp == 4) {
           correto = correto + 1;
        }
        
		resposta = JOptionPane.showInputDialog("O aquecimento global aumenta: \n\n"
                + "1 - Disseminação de doenças como Malária e Dengue\n"
                + "2 - O Faturamento do governo\n"
                + "3 - O número de trabalho\n"
                + "4 - A qualidade de vida\n");

        resp = Integer.parseInt(resposta);

        if(resp == 1) {
           correto = correto + 1;
        }
        
        if(correto == 5) {
        	JOptionPane.showMessageDialog(null, "Acertou 5 ótimo");
        }
        
        if(correto == 4) {
        	JOptionPane.showMessageDialog(null, "Acertou 4 Muito Bom");
        }
        
        if(correto == 3) {
        	JOptionPane.showMessageDialog(null, "Acertou 3 Bom");
        }
        
        if(correto == 2) {
        	JOptionPane.showMessageDialog(null, "Acertou 2 Precisa melhorar");
        }
        
        if(correto == 1) {
        	JOptionPane.showMessageDialog(null, "Acertou 1 Precisa estudar mais");
        }
        
        if(correto == 0) {
        	JOptionPane.showMessageDialog(null, "Acertou 0 Precisa conhecer mais sobre aquecimento global");
        }
		
		
	}

}
