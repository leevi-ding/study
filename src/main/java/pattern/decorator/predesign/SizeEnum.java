package pattern.decorator.predesign;

import lombok.Getter;

public enum SizeEnum {
    jorum(0.3),
    medium(0.2),
    cuvette(0);

    @Getter
    private double value;

    SizeEnum(double value) {
        this.value = value;
    }
}
