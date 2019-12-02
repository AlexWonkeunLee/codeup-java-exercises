package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String movieName, String categoryName){
        name = movieName;
        category = categoryName;
    }

    public String getName(){
        return name;
    }

    public String getCategory(){
        return category;
    }

    public void setName(String input){
        name = input;
    }

    public void setCategory(String input){
        category = input;
    }
}
