package main.java;
import java.util.*;

public class PraticandoSet {
    //Criando uma lista de notas para o exercício com Set

    public static void collectionSet(){
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,4.3,9.5,5d,3d,4d,7d,0d,3d));
        //usando o HashSet os valores ficam em ordem aleatória, não permitindo trabalhar com posições, diferente da List
        //Também exclui os repetidos
        System.out.println(notas);
        //Confira se a nota 4.3 está no conjunto inserido.
        System.out.println(notas.contains(4.3));  //se tiver o valor que retorna é true.
        //Exiba a menor nota
        System.out.println(Collections.min(notas));
        //Exiba a maior nota
        System.out.println(Collections.max(notas));
        //Exiba a soma dos valores de notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
           Double next = iterator.next();
           soma += next;
        }
        System.out.println(soma);
        //remova a nota 0d
        notas.remove(0d);
        System.out.println(notas);
        //remova as notas menores que 7 e exiba a lista novamente
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        //Exiba todas as notas na ordem em que foram informados
        //Para trabalhar com ordem de inserção devemos utilizar o método LinkedHashSet no Set
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(4d);
        notas2.add(3d);
        notas2.add(3.3);
        notas2.add(9.2);
        notas2.add(6d);
        notas2.add(3d);
        notas2.add(10d);
        System.out.println(notas2);
        //Exiba todas as notas na ordem crescente
        //Para trabalhar com ordem natural crescente devemos utilizar o método TreeSet no Set
        Set<Double> notas3 = new TreeSet<>(Arrays.asList(5d,3d,1d,10d,4.3,4.3,6.1,8.6));
        System.out.println(notas3);
        //Apagar todos o conjunto notas
        notas.clear();
        System.out.println(notas.isEmpty() + " verificar se está vazio");


    }

}
