public class ScienceExperiment {
    private int id;
    private String name;

    public ScienceExperiment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ScienceExperiment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
