package test;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class StringJoinerExample {
    public static void main(String... arg) {
        out.println(new StringJoiner(" ").add("uuid not present in message"));

        List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");

        //java, python, nodejs, ruby
        String result = String.join(", ", list);
        out.println(result);

        //java | python | nodejs | ruby
        String result1 = list.stream().map(lang -> lang).collect(Collectors.joining(" | "));
        out.println(result1);

        List<Game> listGame = Arrays.asList(
                new Game("Dragon Blaze", 5),
                new Game("Angry Bird", 5),
                new Game("Candy Crush", 5)
        );

        //{Dragon Blaze, Angry Bird, Candy Crush}
        String result3 = listGame.stream().map(x -> x.getName())
                .collect(Collectors.joining(", ", "{", "}"));
        out.println(result3);

    }
    static class Game{
        String name;
        int ranking;

        public Game(String name, int ranking) {
            this.name = name;
            this.ranking = ranking;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRanking() {
            return ranking;
        }

        public void setRanking(int ranking) {
            this.ranking = ranking;
        }
    }
}
