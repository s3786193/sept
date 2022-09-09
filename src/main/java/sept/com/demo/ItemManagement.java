package sept.com.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/item")
public class ItemManagement {
    private static List<Item> items = new ArrayList(List.of(new item(
        id = 01,
        title = "item 1",
        desc = "this is item 1",
        imagePath =  "image-path",
        price = 12.0
    
        
    )));
    @GetMapping("/item")
    public List<Item> items() {return items;}
        
    @PostMapping("/item")
    public List<Item> items(@RequestBody Item item){
        items.add(item);
        return items;
    
    }
    @DeleteMapping("/item/{delete}")
    public List<Item> deleteitems(@PathVariable String delete){
        List<Item> collect = items.stream().filter((s) -> s.getDelete().equalsIgnoreCase(delete)).collect(Collectors.toList());
        items.removeAll(collect)
        return items;
    }
}
