public class Nickname {

    String name;
    String nickname;

    void Nickname(String name){
        this.name = name;
    }

    void createNickName(String postFix) {
        nickname = name.concat(postFix);
    }

}
