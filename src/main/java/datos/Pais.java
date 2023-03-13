package datos;

public class Pais {
    private String name;
    private String continent;
    private int population;
    private int indepyear;

    public Pais() {

    }

    public Pais(String name, String continent, int population, int indepyear) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.indepyear = indepyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getIndepyear() {
        return indepyear;
    }

    public void setIndepyear(int indepyear) {
        this.indepyear = indepyear;
    }


}
