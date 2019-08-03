package warehouse.dvl.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Category category;
    private int weight;
    private int units;
    private String warehouse;
    private String pallet;
    private String place;
    private int count;

    public void addItem(){

    }

    public void moveItem(){

    }

    public void removeItem(){

    }

    public void changeItem(){

    }
}


