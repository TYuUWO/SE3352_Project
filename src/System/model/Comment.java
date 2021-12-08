package System.model;

import java.util.Date;

public class Comment { //includes name, date and description. May include id to specify the page id.
    private String name;
    private Date date;
    private String desc;

    public Comment(String name,Date date, String desc){
        this.name = name;
        this.date = date;
        this.desc = desc;
    }


}
