package Excercise1.Structural.DecoratorPattern;

public class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(TextComponent textComponent) {
        super(textComponent);
    }

    @Override
    public String format() {
        return "<i>" + super.format() + "</i>";
    }
}

