public class Arabic implements Languages{

    String word;

    public Arabic(){
        word = "مرحبا";
    }

    public Arabic(String word){
        this.word = word;
    }

    @Override
    public String speak() {
        return word;
    }
}
