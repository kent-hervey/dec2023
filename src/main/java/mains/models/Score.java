package mains.models;

import java.util.Objects;

public class Score<I extends Number> {

    Integer total;

    public Score(Integer total) {
        this.total = total;
                
    }

    public Integer getTotal() {
        return total;
    }

    public Integer setTotal(Integer total) {
        this.total = total;
        return this.total;
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score<Number> score = (Score<Number>) o;
        return Objects.equals(total, score.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total);
    }

    @Override
    public String toString() {
        return "Score{" +
                "total=" + total +
                '}';
    }
}
