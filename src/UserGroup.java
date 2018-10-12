public class UserGroup {

    private int id;
    private String title;

    @Override
    public String toString() {
        return "User group [id=" + id + ", title=" + title + "]";
    }
    public UserGroup() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public UserGroup(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
