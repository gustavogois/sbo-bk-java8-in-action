package gois.study.sbobkjava8inaction.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Apple {

    private int weight = 0;
    private String color = "";

    public Integer getWeight() {
        return weight;
    }

    public Apple(int weight) {
        this.weight = weight;
    }
}
