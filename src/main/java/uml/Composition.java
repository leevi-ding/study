package uml;

import lombok.Data;
import lombok.Getter;

@Data
public class Composition {

    private int age;

    class Inner{
        void getAge(){
            System.out.println(age);
        }
    }
}
