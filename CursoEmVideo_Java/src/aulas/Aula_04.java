package aulas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;
public class Aula_04 {
	public static void main(String[] args) {
		//Hora do Sistema
		Date data = new Date(); //new: criando novo objeto
		System.out.println("A hora do sistema é");
		System.out.println(data.toString());
//--------------------------------------------------------------------------------------
		//Idioma do Sistema
		Locale local = Locale.getDefault();
		String lingua = local.getDisplayLanguage();
		//String pais = local.getDisplayCountry();
		System.out.print("A língua do sistema é '"+lingua+"'");
//--------------------------------------------------------------------------------------
		//Resolução da Tela
		double altura = 0, largura = 0;
		Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
		largura = resolucao.getWidth();
		altura = resolucao.getHeight();
		System.out.printf("A resolução da sua tela é %.0f",largura);
		System.out.printf("x%.0f",altura);
	}

}
