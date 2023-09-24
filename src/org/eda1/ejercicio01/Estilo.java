package org.eda1.ejercicio01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Estilo {
	
//	private ArrayList<String> arr = new ArrayList<String>();
	
	public static void main(String[]args) {
//		Para poder trabajar con arr desde el main, tendria que crear por ejemplo un Estilo nuevo. Solo si nuestro arrayList esta fuera
//		Estilo ejemplo = new Estilo();
//		ejemplo.arr.add("3");
//		System.out.println(ejemplo.arr.toString());
//		
//		MANERA BASICA DE AÑADIR UN VALOR A UN ARRAY
//		ArrayList<String> arr = new ArrayList<String>();
//		arr.add("3");
//		System.out.println(arr.toString());
		
		ArrayList<String> arr = new ArrayList<String>();
		for(int i=1; i<=50; i++) {
//			if (Math.random() < 0.5) { //Esto se hace para que de manera aleatoria meta o no valores negativos o positivos en el array
//				// arr.add(i); Esto no se puede hacer ya que quieres meter una i que es un numero en un array de String
//				arr.add(String.valueOf(i));
//			} else {
//				arr.add(String.valueOf(-i));
//			}
//			este if podria sustituirse por un operador ternario(solo se puede aplicar si los resultados son muy similares) como el de a continuacion
			arr.add(String.valueOf(Math.random() < 0.5 ? i : -i));
		}
		System.out.println(arr.toString());
		
//		int numNegativos1 = 0;
//		int numNegativos2 = 0;
//		int numNegativos = 0;
		
//		MANERAS DE RECCORER UN ARRAY	
//		1º manera de recorrer el array
//		for (int i = 0; i < arr.size(); i++) {
//			Si escribimos esto, nos da error porque get(i) nos devolvera un String y y no puede ser menor que 0, por lo tanto se convierte en Integer
//			if (arr.get(i) < 0) numNegativos1++;
//			if (Integer.valueOf(arr.get(i)) < 0) numNegativos1++;
//		}
		
//		2º manera de recorrer el array -> ESTA NUNCA SE USA
//		Iterator<String> it = arr.iterator();
//		while(it.hasNext()) {
//			if(Integer.valueOf(it.next()) < 0) ++numNegativos2;
//		}
		
//		EJEMPLO DE CUANDO NO SE USA LA 3º QUE ES LA MAS IDONEA EN LA MAYORIA DE CASOS
//		ESTE EJEMPLO SE BASA EN RECORRER EL ARRAY Y SUSTITUIR TODOS LOS VALORES NEGATIVOS ENCONTRADOS POR SUS VALORES POSITIVOS
//		System.out.println("Antes de modificar la estructura: " +arr.toString());
		
//		3º manera de recorrer el array(foreach) -> Es la mas compacta y es la que se usa en CASI TODOS los casos. Un caso en el que no se puede usar seria cuando queremos modificar el array con el que trabajamos (ejemplo mas abajo)
//		Para cada valor valorStr de tipo String contenido en la estructura arr, haz cosas
//		for(String valorStr : arr) {
//			if(Integer.valueOf(valorStr) < 0) ++numNegativos;
//			Esto no se puede hacer ya que habria que convertir valorStr al tipo de valor correcto
//			if(Integer.valueOf(valorStr) < 0) valorStr = - valorStr;
//			Si ejecutamos, vemos que la lista sigue siendo la misma ya que cuando se usa foreach, se trabaja con una copia de los valores y desde el foreach no se pueden modificar. Por lo tanto, habria que usar la 1º manera del for.
//			if(Integer.valueOf(valorStr) < 0) valorStr = String.valueOf(-Integer.valueOf(valorStr));
//		}
		
//		for(int i=0; i<arr.size(); i++) {
//			if(Integer.valueOf(arr.get(i)) < 0) arr.set(i,String.valueOf(-Integer.valueOf(arr.get(i))));
//		}
		
//		System.out.println("El número de elementos negativos según forma 1 : " + numNegativos1);
//		System.out.println("El número de elementos negativos según forma 2 : " + numNegativos2);
//		System.out.println("El número de elementos negativos : " + numNegativos);
//		System.out.println("Después de modificar la estructura: " +arr.toString());
		
//		EJEMPLO EN EL QUE RECORREMOS EL ARRAY Y EN EL MOMENTO QUE ENCONTREMOS UN VALOR NEGATIVO, SE MUESTRA Y SE ACABA LA EJECUCION
//		for(String valorStr : arr) {
//			if(Integer.valueOf(valorStr) >= 0) continue;
//			if(Integer.valueOf(valorStr) >= 0) {
//				System.out.println("Valor positivo encontrado");
//				continue;
//			}	
//			Dado que el ejercicio nos pide unicamente lo del valor negativo, el syso de arriba podria eliminarse y quedar un if mas limpio
//			} else {
//			System.out.println("He encontrado el primer valor negativo : " +valorStr);
//			break; 
//		}
//			}
//			El break se utiliza para romper el bucle y no siga ejecutandose. Saltaria a la siguiente linea despues del for.
//			Si no se cumple el break, pasaria a la siguiente dentro del bucle por lo que no haria falta escribir el else. Habria que colocar el syso tabulado correctamente.
//			El continue se utiliza para indicar que, al haber un valor positivo, el bucle debe de continuar y manda la ejecucion de nuevo al for para que siga buscando valores
//			SE SUELE UTILIZAR PRIMERO USANDO EL CONTINUE Y LUEGO EL BREAK (primero compruebo que debo continuar y si no, despues de comprobarlo es cuando se rompe la ejecucion)
		
		
//		EJEMPLO ANTERIOR PERO USANDO WHILE TRUE
		int i = 0;
		while(true) {
			if(i == arr.size()) {
				System.out.println("No se ha encontrado ningun valor negativo");
				break;
			}
			if(Integer.valueOf(arr.get(i)) >= 0) {
				i++;
				continue;
			}
			
			System.out.println("He encontrado el primer valor negativo: " +arr.get(i));
			break;
		}
		System.out.println("He terminado");

//			Si coloco el i++ unicamente, tarde o temprano, intentara acceder a un valor fuera del array y soltara una excepcion.
//			Para gestionar eso, se crea el primer if.
	}
}
