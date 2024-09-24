package Excercise1.Structural.DecoratorPattern;

public class BoldDecorator extends TextDecorator {
    public BoldDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String format() {
        return "<b>" + super.format() + "</b>";
    }
}
