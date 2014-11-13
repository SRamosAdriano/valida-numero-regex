package br.com.validanumeroregex;

public class ValidaNumeroRegex {

	public static void main(String[] args) {
		System.out.println("Valida Numero Regex");
		System.out.println("");
		operacoesInvalidas();
		System.out.println("");
		operacoesValidas();
	}
	
	public static void operacoesInvalidas(){
		
		System.out.println("OPERAÇÕES INVALIDAS:");
		System.out.println("Input []: "  		+ isNumerico(""));
		System.out.println("Input [ ]: " 		+ isNumerico(" "));
		System.out.println("Input [123a  ]: "   + isNumerico("123a  "));
		System.out.println("Input [  123a]: "   + isNumerico("  123a"));
		System.out.println("Input [  123a  ]: " + isNumerico("  123a  "));
		System.out.println("Input [false123]: " + isNumerico("false123"));
		System.out.println("Input [132false]: " + isNumerico("132false"));
		System.out.println("Input [1false2]: "  + isNumerico("1false2"));
		System.out.println("Input [fa123lse]: " + isNumerico("fa123lse"));
		System.out.println("Input [123  123]: " + isNumerico("123  123"));
	}
	
	public static void operacoesValidas(){
		
		System.out.println("OPERAÇÕES VALIDAS:");
		System.out.println("Input [156547]: " + isNumerico("156547"));
		System.out.println("Input [  156547  ]: " + isNumerico("  156547  "));
		System.out.println("Input [  156547]: " + isNumerico("  156547"));
		System.out.println("Input [156547  ]: " + isNumerico("156547  "));
	}

	public static boolean isNumerico(String str) {
		if(str == null || str.trim().length() == 0) return false;
		
		if(str.trim().matches("[0-9]{" + str.trim().length() + "}")) {
			return true;
		}else{
			return false;
		}
	}
}
