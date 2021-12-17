package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
//import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
public class Book {

   // @Id
    private int id;
    private String bookName;
    private String authorName;

}
