import java.util.List;

public class Faculty {

    List<Student> lista;
    String fakultet;

    public double average_grades(){

        double sum = 0;

        for(int i = 0; i < lista.size(); i++){

            sum+= lista[i].getAverage();

        }

        return sum/lista.size();

    }



}

