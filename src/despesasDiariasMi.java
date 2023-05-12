import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class despesasDiariasMi {
    public static void main(String[] args) {
        
        System.out.println("Crie um conjunto e adicione os valores de suas despesas diárias: ");
        //inicializando a lista 
        Set<Double> despesas = new HashSet<>(Arrays.asList(8.50, 20d, 15.80, 3.50, 10d, 8.90, 2.50)); 
        System.out.println(despesas.toString());
    
        System.out.println("Confira se o valor 3,50 esta presente no conjunto:" + despesas.contains(3.50));
        //retorna um boolean dizendo se a despesa esta ou não no conjunto

        System.out.println("Exiba o menor valor de despesa: " + Collections.min(despesas));
        System.out.println("Exiba o maior valor de despesa: " + Collections.max(despesas));

        java.util.Iterator<Double> iterator = despesas.iterator();
        Double total = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            total += next;
        }
        System.out.println("Exiba a soma das despesas: " + total);

        System.out.println("Exiba a media de gastos diaria: " + total/despesas.size());

        System.out.println("Remova o gasto de valor 15,80 do conjunto: ");
        despesas.remove(15.80);
        System.out.println(despesas);

        System.out.println("Remova todos os gastos que são menores que 5,00 do conjunto: ");
        Iterator<Double> iterator1 = despesas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 5) iterator1.remove();
        }
        System.out.println(despesas);

        System.out.println("Exiba todas as despesas na ordem em que elas foram informadas: ");
        Set<Double> despesas1 = new HashSet<>(Arrays.asList(8.50, 20d, 15.80, 3.50, 10d, 8.90, 2.50)); 
        System.out.println(despesas);

        System.out.println("Exiba todas as despesas em ordem crescente: ");
        Set<Double> despesas2 = new TreeSet<>(despesas1);
        System.out.println(despesas2);

        //System.out.println("Apague todo o conjunto: ");
        //despesas.clear();

        System.out.println("Confira se o conjunto esta vazio: " + despesas.isEmpty());
        System.out.println("Confira se o conjunto 2 esta vazio: " + despesas2.isEmpty());
        






    }
}