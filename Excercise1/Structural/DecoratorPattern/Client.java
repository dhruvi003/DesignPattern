package Excercise1.Structural.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        TextComponent plainText = new PlainText("Hello, World!");

        // Applying Bold
        TextComponent boldText = new BoldDecorator(plainText);
        System.out.println(boldText.format());

        // Applying Italic
        TextComponent italicText = new ItalicDecorator(plainText);
        System.out.println(italicText.format());

        // Applying Bold and Italic
        TextComponent boldItalicText = new BoldDecorator(new ItalicDecorator(plainText));
        System.out.println(boldItalicText.format());

        // Applying Underline
        TextComponent underlineText = new UnderlineDecorator(plainText);
        System.out.println(underlineText.format());

        // Applying Bold, Italic, and Underline
        TextComponent allFormats = new BoldDecorator(new ItalicDecorator(new UnderlineDecorator(plainText)));
        System.out.println(allFormats.format());
    }
}
