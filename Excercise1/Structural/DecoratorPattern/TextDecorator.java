package Excercise1.Structural.DecoratorPattern;

public abstract class TextDecorator implements TextComponent {
    protected TextComponent textComponent;

    public TextDecorator(TextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public String format() {
        return textComponent.format();
    }
}
