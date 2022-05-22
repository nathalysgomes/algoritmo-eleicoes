import java.util.Scanner;

class exercicioeleicao
{
	public static void main (String[] args)
	{
        Scanner ler = new Scanner(System.in);

        int partido = 0,ptvoto = 0,pdtvoto = 0,plvoto = 0,psdbvoto = 0,nulovoto = 0,brancovoto = 0;
        int i = 0; 
        // Desclarado 8 variaveis inteiras: 7 para entrada de partidos no switch e 1 para realizar o loop
	   	do 
        // Inicio do ciclo do loop
           { 
               i++;
               // Acrescenta +1 variavel a cada ciclo

        System.out.print("Por favor, escolha um partido para votar\n13 = PT\n12 = PDT\n22 = PL\n45 = PSDB\n0 Para anular seu voto\n1 Para votar em branco\n");
	   	partido = ler.nextInt();
        // System.out.print para aparecer a mensagem para o usuario "Por favor, escolha um partido para votar\n13 = PT\n12 = PDT\n22 = PL\n45 = PSDB\n0 Para anular seu voto\n1 Para votar em branco\n" "/n para quebra de linha"

	    switch(partido)
        // Comando switch para o usuario escolher um partido
	    {
	    case 13:
	        System.out.print ("Voce escolheu o PT 13\n\n"); 
            // Mostra em qual partido foi votado
            ptvoto++;
            // Acrescenta um voto no partido
	        break;
            // Comando para pular para o fim do switch case
	    case 12:
	        System.out.print ("Voce escolheu o PDT 12\n\n");
            // Mostra em qual partido foi votado
            pdtvoto++;
            // Acrescenta um voto no partido
	        break;
            // Comando para pular para o fim do switch case
	    case 22:
	        System.out.print ("Voce escolheu o PL 22\n\n");
            // Mostra em qual partido foi votado
            plvoto++;
            // Acrescenta um voto no partido
	        break;
            // Comando para pular para o fim do switch case
	    case 45:
	        System.out.print ("Voce escolheu o PSDB 45\n\n");
            // Mostra em qual partido foi votado
            psdbvoto++;
            // Acrescenta um voto no partido
	        break;
            // Comando para pular para o fim do switch case
	    case 0:
	        System.out.print ("Voce votou nulo\n\n");
            // Mostra em qual partido foi votado
            nulovoto++;
            // Acrescenta um voto no partido
	        break;
            // Comando para pular para o fim do switch case
	    case 1:
	        System.out.print ("Voce votou em branco\n\n");
            // Mostra em qual partido foi votado
            brancovoto++;
            // Acrescenta um voto no partido
	        break;
            // Comando para pular para o fim do switch case
	       
	    }	 
            } while(i<50);
            // Enquanto a variavel i for menor que 50 vai ser realizado o loop de contagem de votos        
        System.out.print("\n\n\nTotal dos votos:\n\nPT = "+ptvoto+" votos\nPDT = "+pdtvoto+" votos\nPL = "+plvoto+" votos\nPSDB = "+psdbvoto+" votos\nVotos nulos = "+nulovoto+" votos\nVotos em branco = "+brancovoto+" votos\n");
        // Mostra a mensagem de total de votos para o usuario, "+voto+" para concatenar o resultado de votos com a mensagem do usuario
	} 
}    
