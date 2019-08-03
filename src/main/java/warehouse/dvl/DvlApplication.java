package warehouse.dvl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import warehouse.dvl.models.Item;

@SpringBootApplication
public class DvlApplication {

    //public static void main(String[] args) {
    //    SpringApplication.run(DvlApplication.class, args);
    //}
    public static void main(String[] args){
        Item item = new Item();
        item.setCount(2);
        item.setName("Processor");
        System.out.println(item.getName());
    }

}
