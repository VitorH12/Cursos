package aulas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
public class Aula_04 {
	public static void main(String[] args) {
		//Hora do Sistema
		Date data = new Date(); //new: criando novo objeto
		System.out.println("A hora do sistema �");
		System.out.println(data.toString());
//--------------------------------------------------------------------------------------
		//Idioma do Sistema
		Locale local = Locale.getDefault();
		String lingua = local.getDisplayLanguage();
		//String pais = local.getDisplayCountry();
		System.out.print("A l�ngua do sistema � '"+lingua+"'");
//--------------------------------------------------------------------------------------
		//Resolu��o da Tela
		double altura = 0, largura = 0;
		Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
		largura = resolucao.getWidth();
		altura = resolucao.getHeight();
		System.out.printf("A resolu��o da sua tela � %.0f",largura);
		System.out.printf("x%.0f",altura);
	}

}
