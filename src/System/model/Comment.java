package System.model;

public class Comment { //includes name, date and description. May include id to specify the page id.
    private String name;
    private long date;
    private String desc;

    public Comment(String name, long date, String desc){
        this.setName(name);
        this.setDate(date);
        this.setDesc(desc);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
