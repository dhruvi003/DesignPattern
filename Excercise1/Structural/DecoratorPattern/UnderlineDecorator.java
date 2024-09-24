package Excercise1.Structural.DecoratorPattern;

public class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String format() {
        return "<u>" + super.format() + "</u>";
    }
}
