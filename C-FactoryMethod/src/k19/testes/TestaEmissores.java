package k19.testes;

import k19.concreteproduct.EmissorEmail;
import k19.concreteproduct.EmissorJMS;
import k19.concreteproduct.EmissorSMS;
import k19.creator.EmissorCreator;
import k19.product.Emissor;

public class TestaEmissores {
	public static void main(String[] args) {
		EmissorCreator emissor = new EmissorCreator();
		
		Emissor e1 = emissor.create(EmissorCreator.SMS);
		Emissor e2 = emissor.create(EmissorCreator.EMAIL);
		Emissor e3 = emissor.create(EmissorCreator.JMS);
		
		e1.envia("Miojo");
		e2.envia("Sopa");
		e3.envia("Macarrão");

		/*
		//Esta é a abordagem ruim. Pois o cliente,  tem de fazer a referência direta.
		Emissor emissorSMS = new EmissorSMS();
		emissorSMS.envia("RUIM - Banana");
		
		Emissor emissorEmail = new EmissorEmail();
		emissorEmail.envia("RUIM - Pêra");
		
		Emissor emissorJMS = new EmissorJMS();
		emissorJMS.envia("RUIM - Melão");
		*/
		
	}

}
