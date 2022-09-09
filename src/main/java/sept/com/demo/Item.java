package sept.com.demo;

import javax.annotation.sql.DataSourceDefinition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Data
@AllArgsConstructor
public class Item {
    private int id;
    private String title;
    private String desc;
    private String imagePath;
    private int Price;
}
